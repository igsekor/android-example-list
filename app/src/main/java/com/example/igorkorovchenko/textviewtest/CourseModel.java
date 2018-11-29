package com.example.igorkorovchenko.textviewtest;

public class CourseModel {

    private String courseName;
    private String imageFileName;
    private Integer progress;

    public CourseModel(String courseName, String imageFileName, Integer progress) {
        this.courseName = courseName;
        this.imageFileName = imageFileName;
        this.progress = progress;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}
