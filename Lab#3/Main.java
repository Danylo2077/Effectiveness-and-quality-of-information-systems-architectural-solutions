public class Main {
    public static void main(String[] args) {
        // Приклад PostgreSQL
        QueryBuilder pgBuilder = new PostgresQueryBuilder();
        String postgresQuery = pgBuilder.select("users", new String[]{"id", "name", "email"})
                                        .where("age", ">", "18")
                                        .limit(10)
                                        .getSQL();
        
        System.out.println("PostgreSQL запит сформовано.");

        // Приклад MySQL
        QueryBuilder mysqlBuilder = new MySQLQueryBuilder();
        String mysqlQuery = mysqlBuilder.select("users", new String[]{"id", "name", "email"})
                                        .where("age", ">", "18")
                                        .limit(10)
                                        .getSQL();
                                        
        System.out.println("MySQL запит сформовано.");
    }
}