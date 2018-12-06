package ru.tsypaev.patterns.builder;

import java.util.Arrays;

class SQL {

    static class QueryBuilder {

        private String[] rows;
        private String[] table;
        private String sign;
        private String row;
        private String value;

        public QueryBuilder select(String... select) {
            this.rows = select;
            return this;
        }

        public QueryBuilder from(String... from) {
            this.table = from;
            return this;
        }

        public QueryBuilder where(String where, String parameter, String sign) {
            this.row = where;
            this.value = parameter;
            this.sign = sign;
            return this;
        }

        @Override
        public String toString() {
            if (row != null) {
                return  "SELECT " + getArrayString(rows) +
                        " FROM " + getArrayString(table) +
                        " WHERE " + row + sign + value;
            } else {
                return "SELECT " + getArrayString(rows) +
                        " FROM " + getArrayString(table);
            }
        }

        private String getArrayString(String[] array) {
            return Arrays.toString(array).replaceAll("[\\[\\]]","");
        }
    }
}
