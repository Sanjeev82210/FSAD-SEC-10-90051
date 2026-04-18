package com.fsad.employee.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fsad.employee.hql.entity.Appointment;
import com.fsad.employee.hql.entity.Patient;

public class AppointmentHqlQueries {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Patient.class)
                .addAnnotatedClass(Appointment.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();


        try {
            session.beginTransaction();

            // ==============================
            // 1. SORT BY consultationFee ASC
            // ==============================
            List<Appointment> ascFee = session
                    .createQuery("from Appointment order by consultationFee asc", Appointment.class)
                    .getResultList();

            System.out.println("\n--- Sorted by Fee (ASC) ---");
            ascFee.forEach(a ->
                    System.out.println(a.getDoctorName() + " : " + a.getConsultationFee()));

            // ==============================
            // 2. SORT BY consultationFee DESC
            // ==============================
            List<Appointment> descFee = session
                    .createQuery("from Appointment order by consultationFee desc", Appointment.class)
                    .getResultList();

            System.out.println("\n--- Sorted by Fee (DESC) ---");
            descFee.forEach(a ->
                    System.out.println(a.getDoctorName() + " : " + a.getConsultationFee()));

            // ==============================
            // 3. SORT BY appointmentDate (latest first)
            // ==============================
            List<Appointment> dateSort = session
                    .createQuery("from Appointment order by appointmentDate desc", Appointment.class)
                    .getResultList();

            System.out.println("\n--- Sorted by Appointment Date ---");
            dateSort.forEach(a ->
                    System.out.println(a.getDoctorName() + " : " + a.getAppointmentDate()));

            // ==============================
            // 4. PAGINATION
            // ==============================
            List<Appointment> first3 = session
                    .createQuery("from Appointment", Appointment.class)
                    .setFirstResult(0)
                    .setMaxResults(3)
                    .getResultList();

            System.out.println("\n--- First 3 Appointments ---");
            first3.forEach(a -> System.out.println(a.getDoctorName()));

            List<Appointment> next3 = session
                    .createQuery("from Appointment", Appointment.class)
                    .setFirstResult(3)
                    .setMaxResults(3)
                    .getResultList();

            System.out.println("\n--- Next 3 Appointments ---");
            next3.forEach(a -> System.out.println(a.getDoctorName()));

            // ==============================
            // 5. AGGREGATE FUNCTIONS
            // ==============================
            Long patientCount = session
                    .createQuery("select count(p) from Patient p", Long.class)
                    .getSingleResult();

            System.out.println("\nTotal Patients: " + patientCount);

            Long appointmentCount = session
                    .createQuery("select count(a) from Appointment a", Long.class)
                    .getSingleResult();

            System.out.println("Total Appointments: " + appointmentCount);

            Object[] minMax = session
                    .createQuery("select min(consultationFee), max(consultationFee) from Appointment",
                            Object[].class)
                    .getSingleResult();

            System.out.println("Min Fee: " + minMax[0]);
            System.out.println("Max Fee: " + minMax[1]);

            // ==============================
            // 6. GROUP BY department
            // ==============================
            List<Object[]> groupByDept = session
                    .createQuery(
                            "select department, count(*) from Appointment group by department",
                            Object[].class)
                    .getResultList();

            System.out.println("\n--- Appointments per Department ---");
            for (Object[] row : groupByDept) {
                System.out.println(row[0] + " : " + row[1]);
            }

            // ==============================
            // 7. WHERE (Fee range)
            // ==============================
            List<Appointment> feeRange = session
                    .createQuery(
                            "from Appointment where consultationFee between 500 and 1500",
                            Appointment.class)
                    .getResultList();

            System.out.println("\n--- Fee between 500 and 1500 ---");
            feeRange.forEach(a ->
                    System.out.println(a.getDoctorName() + " : " + a.getConsultationFee()));

            // ==============================
            // 8. LIKE Queries on Patient
            // ==============================
            List<Patient> startsWith = session
                    .createQuery("from Patient where patientName like 'A%'", Patient.class)
                    .getResultList();

            System.out.println("\nPatients starting with A:");
            startsWith.forEach(p -> System.out.println(p.getPatientName()));

            List<Patient> contains = session
                    .createQuery("from Patient where patientName like '%an%'", Patient.class)
                    .getResultList();

            System.out.println("\nPatients containing 'an':");
            contains.forEach(p -> System.out.println(p.getPatientName()));

            List<Patient> length8 = session
                    .createQuery("from Patient where length(patientName) = 8", Patient.class)
                    .getResultList();

            System.out.println("\nPatients with name length 8:");
            length8.forEach(p -> System.out.println(p.getPatientName()));

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
