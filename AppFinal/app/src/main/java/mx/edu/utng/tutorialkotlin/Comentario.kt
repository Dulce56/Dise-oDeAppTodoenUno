package mx.edu.utng.tutorialkotlin

import android.content.ContentValues
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_comentario.*

class Comentario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comentario)

        btnadd.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this,"agenda", null, 1)
            val bd = admin.writableDatabase
            val registro = ContentValues()

            registro.put("id",etxid.getText().toString())
            registro.put("nombre",etxNombre.getText().toString())
            registro.put("apellido",etxApellido.getText().toString())
            bd.insert("usuarios",null,registro)
            bd.close()
            etxid.setText("")
            etxNombre.setText("")
            etxApellido.setText("")
            Toast.makeText(this, "Datos insertados correctamente.", Toast.LENGTH_SHORT)
                .show()
        }

        btnquery.setOnClickListener {
            val admin = AdminSQLiteOpenHelper(this, "agenda", null, 1)
            val bd = admin.writableDatabase
            val fila = bd.rawQuery("select id,apellido from usuarios ", null)
            if (fila.moveToFirst()) {
                etxid.setText(fila.getString(0))
                etxApellido.setText(fila.getString(1))
            } else
                Toast.makeText(this, "No existe un usuario con ese nombre",
                    Toast.LENGTH_SHORT).show()
            bd.close()
        }

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("¿Estas seguro?")
        alertDialogBuilder.setMessage("¿Seguro qué deseas eliminar este comentario?")
        alertDialogBuilder.setPositiveButton(android.R.string.yes) { dialog, which ->
            val admin = AdminSQLiteOpenHelper(this, "agenda", null, 1)
            val bd = admin.writableDatabase
            val cant = bd.delete("usuarios",
                "id=${etxid.text.toString()}", null)
            bd.close()
            etxid.setText("")
            etxNombre.setText("")
            etxApellido.setText("")
            if (cant == 1)
                Toast.makeText(this, "Se borró el usuario con dicho código", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "No existe un usuario con dicho código", Toast.LENGTH_SHORT).show()
        }

        alertDialogBuilder.setNegativeButton("Cancelar", { dialog, whichButton ->
            dialog.dismiss()
        })

        btndelete.setOnClickListener {
            alertDialogBuilder.show()
        }
    }
}
