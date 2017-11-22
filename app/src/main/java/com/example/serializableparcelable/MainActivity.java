package com.example.serializableparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.serializableparcelable.activity.ParcelableActivity;
import com.example.serializableparcelable.activity.SerializableActivity;
import com.example.serializableparcelable.bean.Student;
import com.example.serializableparcelable.bean.Teacher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    private void setListener() {

        findViewById(R.id.parcel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student=new Student("张三",20);
                Intent intent=new Intent(MainActivity.this,ParcelableActivity.class);
                intent.putExtra("name",student);
                startActivity(intent);
            }
        });

        findViewById(R.id.serialize).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Teacher teacher=new Teacher("lisi",30);
                Intent intent=new Intent(MainActivity.this,SerializableActivity.class);
                intent.putExtra("name",teacher);
                startActivity(intent);
            }
        });


    }

}
