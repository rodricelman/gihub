package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var position=0
    lateinit var questions: ArrayList<Question>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadQuestions()
        setupViews()
    }

    private fun loadQuestions() {
        questions=ArrayList()
        var question: Question;
         question=Question("es lima capital de peru",true);
        questions.add(question)
         question=Question("lima capital chile",false);
        questions.add(question)
         question=Question("es venmezuela capital de chile",false);
        questions.add(question)
         question=Question("es caracas capital de venezuela",true);
        questions.add(question)
         question=Question("es madrir capital de mexico",false);
        questions.add(question)
    }


    fun setupViews(){
        //val btnYes= findViewById<Button>(R.id.btnYes)
        tvSentence.text=questions[0].sentence
       btnYes.setOnClickListener{
         if(questions[position].answer)
           Toast.makeText(this,"correcto",Toast.LENGTH_LONG).show()
           else     Toast.makeText(this,"incorrecto",Toast.LENGTH_LONG).show()


       }
        
        btnNo.setOnClickListener{
            if(!questions[position].answer)
                Toast.makeText(this,"correcto",Toast.LENGTH_LONG).show()
            else     Toast.makeText(this,"incorrecto",Toast.LENGTH_LONG).show()
        }
        btnNext.setOnClickListener{
            position++;
            tvSentence.text=questions[position].sentence
        }
    }
}
