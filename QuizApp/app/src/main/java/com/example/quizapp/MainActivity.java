package com.example.quizapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int score;
    String ans1, ans2, ans4, ans6;
    String answer1, answer2, answer3, answer4, answer5, answer6;
    RadioGroup rg, rg2, rg3;
    RadioButton rb;
    EditText textAns;
    String congratulations = "CONGRATS!!! YOU GOT ALL OF THEM CORRECT \uD83C\uDF89 \uD83D\uDE01";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.rgGroup);
        rg2 = findViewById(R.id.rgGroup2);
        rg3 = findViewById(R.id.rgGroup3);
        textAns = findViewById(R.id.text_ans);
    }

    // Checks all the answers.

    public void Question1(View view) {
        int radiobuttonid = rg.getCheckedRadioButtonId();
        rb = findViewById(radiobuttonid);
        ans1 = rb.getText().toString();
    }

    public void Question2(View view) {
        int radiobuttonid = rg2.getCheckedRadioButtonId();
        rb = findViewById(radiobuttonid);
        ans2 = rb.getText().toString();
    }

    public void Question3() {
        CheckBox AnsA = findViewById(R.id.soapAndWater);
        CheckBox AnsB = findViewById(R.id.uvRays);
        CheckBox AnsC = findViewById(R.id.handSanitaizer);
        CheckBox AnsD = findViewById(R.id.plainWater);
        boolean isAChecked = AnsA.isChecked();
        boolean isBChecked = AnsB.isChecked();
        boolean isCChecked = AnsC.isChecked();
        boolean isDChecked = AnsD.isChecked();
        if (isAChecked && isCChecked && !isBChecked && !isDChecked)
            score++;
        else
            score += 0;
    }

    public void Question4(View view) {
        int radiobuttonid = rg3.getCheckedRadioButtonId();
        rb = findViewById(radiobuttonid);
        ans6 = rb.getText().toString();
    }

    public void Question6() {
        CheckBox AnsA = findViewById(R.id.olderPeople);
        CheckBox AnsB = findViewById(R.id.withLungDisease);
        CheckBox AnsC = findViewById(R.id.infantsAndToddlers);
        CheckBox AnsD = findViewById(R.id.compromisedImmuneSystem);
        boolean isAChecked = AnsA.isChecked();
        boolean isBChecked = AnsB.isChecked();
        boolean isCChecked = AnsC.isChecked();
        boolean isDChecked = AnsD.isChecked();
        if (isAChecked && isBChecked && !isCChecked && isDChecked)
            score++;
        else
            score += 0;
    }


    // Displays All the answers after clicking the submit button.

    @SuppressLint("ResourceType")
    private void displayAnswers() {
        answer1 = getString(R.string.Q1_ans);
        displayAnswers1(answer1);
        answer2 = getString(R.string.Q2_ans);
        displayAnswers2(answer2);
        answer3 = getString(R.string.Q3_ans);
        displayAnswers3(answer3);
        answer4 = getString(R.string.Q4_ans);
        displayAnswers4(answer4);
        answer5 = getString(R.string.Q5_ans);
        displayAnswers5(answer5);
        answer6 = getString(R.string.Q6_ans);
        displayAnswers6(answer6);
    }

    private void displayAnswers1(String answer1) {
        TextView a1 = findViewById(R.id.q1_ans);
        a1.setText(answer1);
    }

    private void displayAnswers2(String answer2) {
        TextView a2 = findViewById(R.id.q2_ans);
        a2.setText(answer2);
    }

    private void displayAnswers3(String answer3) {
        TextView a3 = findViewById(R.id.q3_ans);
        a3.setText(answer3);
    }

    private void displayAnswers4(String answer4) {
        TextView a4 = findViewById(R.id.q4_ans);
        a4.setText(answer4);
    }

    private void displayAnswers5(String answer5) {
        TextView a5 = findViewById(R.id.q5_ans);
        a5.setText(answer5);
    }

    private void displayAnswers6(String answer6) {
        TextView a6 = findViewById(R.id.q6_ans);
        a6.setText(answer6);
    }

    private void resetScore() {
        score = 0;
    }

    private void CalculateScore() {
        if (ans1.equals("Wuhan, China"))
            score++;
        if (ans2.equals("All of the above"))
            score++;
        Question3();
        if (ans4.equals("coronavirus") || ans4.equals("Coronavirus") || ans4.equals("CoronaVirus") || ans4.equals("corona virus") || ans4.equals("Corona Virus"))
            score++;
        Question6();
        if (ans6.equals("Yes, while maintaining proper sanitation & hygiene"))
            score++;
    }

    public void showScore(View view) {
        ans4 = textAns.getText().toString();
        CalculateScore();
        String finalMessage = "Your Score is: " + score + "/6";
        if (score == 6)
            Toast.makeText(getBaseContext(), congratulations, Toast.LENGTH_LONG).show();
        Toast.makeText(getBaseContext(), finalMessage, Toast.LENGTH_SHORT).show();
        displayAnswers();
        TextView a5 = findViewById(R.id.q5_ans_link);
        a5.setMovementMethod(LinkMovementMethod.getInstance());
        a5.setVisibility(View.VISIBLE);
        TextView a6 = findViewById(R.id.q6_ans_link);
        a6.setMovementMethod(LinkMovementMethod.getInstance());
        a6.setVisibility(View.VISIBLE);
        resetScore();
    }
}