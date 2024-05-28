package com.techelevator;

public class HomeworkAssignment {



    //CLASS VARIABLES
   private int earnedMarks;
   private int possibleMarks;
   private String submitterName;

//GETTERS
    public int getEarnedMarks() {
        return earnedMarks;
    }
    public int getPossibleMarks() {
        return possibleMarks;
    }
    public String getSubmitterName() {
        return submitterName;
    }
//SETTERS
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
//Constructor
     public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }
    //Methods
    public String getLetterGrade() {
        double gradePercent = (double) this.earnedMarks / (double) this.possibleMarks;

        if (gradePercent * 100 >= 90) {
            return "A";
        } else if (gradePercent * 100 < 90 && gradePercent * 100 >= 80) {
            return "B";
        } else if (gradePercent * 100 < 80  && gradePercent * 100 >= 70) {
            return "C";
        } else if (gradePercent * 100 < 70 && gradePercent * 100 >= 60) {
            return "D";
        }
        return "F";

    }

}
