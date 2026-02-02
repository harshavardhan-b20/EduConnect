package com.edutech.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.edutech.progressive.dao.TeacherDAO;
import com.edutech.progressive.entity.Teacher;

public class TeacherServiceImplJdbc  {
    private TeacherDAO teacherDAO;
public List<Teacher> getAllTeachers(){
    return new ArrayList<>();
}
public Teacher getTeacherById(int teacherId){
    return null;
}
public Integer addTeacher(Teacher teacher){
    return -1;
}
public List<Teacher> getAllTeachersSortedByName(){
    return new ArrayList<>();
}

public void deleteTeacher(int teacherId){
    
}
}