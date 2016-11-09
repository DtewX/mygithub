package com.transcend.actest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.transcend.actest.model.admin;
import com.transcend.actest.model.adminmodel;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private Button glyzc;
    private EditText glyn;
    private EditText glymm;
    private adminmodel ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        glyzc=(Button)findViewById(R.id.glyzc);
        glyzc.setOnClickListener(this);
        glyn=(EditText)findViewById(R.id.glyn);
        glymm=(EditText)findViewById(R.id.glymm);
        ad=new admin();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.glyzc:
            String glynz=glyn.getText().toString();
            String glym=glymm.getText().toString();
            String a=ad.adminsignup(glynz,glym);
            if(a=="success"){
                Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();
            }
            else if (a=="failure"){
                Toast.makeText(this,"注册失败",Toast.LENGTH_SHORT).show();
            }
             //else{
                //String n=a.toString();
               // Toast.makeText(this, n, Toast.LENGTH_SHORT).show();
            //}
                 break;
            default:
                break;

        }
    }
}
