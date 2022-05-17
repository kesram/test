package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("toDo1");
        board.getDoneList().getTasks().add("done1");
        board.getInProgressList().getTasks().add("inProgress1");
        //Then
        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
    }
}
