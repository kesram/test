package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();
        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int a = 4;
        int b = 6;
        System.out.println(calculator.add(a,b));
        System.out.println(calculator.subtract(a, b));

        if(a+b == 10)
            System.out.println("jest OK");
         else
            System.out.println("error");

        if(a-b == -2)
            System.out.println("jest OK");
        else
            System.out.println("error");
    }
}
