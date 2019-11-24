package com.management.grade.model;

public class Grade {
    private Integer selectedClassId;

    private Long dailyGrade;

    private Long finalGrade;

    private Integer status;

    public Integer getSelectedClassId() {
        return selectedClassId;
    }

    public void setSelectedClassId(Integer selectedClassId) {
        this.selectedClassId = selectedClassId;
    }

    public Long getDailyGrade() {
        return dailyGrade;
    }

    public void setDailyGrade(Long dailyGrade) {
        this.dailyGrade = dailyGrade;
    }

    public Long getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Long finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}