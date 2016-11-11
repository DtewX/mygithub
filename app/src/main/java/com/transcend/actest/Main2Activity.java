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

    private EditText glyn;
    private EditText glymm;
    private adminmodel ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button glyzc = (Button) findViewById(R.id.glyzc);
        glyzc.setOnClickListener(this);
        glyn=(EditText)findViewById(R.id.glyn);
        glymm=(EditText)findViewById(R.id.glymm);
        ad=new admin();
    }

    private void glyzc(){
        String glynz=glyn.getText().toString();
        String glym=glymm.getText().toString();
        String a=ad.adminsignup(glynz,glym);
        if("success".equals(a)){
            Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "注册失败："+a, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.glyzc:
                glyzc();
                break;
            default:
                break;
        }
    }
}
