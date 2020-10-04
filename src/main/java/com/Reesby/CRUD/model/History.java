package com.Reesby.CRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class History {
    @Id
    @Column
    private String historyId;
    @Column
    private String jobTitle;
    @Column
    private String jobCompany;
    @Column
    private String startDate;
    @Column
    private String finishDate;

    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }
}
