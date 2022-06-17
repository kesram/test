package com.kodilla.patterns.prototype;

import java.util.*;

public class Board extends Prototype<Board>{
    private  String name;
    private Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        return "Board{" +
                "name='" + name + '\'' +
                ", lists=" + lists +
                '}';
    }

    public Board shallowCoppy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = super.clone();
        clonedBoard.lists = new HashSet<>();
        TaskList clonedList = null;
        for (TaskList theList : lists) {
            clonedList = new TaskList(theList.getName());
            for (Task task : theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(name, board.name) && Objects.equals(lists, board.lists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lists);
    }
}
