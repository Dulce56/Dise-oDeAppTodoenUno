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


        val titulo = arrayOf("Manejo de ListView","Manejo de Activities" ,"SharedPreferences" ,"Controladores de Audio" ,"SQlite" )
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titulo)
        lvTutorial.adapter = adaptador

        lvTutorial.setOnItemClickListener { parent, view, position, id ->
            val msg = "${titulo[position]}"
            val datos = Intent(this, Datos::class.java)
            datos.putExtra("llave",msg)
            startActivity(datos)
        }

    }
}
