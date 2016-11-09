package com.transcend.actest.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by X on 2016/11/6.
 */

public class stu extends BmobObject {
    private String sno;
    private String sname;
    private String psw;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
