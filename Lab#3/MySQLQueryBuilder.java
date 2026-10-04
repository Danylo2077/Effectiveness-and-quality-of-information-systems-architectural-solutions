public class MySQLQueryBuilder implements QueryBuilder {
    @Override
    public QueryBuilder select(String table, String[] fields) {
        return this;
    }

    @Override
    public QueryBuilder where(String field, String operator, String value) {
        return this;
    }

    @Override
    public QueryBuilder limit(int value) {
        return this;
    }

    @Override
    public String getSQL() {
        return "";
    }
}