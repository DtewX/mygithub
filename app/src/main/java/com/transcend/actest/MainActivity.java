package com.transcend.actest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.transcend.actest.bean.stu;
import com.transcend.actest.model.parmodel;
import com.transcend.actest.model.partic;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobSMS;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.QueryListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;


public class MainActivity extends Activity implements View.OnClickListener{

    private EditText xuehao;
    private EditText xingming;
    private EditText xueyuan;
    private EditText nianji;
    private EditText shoujihao;
    private EditText mima;
    private EditText yangzhengma;
    private parmodel part;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //初始化
        Bmob.initialize(this, "90eb55c0de63532dc261983f633ed348");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 =(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        xuehao=(EditText)findViewById(R.id.xuehao);
        xingming=(EditText)findViewById(R.id.xingming);
        xueyuan=(EditText)findViewById(R.id.xueyuan);
        nianji=(EditText)findViewById(R.id.nianji);
        shoujihao=(EditText)findViewById(R.id.shoujihao);
        mima=(EditText)findViewById(R.id.mima);
        yangzhengma=(EditText)findViewById(R.id.yanzhengma);
        part=new partic();

    }

    //toast:方便使用
    public void toast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    //往stu表中添加数据
    void stuadd(){
        stu asd;
        asd = new stu();
        asd.setSno("s12345");
        asd.setSname("asd");
        asd.setPsw("123");
        asd.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if(e==null){
                    toast("success");
                }else{
                    toast("failure");
                }
            }
        });
    }
    //参与者注册
    private void particsignup(){
        BmobException a;
        String sjh=shoujihao.getText().toString();
        String smm=mima.getText().toString();
        String sno=xuehao.getText().toString();
        String sname=xingming.getText().toString();
        String sxy=xueyuan.getText().toString();
        String nj=nianji.getText().toString();
        a=part.parsignup(sjh,smm,sno,sname,sxy,nj);
        if(a==null) {
            toast("注册成功");
        }
        else{
            toast("注册失败："+a);
        }
    }
    //发送短信验证码
    private void requestsmscode(){
        String pnum=shoujihao.getText().toString();
        String template="yztest";
        if(!TextUtils.isEmpty(pnum)){
            BmobSMS.requestSMSCode(pnum,template, new QueryListener<Integer>() {
                @Override
                public void done(Integer integer, BmobException e) {
                    if(e==null){
                        toast("验证码发送成功，短信id:"+integer);
                    }else{
                        toast("errorcode="+e.getErrorCode()+",errorMsg="+e.getLocalizedMessage());
                    }
                }
            });
        }else{
            toast("请输入手机号");
        }
    }
    //验证短信验证码,通过后执行注册
    private void verySmscode(){
        String number=shoujihao.getText().toString();
        String code=yangzhengma.getText().toString();
        if (!TextUtils.isEmpty(number)&&!TextUtils.isEmpty(code)){
            BmobSMS.verifySmsCode(number, code, new UpdateListener() {
                @Override
                public void done(BmobException e) {
                    if(e==null){
                        toast("验证通过");
                        particsignup();
                    }else{
                        toast("验证失败：code="+e.getErrorCode()+",msg="+e.getLocalizedMessage());
                    }
                }
            });
        }else{
            toast("请输入手机号和验证码");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                stuadd();
                break;
            case R.id.button2:
                //particsignup();
                verySmscode();
                break;

            case R.id.button3:
                Intent intent=new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;

            case R.id.button4:
                //发送验证码
                requestsmscode();
                break;

            default:
                break;
        }
    }

}
