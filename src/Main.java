//import all utilities
import java.util.*;
public class Main {
    public static void main(String[] args) {

        //establish variables for student 1
        String fName1, lName1;
        int score1A, score1B, score1C;
        String course1A, course1B, course1C;

        //establish variables for student 2
        String fName2, lName2;
        int score2A, score2B, score2C;
        String course2A, course2B, course2C;

        //establish variables for student 3
        String fName3, lName3;
        int score3A, score3B, score3C;
        String course3A, course3B, course3C;

        //create scanner Scan
        Scanner Scan = new Scanner(System.in);


        //set student 1 first name
        System.out.println("What is the first Student's first name?");
        fName1 = Scan.next();
        //set student 1 last name
        System.out.println("What is the first Student's last name?");
        lName1 = Scan.next();
        //set course names
        System.out.println("What are " + fName1 + "'s courses?");
        course1A = Scan.next();
        course1B = Scan.next();
        course1C = Scan.next();
        //set score for test 1A
        System.out.println("What did " + fName1 + " score on their " + course1A + " test?");
        score1A = Scan.nextInt();
        //set score for test 1B
        System.out.println("What did " + fName1 + " score on their " + course1B + " test?");
        score1B = Scan.nextInt();
        //set score for test 1C
        System.out.println("What did " + fName1 + " score on their " + course1C + " test?");
        score1C = Scan.nextInt();
        //establish class student variable using values set
        Student Name1 = new Student(fName1, lName1, score1A, score1B, score1C);
        //printout student class
        System.out.println(Name1);
        //average student 1 test scores
        System.out.println("This gives " + fName1 + " an average of " + ((score1A + score1B + score1C) / 3) + " on their tests.");
        System.out.println();

        //set student 2 first name
        System.out.println("What is the second Student's first name?");
        fName2 = Scan.next();
        //set student 2 last name
        System.out.println("What is the second Student's last name?");
        lName2 = Scan.next();
        //set course names
        System.out.println("What are " + fName2 + "'s courses?");
        course2A = Scan.next();
        course2B = Scan.next();
        course2C = Scan.next();
        //set score for test 2A
        System.out.println("What did " + fName2 + " score on their " + course2A + " test?");
        score2A = Scan.nextInt();
        //set score for test 2B
        System.out.println("What did " + fName2 + " score on their " + course2B + " test?");
        score2B = Scan.nextInt();
        //set score for test 2C
        System.out.println("What did " + fName2 + " score on their " + course2C + " test?");
        score2C = Scan.nextInt();
        //establish class student variable using values set
        Student Name2 = new Student(fName2, lName2, score2A, score2B, score2C);
        //printout student class
        System.out.println(Name2);
        //average student 2 test scores
        System.out.println("This gives " + fName2 + " an average of " + ((score2A + score2B + score2C) / 3) + " on their tests.");
        System.out.println();

        //set student 3 first name
        System.out.println("What is the third Student's first name?");
        fName3 = Scan.next();
        //set student 3 last name
        System.out.println("What is the third Student's last name?");
        lName3 = Scan.next();
        //set course names
        System.out.println("What are " + fName3 + "'s courses?");
        course3A = Scan.next();
        course3B = Scan.next();
        course3C = Scan.next();
        //set score for test 3A
        System.out.println("What did " + fName3 + " score on their " + course3A + " test?");
        score3A = Scan.nextInt();
        //set score for test 3B
        System.out.println("What did " + fName3 + " score on their " + course3B + " test?");
        score3B = Scan.nextInt();
        //set score for test 3C
        System.out.println("What did " + fName3 + " score on their " + course3C + " test?");
        score3C = Scan.nextInt();
        //establish class student variable using values set
        Student Name3 = new Student(fName3, lName3, score3A, score3B, score3C);
        //printout student class
        System.out.println(Name3);
        //average student 3 test scores
        System.out.println("This gives " + fName3 + " an average of " + ((score3A + score3B + score3C) / 3) + " on their tests.");
        System.out.println();
    }
}

//create class Student
class Student {
    //create private variables for the class
    private String firstName, lastName;
    private int testScoreA, testScoreB, testScoreC;

    //set variables equal to place holder
    public Student() {
        firstName = "";
        lastName = "";
        testScoreA = 0;
    }

    //create public variables for private variables
    public Student(String first, String last, int inScoreA, int inScoreB, int inScoreC) {
        firstName = first;
        lastName = last;
        testScoreA = inScoreA;
        testScoreB = inScoreB;
        testScoreC = inScoreC;
    }

    //create getters and setters for test scores
    public void setScoreA(int inScoreA){
        testScoreA = inScoreA;
    }
    public int getScoreA(){
        return testScoreA;
    }
    public void setScoreB(int inScoreB){
        testScoreB = inScoreB;
    }
    public int getScoreB(){
        return testScoreA;
    }
    public void setScoreC(int inScoreC){
        testScoreC = inScoreC;
    }
    public int getScoreC(){
        return testScoreC;
    }

    //set the class string
    public String toString() {
        String result;
        result = firstName + " " + lastName + " scored a " + testScoreA + " on the first test, a " + testScoreB + " on the second test, and a " + testScoreC + " on the third test.";
        return result;
    }
}
