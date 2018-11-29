package com.example.igorkorovchenko.textviewtest;

import android.app.LauncherActivity;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private ArrayList<CourseModel> courseList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inflateCourseList();
        this.listView = findViewById(R.id.listView);
        CourseListAdapter adapter = new CourseListAdapter(this, this.courseList);
        this.listView.setAdapter(adapter);

    }

    private void inflateCourseList() {
        this.courseList.add(new CourseModel("Программирование", "/res/coding.png", 75));
        this.courseList.add(new CourseModel("Инженерная и компьютерная графика", "/res/graphics.png", 25));
    }
}
