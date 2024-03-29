package com.kodilla.jdbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {

//    @BeforeEach
//    void show(){
//        System.out.println("New test");
//    }
//
//    @Test
//    void testConnect() throws SQLException {
//        //Given
//        //When
//        DbManager dbManager = DbManager.getInstance();
//        //Then
//        assertNotNull(dbManager.getConnection());
//        System.out.println("connected");
//    }
//
//    @Test
//    void testSelectUsers() throws SQLException {
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        //When
//        String sglQuery = "SELECT * FROM USERS";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sglQuery);
//        //Then
//        int counter = 0;
//        while(rs.next()){
//            System.out.println(rs.getInt("ID")
//                    + ", "+ rs.getString("FIRSTNAME")
//                    + ", "+ rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        assertEquals(9,counter);
//    }
//
//    @Test
//    void testSelectUsersAndPosts() throws SQLException{
//        //Given
//        DbManager dbManager = DbManager.getInstance();
//        //When
//        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME \n" +
//                " FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID \n" +
//                "GROUP BY P.USER_ID \n " +
//                "HAVING COUNT(*) >= 2";
//        Statement statement = dbManager.getConnection().createStatement();
//        ResultSet rs = statement.executeQuery(sqlQuery);
//        int counter = 0;
//        while(rs.next()){
//            System.out.println(rs.getString("FIRSTNAME")
//                    + ", " + rs.getString("LASTNAME"));
//            counter++;
//        }
//        rs.close();
//        statement.close();
//        assertEquals(3, counter);
//    }
}
