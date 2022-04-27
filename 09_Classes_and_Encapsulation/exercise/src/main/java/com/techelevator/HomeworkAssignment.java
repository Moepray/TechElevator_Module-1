package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }
    public int getEarnedMarks() {
        return earnedMarks;
    }
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }



    public String getLetterGrade() {
        double percentage = (double) earnedMarks / possibleMarks;
        if (percentage >= .9)
            return "A";
        else if (percentage >= .8)
            return "B";
        else if (percentage >= .7)
            return "C";
        else if (percentage >= .6)
            return "D";
        else if (percentage >= .5)
            return "F";

        return letterGrade;
    }
}



