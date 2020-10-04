package com.Reesby.CRUD.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Candidate {
    @Id
    @Column
    private String candidateId;
    @Column
    private String tenantId;
    @Column
    private String candidateName;
    @Column
    private String candidatePhone;
    @Column
    private String candidateEmail;
    @ElementCollection
    private List<String> candidateSkill;

    @OneToMany(targetEntity = Education.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "candidate_id",referencedColumnName = "candidateId")
    private Set<Education> educations = new HashSet<>();

    @OneToMany(targetEntity = History.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "candidate_id",referencedColumnName = "candidateId")
    private Set<History> histories = new HashSet<>();

    public Set<History> getHistories() {
        return histories;
    }

    public void setHistories(Set<History> histories) {
        this.histories = histories;
    }

    public Set<Education> getEducations() {
        return educations;
    }

    public void setEducations(Set<Education> educations) {
        this.educations = educations;
    }

    public List<String> getCandidateSkill() {
        return candidateSkill;
    }

    public void setCandidateSkill(List<String> candidateSkill) {
        this.candidateSkill = candidateSkill;
    }


    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidatePhone() {
        return candidatePhone;
    }

    public void setCandidatePhone(String candidatePhone) {
        this.candidatePhone = candidatePhone;
    }

    public String getCandidateEmail() {
        return candidateEmail;
    }

    public void setCandidateEmail(String candidateEmail) {
        this.candidateEmail = candidateEmail;
    }
}

