package co.edu.sena.bxb

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.user)
        val password = findViewById<EditText>(R.id.password)
        val viewResult = findViewById<TextView>(R.id.login_result)

        val loginButton = findViewById<Button>(R.id.login_view_button)
        loginButton.setOnClickListener{
            if(user.text.toString() == "admin" && password.text.toString() =="0000" ){
                val result = "Bienvenido ${user.text.toString()}!"
                viewResult.text = result
                val firstIntent = Intent( this, Menu::class.java)
                startActivity(firstIntent)
            }else {
                viewResult.text = "Ups!, wrong user or password"
            }
        }
    }
}