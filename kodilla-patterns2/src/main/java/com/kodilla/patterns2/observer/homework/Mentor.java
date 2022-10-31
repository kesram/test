package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String mentorName;
    private int updateMentorCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(QueueTask queueTask) {
        System.out.println(mentorName + ": New task from  " + queueTask.getStudentName() + "\n" +
                " (total: " + queueTask.getTasks().size() + " tasks to check)");
        updateMentorCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateMentorCount() {
        return updateMentorCount;
    }
}
