package ru.tsypaev.patterns.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqlBuilderTest {

    @Test
    void makeCorrectQueryWithoutWhereCondition() {
        SQL.QueryBuilder sqlBuild = new SQL.QueryBuilder()
                .select("id", "customer")
                .from("payment");
        assertEquals(sqlBuild.toString(), "SELECT id, customer FROM payment");
    }

    @Test
    void makeCorrectQueryWithWhereCondition() {
        SQL.QueryBuilder sqlBuild = new SQL.QueryBuilder()
                .select("id", "customer")
                .from("payment")
                .where("age", ">", "18")
                .where("weight", "<=", "80")
                .where("height", "=", "176");
        assertEquals(sqlBuild.toString(), "SELECT id, customer FROM payment WHERE age>18 AND weight<=80 AND height=176");
    }
}