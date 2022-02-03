package com.app.JUnitEx;

public  class Test {
 
    public char determainLetterGrade(int numberGrade){
        if(numberGrade < 0){
            throw new IllegalArgumentException("Number grade must be greater than 0");
        }
        if(numberGrade >= 90){
            return 'A';
        }
        if(numberGrade >= 80){
            return 'B';
        }
        if(numberGrade >= 70){
            return 'C';
        }
        if(numberGrade >= 60){
            return 'D';
        }
        return 'F';
    }
    
}
