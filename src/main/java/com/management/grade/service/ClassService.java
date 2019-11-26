package com.management.grade.service;

import com.management.grade.model.Class;

public interface ClassService {
    Class getClassById(int id);

    boolean insertNewClass(Class class1);
}
