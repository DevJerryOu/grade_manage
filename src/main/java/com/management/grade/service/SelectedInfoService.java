package com.management.grade.service;

import com.management.grade.model.SelectedInfo;

public interface SelectedInfoService {
    SelectedInfo getSelectedInfoById(int id); //通过"选择"实体本身的id来获取"选择"实体

    boolean insertNewSelectedInfo(SelectedInfo selectedInfo);
}
