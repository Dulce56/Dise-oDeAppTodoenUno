package mx.edu.utng.tutorialkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos.*

class Datos : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        val bundle=intent.extras
        val dato= bundle?.getString("llave")
        txvTitulo.text = dato

        if(dato.equals("Manejo de ListView")){
            imvdato.setImageResource(R.drawable.list)
            txvdato.setText("Un ListView en Android es un objeto que nos permite mostrar una lista de elementos desplazables.")
            txvCodigo.setText("class MainActivity : AppCompatActivity() {\n" +
                    "\n" +
                    "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                    "        super.onCreate(savedInstanceState)\n" +
                    "        setContentView(R.layout.activity_main)\n" +
                    "\n" +
                    "        val paises = arrayOf( \"Argentina\", \"Chile\", \"Paraguay\", \"Bolivia\", \"Peru\", \"Ecuador\", \"Brasil\", \"Colombia\", \"Venezuela\", \"Uruguay\")\n" +
                    "        var habitantes = arrayOf(40_000_000, 17_000_000, 6_500_000, 10_000_000, 30_000_000, 14_000_000, 183_000_000, 44_000_000, 31_000_000, 3_500_000)\n" +
                    "        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises)\n" +
                    "        list1.adapter = adaptador1\n" +
                    "        list1.setOnItemClickListener { adapterView, view, i, l ->\n" +
                    "            tv1.text = \"Población de: \"\n" +
                    "        }\n" +
                    "    }\n" +
                    "}")
        }
        if(dato.equals("Manejo de Activities")){
            imvdato.setImageResource(R.drawable.activi)
            txvdato.setText("Una Activity es un componente de la aplicación que contiene una pantalla con la que los usuarios pueden interactuar para realizar una acción, como marcar un número telefónico, tomar una foto, enviar un correo electrónico o ver un mapa. A cada actividad se le asigna una ventana en la que se puede dibujar su interfaz de usuario.")
            txvCodigo.setText("public class MainActivity extends AppCompatActivity {\n" +
                    "\n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    "\n" +
                    "        Button btn = (Button) findViewById(R.id.botonact1);\n" +
                    "        btn.setOnClickListener(new View.OnClickListener() {\n" +
                    "            @Override\n" +
                    "            public void onClick(View v) {\n" +
                    "                Intent intent = new Intent (v.getContext(), AcercaDe.class);\n" +
                    "                startActivityForResult(intent, 0);\n" +
                    "            }\n" +
                    "        });\n" +
                    "    }\n" +
                    "}")
        }

        if(dato.equals("SharedPreferences")){
            imvdato.setImageResource(R.drawable.share)
            txvdato.setText("Android ofrece diferentes opciones para que guardes los datos de tu aplicación. La solución que elijas dependerá de tus necesidades específicas. Si tu aplicación no necesita almacenar muchos datos ni requiere una estructura, sirve para almacenar datos privados de primitivas en pares clave-valor")
            txvCodigo.setText("class MainActivity : AppCompatActivity() {\n" +
                    "\n" +
                    "    override fun onCreate(savedInstanceState: Bundle?) {\n" +
                    "        super.onCreate(savedInstanceState)\n" +
                    "        setContentView(R.layout.activity_main)\n" +
                    "\n" +
                    "        val preferencias = getSharedPreferences(\"agenda\", Context.MODE_PRIVATE)\n" +
                    "\n" +
                    "        btnGrabar.setOnClickListener {\n" +
                    "            val editor =  preferencias.edit()\n" +
                    "            editor.putString(etxNombre.text.toString(), etxDatos.text.toString())\n" +
                    "            editor.commit()\n" +
                    "            Toast.makeText(this, \"Datos guardados\", Toast.LENGTH_LONG).show()\n" +
                    "\n" +
                    "            etxNombre.setText(\"\")\n" +
                    "            etxDatos.setText(\"\")\n" +
                    "        }\n" +
                    "\n" +
                    "        btnRecuperar.setOnClickListener {\n" +
                    "            val datos = preferencias.getString((etxNombre.text.toString()), \"\")\n" +
                    "\n" +
                    "            if (datos?.length == 0) {\n" +
                    "                Toast.makeText(this, \"No existe dicho nombre en la agenda\", Toast.LENGTH_LONG)\n" +
                    "                    .show()\n" +
                    "            } else\n" +
                    "                etxDatos.setText(datos)\n" +
                    "        }\n" +
                    "    }\n" +
                    "}")
        }
        if(dato.equals("Controladores de Audio")){
            imvdato.setImageResource(R.drawable.audi)
            txvdato.setText("Para implementar audio a tu App existen diferentes formas, tanto Online o local. La clase MediaPlayer se puede usar para controlar la reproducción de archivos de audio/vídeo y transmisiones.")
            txvCodigo.setText("package com.academiaandroid.demomultimedia;\n" +
                    " \n" +
                    "import android.app.Activity;\n" +
                    "import android.media.MediaPlayer;\n" +
                    "import android.os.Bundle;\n" +
                    " \n" +
                    "public class MainActivity extends Activity {\n" +
                    " \n" +
                    "    @Override\n" +
                    "    protected void onCreate(Bundle savedInstanceState) {\n" +
                    "        super.onCreate(savedInstanceState);\n" +
                    "        setContentView(R.layout.activity_main);\n" +
                    " \n" +
                    "        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.fuga_bach);\n" +
                    "        mediaPlayer.start();\n" +
                    " \n" +
                    "    }\n" +
                    "}")
        }
        if(dato.equals("SQlite")){
            imvdato.setImageResource(R.drawable.sql)
            txvdato.setText("Es un motor de base de datos SQL transaccional de código abierto, ligero, autónomo, de configuración simple y sin servidor. Así mismo, por ser de dominio público es gratuito tanto para fines privados como para comerciales. SQLite cumple con las características ACID (atomicidad, consistencia, aislamiento y durabilidad), forma parte integral de las aplicaciones basadas en el cliente, SQLite utiliza una sintaxis SQL dinámica y realiza múltiples tareas para hacer lecturas y escrituras al mismo tiempo, ambas (lectura y escritura) se efectúan directamente en los archivos de disco ordinarios.")
            txvCodigo.setText("@Override\n" +
                    "public void onCreate(SQLiteDatabase db) {\n" +
                    "    // Create table...\n" +
                    "\n" +
                    "    // Contenedor de valores\n" +
                    "    ContentValues values = new ContentValues();\n" +
                    "\n" +
                    "    // Pares clave-valor\n" +
                    "    values.put(LawyerEntry.ID, \"L-001\");\n" +
                    "    values.put(LawyerEntry.NAME, \"Carlos solarte\");\n" +
                    "    values.put(LawyerEntry.SPECIALTY, \"Abogado penalista\");\n" +
                    "    values.put(LawyerEntry.PHONE_NUMBER, \"300 200 1111\");\n" +
                    "    values.put(LawyerEntry.BIO, \"Carlos es una profesional con 5 años de trayectoria...\");\n" +
                    "    values.put(LawyerEntry.AVATAR_URI, \"carlos_solarte.jpg\");\n" +
                    "\n" +
                    "    // Insertar...\n" +
                    "    db.insert(LawyerEntry.TABLE_NAME, null, values);\n" +
                    "\n" +
                    "}")
        }
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
