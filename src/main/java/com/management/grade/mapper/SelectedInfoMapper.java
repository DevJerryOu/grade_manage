package com.management.grade.mapper;

import com.management.grade.model.SelectedInfo;

public interface SelectedInfoMapper {
    int deleteByPrimaryKey(Integer selectedId);

    int insert(SelectedInfo record);

    int insertSelective(SelectedInfo record);

    SelectedInfo selectByPrimaryKey(Integer selectedId);

    int updateByPrimaryKeySelective(SelectedInfo record);

    int updateByPrimaryKey(SelectedInfo record);
}