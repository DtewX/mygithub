package com.transcend.actest.model;

import cn.bmob.v3.exception.BmobException;

/**
 * Created by X on 2016/11/8.
 */

public interface parmodel{
    BmobException parsignup(String uname, String pw, String parStuNumber, String parName, String parCollegeCode, String parGrade, String parTelNumber);
    //void parsignin(String identity,String usrname,String password);
}
