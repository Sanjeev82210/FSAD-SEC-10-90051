# trainingdb1

Spring Boot application demonstrating a JPA entity named `trainingdb1`, seeded records, sorting, and pagination.

## Run

```bash
mvn spring-boot:run
```

## Endpoints

- `POST /trainingdb1` - insert a record
- `GET /trainingdb1` - list all records
- `GET /trainingdb1/sorted?sortBy=name&direction=asc` - sort records
- `GET /trainingdb1/page?page=0&size=2` - paginate records

## H2 Console

- URL: `/h2-console`
- JDBC URL: `jdbc:h2:mem:trainingdb1db`
- Username: `sa`
- Password: empty
