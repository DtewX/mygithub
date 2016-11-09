package com.transcend.actest.bean;


import java.util.List;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by X on 2016/11/8.
 */

public class AsParticipant extends BmobUser {
    private BmobFile parHeadPortrait;
    private List<String> parAcId;
    private String parTelNumber;
    private String parStuNumber;
    private String parPassword;
    private String parName;
    private String parGrade;
    private String parGender;
    private String parCollegeCode;
    private String parCollege;
    private String parAge;
    private List<String> parAcIdEnd;
    private String parUserName;


    public cn.bmob.v3.datatype.BmobFile getParHeadPortrait() {
       return parHeadPortrait;
    }

    public List<String> getParAcId() {
        return parAcId;
    }

    public String getParAge() {
        return parAge;
    }

    public List<String> getParAcIdEnd() {
       return parAcIdEnd;
    }

    public String getParCollege() {
        return parCollege;
    }

    public String getParCollegeCode() {
        return parCollegeCode;
    }

    public String getParGender() {
        return parGender;
    }

    public String getParGrade() {
        return parGrade;
    }

    public String getParName() {
        return parName;
    }

    public String getParPassword() {
        return parPassword;
    }

    public String getParStuNumber() {
        return parStuNumber;
    }

    public String getParTelNumber() {
        return parTelNumber;
    }

    public String getParUserName() {
        return parUserName;
    }

    public void setParAcId(List<String> parAcId) {
        this.parAcId = parAcId;
    }

    public void setParCollege(String parCollege) {
        this.parCollege = parCollege;
    }

    public void setParAcIdEnd(List<String> parAcIdEnd) {
        this.parAcIdEnd = parAcIdEnd;
    }

    public void setParAge(String parAge) {
        this.parAge = parAge;
    }

    public void setParCollegeCode(String parCollegeCode) {
        this.parCollegeCode = parCollegeCode;
    }

    public void setParGender(String parGender) {
        this.parGender = parGender;
    }

    public void setParGrade(String parGrade) {
        this.parGrade = parGrade;
    }

    public void setParHeadPortrait(BmobFile parHeadPortrait) {
        this.parHeadPortrait = parHeadPortrait;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }

    public void setParPassword(String parPassword) {
        this.parPassword = parPassword;
    }

    public void setParStuNumber(String parStuNumber) {
        this.parStuNumber = parStuNumber;
    }

    public void setParTelNumber(String parTelNumber) {
        this.parTelNumber = parTelNumber;
    }

    public void setParUserName(String parUserName) {
        this.parUserName = parUserName;
    }
}
