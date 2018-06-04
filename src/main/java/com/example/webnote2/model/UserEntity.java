package com.example.webnote2.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "simple_web_note", catalog = "")
public class UserEntity {
    private String username;
    private String userpassword;
    private String usertype;
    private String useremail;
    private String userphone;
    private int userid;

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "userpassword")
    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Basic
    @Column(name = "usertype")
    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    @Basic
    @Column(name = "useremail")
    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    @Basic
    @Column(name = "userphone")
    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return userid == that.userid &&
                Objects.equals(username, that.username) &&
                Objects.equals(userpassword, that.userpassword) &&
                Objects.equals(usertype, that.usertype) &&
                Objects.equals(useremail, that.useremail) &&
                Objects.equals(userphone, that.userphone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, userpassword, usertype, useremail, userphone, userid);
    }
}
