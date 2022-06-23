package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private final static String LISTNAME = "Task1";
    private final static String DESCRIPTION = "Clean all windows in a house";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTask = taskListDao.findByListName(LISTNAME);
        //Then
        Assertions.assertEquals(1,readTask.size());
        //CleanUp
        taskListDao.delete(taskList);
    }
}
