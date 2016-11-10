package com.transcend.actest.model;


import com.transcend.actest.bean.AsAdministrator;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * 管理员的功能
 * Created by X on 2016/11/9.
 */

public class admin implements adminmodel {
    private String y;
    @Override
    public String adminsignup(String adminname, String adminpw) {
        AsAdministrator adm =new AsAdministrator();
        adm.setUsername(adminname);
        adm.setPassword(adminpw);
        adm.signUp(new SaveListener<AsAdministrator>() {
            @Override
            public void done(AsAdministrator asAdministrator, BmobException e) {
                if (e==null){
                    y="success";
                }else{
                    y=e.toString();
                }
            }
        });
        return y;
    }
}
