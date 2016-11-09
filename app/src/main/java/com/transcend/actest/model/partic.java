package com.transcend.actest.model;

import android.widget.Toast;

import com.transcend.actest.bean.AsParticipant;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class partic implements parmodel {

    String y;
    @Override
    public String parsignup(String uname,String pw,String parStuNumber, String parName, String parCollegeCode, String parGrade, String parTelNumber) {
        AsParticipant par = new AsParticipant();
        par.setUsername(uname);
        par.setPassword(pw);
        par.setParStuNumber(parStuNumber);
        par.setParName(parName);
        par.setParCollegeCode(parCollegeCode);
        par.setParGrade(parGrade);
        par.setParTelNumber(parTelNumber);
        par.signUp(new SaveListener<AsParticipant>() {
            @Override
            public void done(AsParticipant asParticipant, BmobException e) {
                if(e==null){
                    //注册成功
                    y="success";
                }else{
                    //注册失败
                    y="failure";
                }
            }
        });
        return  y;
    }


}
