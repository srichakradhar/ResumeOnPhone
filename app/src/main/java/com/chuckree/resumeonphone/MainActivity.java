package com.chuckree.resumeonphone;
import android.support.v7.app.AppCompatActivity;
/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText phone;
    private EditText objective;
    private EditText experience;
    private EditText college;
    private EditText degree;
    private EditText gpa;
    private EditText graduation_date;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        objective = (EditText) findViewById(R.id.objective);
        experience = (EditText) findViewById(R.id.experience);
        college = (EditText) findViewById(R.id.college);
        degree = (EditText) findViewById(R.id.degree);
        gpa= (EditText) findViewById(R.id.gpa);
        graduation_date = (EditText) findViewById(R.id.graduation_date);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resumeIntent = new Intent(getApplicationContext(), ResumeActivity.class);
                resumeIntent.putExtra("name", name.getText().toString());
                resumeIntent.putExtra("email", email.getText().toString());
                resumeIntent.putExtra("phone", phone.getText().toString());
                resumeIntent.putExtra("objective", objective.getText().toString());
                resumeIntent.putExtra("experience", experience.getText().toString());
                resumeIntent.putExtra("college", college.getText().toString());
                resumeIntent.putExtra("degree", degree.getText().toString());
                resumeIntent.putExtra("gpa", gpa.getText().toString());
                resumeIntent.putExtra("graduation_date", graduation_date.getText().toString());

                startActivity(resumeIntent);
            }
        });

    }
}

