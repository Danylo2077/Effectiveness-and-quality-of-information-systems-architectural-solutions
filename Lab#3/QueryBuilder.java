public interface QueryBuilder {
    QueryBuilder select(String table, String[] fields);
    QueryBuilder where(String field, String operator, String value);
    QueryBuilder limit(int value);
    String getSQL();
}