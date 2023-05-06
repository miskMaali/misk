package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView questionTV, questionNumber;
    private Button option1Btn, option2Btn, option3Btn, option4Btn;
    private ArrayList<QuizModal> quizModalArrayList;
    Random random;
    int currentSource = 0, questionAttempted = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionTV = findViewById(R.id.textviewQeustion);
        questionNumber = findViewById(R.id.textviewNumQeustion);
        option1Btn = findViewById(R.id.butoption1);
        option2Btn = findViewById(R.id.butoption2);
        option3Btn = findViewById(R.id.butoption3);
        option4Btn = findViewById(R.id.butoption4);
        quizModalArrayList = new ArrayList<>();
        random = new Random();
        getQuizQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToViews(currentPos);
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())) {
                    currentSource++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }


        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())) {
                    currentSource++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });

        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())) {
                    currentSource++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });

        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())) {
                    currentSource++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);

            }
        });
    }



    private void setDataToViews(int currentPos) {

            questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
            option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
            option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
            option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
            option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());


        }
        private void getQuizQuestion (ArrayList<QuizModal>quizModalArrayList) {
            quizModalArrayList.add(new QuizModal("What Is The Capital Of Palestine?", "Ramallah", "Nablus", "Hebron", "Jerusalem", "Jerusalem"));
            quizModalArrayList.add(new QuizModal("In which continent is Palestine located?", "Asia", "Africa", "Australia", "Europe", "Asia"));
            quizModalArrayList.add(new QuizModal("What are the borders of Palestine from the east?", "Saudi Arabia", "Lebanon", "Jordan ", "Egypt ", "Jordan"));
            quizModalArrayList.add(new QuizModal("Where is the Church of the Nativity located?", "Hebron", "Jericho", "Bethlehem", "Jerusalem", "Bethlehem"));
        }
    }
