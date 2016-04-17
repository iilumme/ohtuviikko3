package ohtu;

import java.util.ArrayList;

public class Submission {
    private String student_number;
    private int week;
    private int hours;

    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String a5;
    private String a6;
    private String a7;
    private String a8;
    private String a9;
    private String a10;
    private String a11;
    private String a12;
    private String a13;
    private String a14;
    private String a15;
    private String a16;
    private String a17;
    private String a18;
    private String a19;
    private String a20;
    private String a21;
    private ArrayList<String> exercises = new ArrayList<String>();

    private void getArray() {

        exercises.add(a1);
        exercises.add(a2);
        exercises.add(a3);
        exercises.add(a4);
        exercises.add(a5);
        exercises.add(a6);
        exercises.add(a7);
        exercises.add(a8);
        exercises.add(a9);
        exercises.add(a10);
        exercises.add(a11);
        exercises.add(a12);
        exercises.add(a13);
        exercises.add(a14);
        exercises.add(a15);
        exercises.add(a16);
        exercises.add(a17);
        exercises.add(a18);
        exercises.add(a19);
        exercises.add(a20);
        exercises.add(a21);
    };

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    private int numberofExercisesDone() {
        getArray();
        int n = 0;

        for (int i = 0; i < this.exercises.size(); i++) {
            if(this.exercises.get(i) != null && this.exercises.get(i).equals("true")) {
                n++;
            }
        }
        return n;
    }

    @Override
    public String toString() {

        String text = "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + numberofExercisesDone()
                + ", aikaa kului "+ hours + " tuntia, tehdyt tehtävät: ";

        for (int i = 0; i < this.exercises.size(); i++) {
            if (this.exercises.get(i) != null && this.exercises.get(i).equals("true")) {
                text += i + 1 + " ";
            }
        }
        return text;
    }
    
}