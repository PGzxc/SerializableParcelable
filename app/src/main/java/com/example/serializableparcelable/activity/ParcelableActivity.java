package com.example.serializableparcelable.activity;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.widget.TextView;

import com.example.serializableparcelable.bean.Student;

/**
 * author：Admin
 * date：2017/11/2213:13
 * 编程使我快乐
 */

public class ParcelableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Student student = (Student) getIntent().getParcelableExtra("name");
        TextView textView = new TextView(this);
        textView.setTextSize( TypedValue.COMPLEX_UNIT_SP,30);
        textView.setText("Parcelable===" + student.getName() + student.getAge());
        setContentView(textView);
    }
}
