package fr.epita.myghibliapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_films.*
import kotlinx.android.synthetic.main.activity_quiz.*
import kotlinx.android.synthetic.main.activity_quiz.view.*

class QuizActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.back_button_quiz -> {
                    val intent = Intent(this@QuizActivity, MainActivity::class.java)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_films)
        back_button_quiz.setOnClickListener(this@QuizActivity)
    }


}