package com.example.serializableparcelable.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.widget.TextView;

import com.example.serializableparcelable.bean.Teacher;

/**
 * author：Admin
 * date：2017/11/2213:12
 * 编程使我快乐
 */

public class SerializableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Teacher teacher= (Teacher) getIntent().getSerializableExtra("name");
        TextView textView=new TextView(this);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
        textView.setText("Serializeable=="+teacher.getName()+teacher.getAge());
        setContentView(textView);

    }
}
