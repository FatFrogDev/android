package co.edu.sena.bxb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val get_main_view_button = findViewById<Button>(R.id.get_main_view_button)

        get_main_view_button.setOnClickListener {
            val get_main_view = Intent(this, MainActivity::class.java)
            startActivity(get_main_view)
        }



    }
}