package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import static java.lang.Character.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);
//
//        System.out.println("calculating expressions with lambdas");
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(10, 5, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ala",text -> text.toUpperCase());
        poemBeautifier.beautify("gnieszka",text -> "A" + text);
        poemBeautifier.beautify("PIES",text -> text.toLowerCase());
        poemBeautifier.beautify("    Kasia",text -> text.trim());
        poemBeautifier.beautify("Kinga, a, b, c",text -> text.join("/", "Kinga", "a", "b", "c"));
    }
}
