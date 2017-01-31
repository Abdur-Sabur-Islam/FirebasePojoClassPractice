package com.movieapps.firebasepojoclasspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    DatabaseReference myRef;
    Student student;
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Student student5;
    ArrayList<Student> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRef = FirebaseDatabase.getInstance().getReference();
        dataList = new ArrayList<>();
        student = new Student(25, "sagarmia48@gmail.com", " Md Sagar Mia");
        student1 = new Student(25, "sagarmia48@gmail.com", " Md Sagar Mia");
        student2 = new Student(25, "sagarmia48@gmail.com", " Md Sagar Mia");
        student3 = new Student(25, "sagarmia48@gmail.com", " Md Sagar Mia");
        student4 = new Student(25, "sagarmia48@gmail.com", " Md Sagar Mia");
        student5 = new Student(25, "sagarmia48@gmail.com", " Md Sagar Mia");
        dataList.add(student);
        dataList.add(student1);
        dataList.add(student2);
        dataList.add(student3);
        dataList.add(student4);
        dataList.add(student5);
        myRef.child("Student").setValue(dataList);
    }
}
