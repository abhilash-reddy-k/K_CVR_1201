package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        //You may test that your code works find here
        //Please check that your code works and has no
        //compilation problems before to submit
        SimpleDateFormat date = new SimpleDateFormat();
        Date d1 = new Date(1996,12,10);
        Date d2 = new Date(1997,11,19);
        Date d3 = new Date(1998,12,22);
        StudentGroup sg =new StudentGroup(3);
        Student s1 = new Student(1, "A", d1 , 72.45);
        Student s2 = new Student(2, "B", d2 , 75.45);
        Student s3 = new Student(3, "C", d3 , 70.45);
        sg.addFirst(s1);
        sg.addLast(s2);
        sg.add(s3,1);
        System.out.println(sg.getStudent(0));
        sg.remove(0);
        //System.out.println(sg.getByBirthDate(d2));
    }

}