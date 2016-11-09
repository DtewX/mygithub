package com.transcend.actest.bean;

import cn.bmob.v3.BmobUser;

/**
 * Created by X on 2016/11/9.
 */

public class AsAdministrator extends BmobUser {
    private String adminPassword;
    private String adminUserName;

    public String getAdminPassword(){
        return adminPassword;
    }
    public String getAdminUserName(){
        return adminUserName;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }


}
