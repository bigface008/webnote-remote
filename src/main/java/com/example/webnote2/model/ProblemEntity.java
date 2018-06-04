package com.example.webnote2.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "problem", schema = "simple_web_note", catalog = "")
public class ProblemEntity {
    private int problemid;
    private String problemname;
    private Integer userid;
    private String description;
    private String reason;
    private String subject;
    private String semester;
    private String adddate;
    private String latesteditdate;
    private Integer redotimes;
    private String answer;
    private String tags;

    @Id
    @Column(name = "problemid")
    public int getProblemid() {
        return problemid;
    }

    public void setProblemid(int problemid) {
        this.problemid = problemid;
    }

    @Basic
    @Column(name = "problemname")
    public String getProblemname() {
        return problemname;
    }

    public void setProblemname(String problemname) {
        this.problemname = problemname;
    }

    @Basic
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "semester")
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "adddate")
    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate;
    }

    @Basic
    @Column(name = "latesteditdate")
    public String getLatesteditdate() {
        return latesteditdate;
    }

    public void setLatesteditdate(String latesteditdate) {
        this.latesteditdate = latesteditdate;
    }

    @Basic
    @Column(name = "redotimes")
    public Integer getRedotimes() {
        return redotimes;
    }

    public void setRedotimes(Integer redotimes) {
        this.redotimes = redotimes;
    }

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProblemEntity that = (ProblemEntity) o;
        return problemid == that.problemid &&
                Objects.equals(problemname, that.problemname) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(description, that.description) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(adddate, that.adddate) &&
                Objects.equals(latesteditdate, that.latesteditdate) &&
                Objects.equals(redotimes, that.redotimes) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(tags, that.tags);
    }

    @Override
    public int hashCode() {

        return Objects.hash(problemid, problemname, userid, description, reason, subject, semester, adddate, latesteditdate, redotimes, answer, tags);
    }
}
