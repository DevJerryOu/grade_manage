package com.management.grade.service;

import com.management.grade.model.Grade;

public interface GradeService {
    Grade getGradeBySelectedClassId(int id);  //通过"选择"实体的id来获取成绩

    boolean insertNewGrade(Grade grade);
}
