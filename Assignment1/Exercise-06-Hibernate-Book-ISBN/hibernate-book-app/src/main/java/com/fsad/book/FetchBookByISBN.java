package com.fsad.book;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fsad.util.HibernateUtil;

public class FetchBookByISBN {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // Fetch book using ISBN
        Book book = session.get(Book.class, "ISBN001");

        if (book != null) {
            System.out.println("Book Found:");
            System.out.println("ISBN   : " + book.getIsbn());
            System.out.println("Title  : " + book.getTitle());
            System.out.println("Author : " + book.getAuthor());
            System.out.println("Price  : " + book.getPrice());
        } else {
            System.out.println("Book not found with given ISBN");
        }

        tx.commit();
        session.close();
    }
}
