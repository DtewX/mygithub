package com.transcend.actest.model;



import com.transcend.actest.bean.AsAdministrator;
import com.transcend.actest.bean.AsParticipant;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class partic implements parmodel {

    private BmobException signup,signin;
    @Override
    public BmobException parsignup(String uname,String pw,String parStuNumber, String parName, String parCollegeCode, String parGrade) {
        AsParticipant par = new AsParticipant();
        par.setUsername(uname);
        par.setPassword(pw);
        par.setParStuNumber(parStuNumber);
        par.setParName(parName);
        par.setParCollegeCode(parCollegeCode);
        par.setParGrade(parGrade);
        par.signUp(new SaveListener<AsParticipant>() {
            @Override
            public void done(AsParticipant asParticipant, BmobException e) {
                if(e!=null){
                    //注册失败
                    signup=e;
                }else{
                    //注册成功
                    signup=null;
                }
            }
        });
        return  signup;
    }

    @Override
    public BmobException parsignin(String username, String password) {
        AsAdministrator par=new AsAdministrator();
        par.setUsername(username);
        par.setPassword(password);
        par.login(new SaveListener<AsAdministrator>() {
            @Override
            public void done(AsAdministrator asAdministrator, BmobException e) {
                if (e!=null){
                    //登录失败
                    signin=e;
                }else{
                    //登录成功
                    signin=null;
                }
            }
        });
        return signin;
    }


}
