package com.chuckree.resumeonphone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class ResumeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        TextView name = (TextView) findViewById(R.id.nameTextView);
        TextView email = (TextView) findViewById(R.id.emailTextView);
        TextView phone = (TextView) findViewById(R.id.phoneTextView);
        TextView objective = (TextView) findViewById(R.id.objectiveTextView);
        TextView experience = (TextView) findViewById(R.id.experienceTextView);
        TextView college = (TextView) findViewById(R.id.collegeTextView);
        TextView degree = (TextView) findViewById(R.id.degreeTextView);
        TextView gpa = (TextView) findViewById(R.id.gpaTextView);
        TextView graduation_date = (TextView) findViewById(R.id.graduation_dateTextView);

        Bundle extras = getIntent().getExtras();

        name.setText(extras.getString("name"));
        email.setText(extras.getString("email"));
        phone.setText(extras.getString("phone"));
        objective.setText(extras.getString("objective"));
        experience.setText(extras.getString("experience"));
        college.setText(extras.getString("college"));
        degree.setText(extras.getString("degree"));
        gpa.setText(extras.getString("gpa"));
        graduation_date.setText(extras.getString("graduation_date"));

        Toast.makeText(this, "Here's your Resume!", Toast.LENGTH_LONG).show();

    }
}
