package com.management.grade.mapper;

import com.management.grade.model.Grade;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer selectedClassId);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(Integer selectedClassId);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}