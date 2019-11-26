package com.management.grade.service.impl;

import com.management.grade.mapper.GradeMapper;
import com.management.grade.model.Class;
import com.management.grade.service.ClassService;
import com.management.grade.mapper.ClassMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
// 怎么又不能提交pr了?加一行注释看看
// 再加一个

@Service
public class ClassServiceImpl implements ClassService {
    @Resource
    private ClassMapper classMapper;

    @Override
    public Class getClassById(int id); {  // 只能通过id来获取成绩Class getClassById(int id);
        return ClassMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean insertNewClass(Class class1){   // 用class作为形参与关键字class冲突,所以改为class1
        boolean flag = false;
        try{
            classMapper.insert(class1);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
