package mx.edu.utng.tutorialkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLugares.setOnClickListener{
            val intento = Intent(this,  Lugares::class.java)
            startActivity(intento)
        }
        btnDolores.setOnClickListener{
            val intento = Intent(this,  Dolores::class.java)
            startActivity(intento)
        }

        btnCom.setOnClickListener{
            val intento = Intent(this,  Comentario::class.java)
            startActivity(intento)
        }

        btnCom.setOnClickListener{
            val intento = Intent(this,  Comentario::class.java)
            startActivity(intento)
        }

        btnAcer.setOnClickListener{
            val intento = Intent(this,  Acercade::class.java)
            startActivity(intento)
        }
        btnSalir.setOnClickListener{
            System.exit(0)
        }

    }
}
