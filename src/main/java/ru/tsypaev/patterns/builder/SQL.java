package ru.tsypaev.patterns.builder;

import java.util.ArrayList;
import java.util.Arrays;

class SQL {

    static class QueryBuilder {

        private String[] rows;
        private String[] table;

        private ArrayList whereCondition = new ArrayList();


        public QueryBuilder select(String... select) {
            this.rows = select;
            return this;
        }

        public QueryBuilder from(String... from) {
            this.table = from;
            return this;
        }

        public QueryBuilder where(String row, String sign, String value) {
            whereCondition.add(row);
            whereCondition.add(sign);
            whereCondition.add(value);
            return this;
        }

        @Override
        public String toString() {

            if (whereCondition.size() != 0) {
                return "SELECT " + getArrayString(rows) +
                        " FROM " + getArrayString(table) +
                        " WHERE " + getWhereConditionString();
            } else {
                return "SELECT " + getArrayString(rows) +
                        " FROM " + getArrayString(table);
            }
        }

        private String getWhereConditionString() {
            String[] array = (String[]) whereCondition.toArray(new String[0]);
            StringBuilder whereCondition = new StringBuilder();
            for (int i = 1; i < array.length + 1; i++) {
                if (i % 3 == 0) {
                    whereCondition.append(array[i - 1] + " AND ");
                } else {
                    whereCondition.append(array[i - 1]);
                }
            }
            whereCondition.delete(whereCondition.lastIndexOf(" AND"), whereCondition.length());
            return whereCondition.toString();
        }

        private String getArrayString(String[] array) {
            return Arrays.toString(array).replaceAll("[\\[\\]]", "");
        }
    }
}
