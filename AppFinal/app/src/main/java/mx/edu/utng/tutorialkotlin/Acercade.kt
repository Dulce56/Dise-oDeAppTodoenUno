package mx.edu.utng.tutorialkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lugares.*

class Acercade : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acercade)

        btnRegresar.setOnClickListener{
            val intento = Intent(this,  MainActivity::class.java)
            startActivity(intento)
        }
    }
}
