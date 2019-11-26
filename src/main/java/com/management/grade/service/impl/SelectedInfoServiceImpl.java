package com.management.grade.service.impl;

import com.management.grade.mapper.SelectedInfoMapper;
import com.management.grade.model.SelectedInfo;
import com.management.grade.service.SelectedInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.processing.SupportedSourceVersion;

@Service
public class SelectedInfoServiceImpl implements SelectedInfoService{
    @Resource
    private SelectedInfoMapper selectedInfoMapper;

    @Override
    public SelectedInfo getSelectedInfoById(int id) {  // 只能通过id来获取选择关系
        return SelectedInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean insertNewSelectedInfo(SelectedInfo selectedInfo) {
        boolean flag = false;
        try{
            SelectedInfoMapper.insert(selectedInfo);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
