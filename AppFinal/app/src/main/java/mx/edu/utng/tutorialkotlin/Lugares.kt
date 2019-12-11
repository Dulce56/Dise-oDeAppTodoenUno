package mx.edu.utng.tutorialkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lugares.*

class Lugares : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugares)


        val titulo = arrayOf("Parroquia De Nuestra Señora De Los Dolores","Museo Del Vino De Guanajuato" ,"Casa Museo José Alfredo Jiménez" ,"Museo Casa de Hidalgo" ,"Panteón municipal" )
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titulo)
        lvTutorial.adapter = adaptador

        lvTutorial.setOnItemClickListener { parent, view, position, id ->
            val msg = "${titulo[position]}"
            val datos = Intent(this, Datos::class.java)
            datos.putExtra("llave",msg)
            startActivity(datos)
        }


        btnRegresar.setOnClickListener{
            val intento = Intent(this,  MainActivity::class.java)
            startActivity(intento)
        }
    }



}
