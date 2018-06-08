package fr.epita.myghibliapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_characters.view.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(clickedView: View?) {
        if (clickedView != null) {
            when (clickedView.id) {
                R.id.button_films -> {
                    val intent = Intent(this@MainActivity, FilmsActivity::class.java)
                }

                R.id.button_characters ->{
                        val int = Intent(this@MainActivity, CharactersActivity::class.java)
                    }

                R.id.button_quiz ->{
                    val inte = Intent(this@MainActivity, QuizActivity::class.java)
                }
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
