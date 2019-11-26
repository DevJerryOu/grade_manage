package com.management.grade.model;

public class SelectedInfo {
    private Integer selectedId; // 此Id是SelectInfo本身的标识,用于区分不同的Select关系

    private Integer selectUserId;

    private Integer selectClassId;

    private Integer selectTeacherId;

    public Integer getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(Integer selectedId) {
        this.selectedId = selectedId;
    }

    public Integer getSelectUserId() {
        return selectUserId;
    }

    public void setSelectUserId(Integer selectUserId) {
        this.selectUserId = selectUserId;
    }

    public Integer getSelectClassId() {
        return selectClassId;
    }

    public void setSelectClassId(Integer selectClassId) {
        this.selectClassId = selectClassId;
    }

    public Integer getSelectTeacherId() {
        return selectTeacherId;
    }

    public void setSelectTeacherId(Integer selectTeacherId) {
        this.selectTeacherId = selectTeacherId;
    }
}