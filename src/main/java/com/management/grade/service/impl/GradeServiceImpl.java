package com.management.grade.service.impl;

import com.management.grade.mapper.GradeMapper;
import com.management.grade.service.GradeService;
import com.management.grade.model.Grade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GradeServiceImpl implements GradeService{
    @Resource
    private GradeMapper gradeMapper;

    @Override
    public Grade getGradeBySelectedClassId(int id) {  // 只能通过id来获取成绩
        return GradeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean insertNewGrade(Grade grade) {
        boolean flag = false;
        try{
            GradeMapper.insert(grade);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
