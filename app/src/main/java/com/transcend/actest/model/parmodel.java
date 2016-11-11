package com.transcend.actest.model;

import cn.bmob.v3.exception.BmobException;

/**
 * 参与者接口
 * Created by X on 2016/11/8.
 */

public interface parmodel{
    //注册：输入用户名（手机号）、密码、学号、姓名、学院代码、年级；返回BmobException
    BmobException parsignup(String uname, String pw, String parStuNumber, String parName, String parCollegeCode, String parGrade);

    //登录：输入用户名（手机号）、密码
    BmobException parsignin(String username,String password);
}
