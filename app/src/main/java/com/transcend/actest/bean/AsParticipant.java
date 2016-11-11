package com.transcend.actest.bean;


import java.util.List;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * 参与者
 * Created by X on 2016/11/8.
 */

public class AsParticipant extends BmobUser {
    private BmobFile parHeadPortrait;//头像
    private List<String> parAcId;//报名的活动的编号
    //private String parTelNumber;//参与者手机号（多余）
    private String parStuNumber;//学号
    //private String parPassword;//密码（多余）
    private String parName;//姓名
    private String parGrade;//年级
    private String parGender;//性别
    private String parCollegeCode;//学院代号
    private String parCollege;//学院
    private String parAge;//年龄
    private List<String> parAcIdEnd;//历史参与活动编号
    //private String parUserName;//用户名（已用手机号作为用户名，多余）


    public cn.bmob.v3.datatype.BmobFile getParHeadPortrait() {
       return parHeadPortrait;
    }
    public void setParHeadPortrait(BmobFile parHeadPortrait) {
        this.parHeadPortrait = parHeadPortrait;
    }

    public List<String> getParAcId() {
        return parAcId;
    }
    public void setParAcId(List<String> parAcId) {
        this.parAcId = parAcId;
    }

    public String getParAge() {
        return parAge;
    }
    public void setParAge(String parAge) {
        this.parAge = parAge;
    }

    public List<String> getParAcIdEnd() {
       return parAcIdEnd;
    }
    public void setParAcIdEnd(List<String> parAcIdEnd) {
        this.parAcIdEnd = parAcIdEnd;
    }

    public String getParCollege() {
        return parCollege;
    }
    public void setParCollege(String parCollege) {
        this.parCollege = parCollege;
    }

    public String getParCollegeCode() {
        return parCollegeCode;
    }
    public void setParCollegeCode(String parCollegeCode) {
        this.parCollegeCode = parCollegeCode;
    }

    public String getParGender() {
        return parGender;
    }
    public void setParGender(String parGender) {
        this.parGender = parGender;
    }

    public String getParGrade() {
        return parGrade;
    }
    public void setParGrade(String parGrade) {
        this.parGrade = parGrade;
    }

    public String getParName() {
        return parName;
    }
    public void setParName(String parName) {
        this.parName = parName;
    }

    //public String getParPassword() {
       // return parPassword;
    //}
    //public void setParPassword(String parPassword) {
        //this.parPassword = parPassword;
    //}

    public String getParStuNumber() {
        return parStuNumber;
    }
    public void setParStuNumber(String parStuNumber) {
        this.parStuNumber = parStuNumber;
    }

    //public String getParTelNumber() {
        //return parTelNumber;
    //}
    //public void setParTelNumber(String parTelNumber) {
        //this.parTelNumber = parTelNumber;
    //}

    //public String getParUserName() {
        //return parUserName;
    //}
    //public void setParUserName(String parUserName) {
        //this.parUserName = parUserName;
    //}

}

