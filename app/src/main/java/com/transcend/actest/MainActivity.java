package com.transcend.actest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.transcend.actest.bean.stu;
import com.transcend.actest.model.parmodel;
import com.transcend.actest.model.partic;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;


public class MainActivity extends Activity implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private Button button3;
    private EditText xuehao;
    private EditText xingming;
    private EditText xueyuan;
    private EditText nianji;
    private EditText shoujihao;
    private EditText yonghuming;
    private EditText mima;
    private parmodel part;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //初始化
        Bmob.initialize(this, "90eb55c0de63532dc261983f633ed348");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        xuehao=(EditText)findViewById(R.id.xuehao);
        xingming=(EditText)findViewById(R.id.xingming);
        xueyuan=(EditText)findViewById(R.id.xueyuan);
        nianji=(EditText)findViewById(R.id.nianji);
        shoujihao=(EditText)findViewById(R.id.shoujihao);
        yonghuming=(EditText)findViewById(R.id.yonghuming);
        mima=(EditText)findViewById(R.id.mima);
        part=new partic();

    }

    stu asd;
    public void toast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:

                //添加数据
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
                break;
            case R.id.button2:
                String sna=yonghuming.getText().toString();
                String smm=mima.getText().toString();
                String sno=xuehao.getText().toString();
                String sname=xingming.getText().toString();
                String sxy=xueyuan.getText().toString();
                String nj=nianji.getText().toString();
                String sjh=shoujihao.getText().toString();
                String a=part.parsignup(sna,smm,sno,sname,sxy,nj,sjh);
                if(a=="success")
                    toast("注册成功");
                else if (a=="failure")
                    toast("注册失败");
                //else{
                    //String m=a.toString();
                    //toast(m);
                //}
                break;

            case R.id.button3:
                Intent intent=new Intent(this,Main2Activity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
