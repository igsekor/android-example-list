package com.example.igorkorovchenko.textviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class CourseListAdapter extends ArrayAdapter<CourseModel> {

    public CourseListAdapter(Context context, List<CourseModel> objects) {
        super(context, R.layout.course_list_item, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CourseModel model = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.course_list_item, parent, false);
        }
        ImageView image = convertView.findViewById(R.id.course_image);
        TextView name = convertView.findViewById(R.id.course_name);
        ProgressBar progress = convertView.findViewById(R.id.course_progress);
        assert model != null;
        name.setText(model.getCourseName());
        progress.setProgress(model.getProgress());
        return convertView;
    }
}
