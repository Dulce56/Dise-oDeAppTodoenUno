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

        if(dato.equals("Parroquia De Nuestra Señora De Los Dolores")){
            imvdato.setImageResource(R.drawable.imag2)
            txvdato.setText("Acerca de Parroquia de Nuestra Señora de los Dolores.")
            txvCodigo.setText("Concluida en 1778, es una construcción típica del barroco novohispano de\n" +
                    "\n" +
                    "   finales del siglo XVIII. En su fachada podrás encontrar un grupo escultórico\n" +
                    "       que representa la Crucifixión de Jesús. Pero lo que distingue a esta iglesia y la\n" +
                    "        ha convertido en mucho más que un monumento religioso, es que fue aquí en\n" +
                    "\n" +
                    "       donde el cura Miguel Hidalgo, quien estaba a cargo de ella desde 1803, dio el\n" +
                    "       grito de independencia.\n" )
        }
        if(dato.equals("Museo Del Vino De Guanajuato")){
            imvdato.setImageResource(R.drawable.vino)
            txvdato.setText("Acerca de Museo del Vino de Guanajuato")
            txvCodigo.setText("Ubicado en el Antiguo Hospital de Dolores Hidalgo, este es el más reciente\n" +
                    "    museo que resalta la enología del Valle de la Independencia a través de 4\n" +
                    "    salas interactivas, donde se narra la cronología de la historia del vino, reseñas\n" +
                    "        de los viñedos de Hidalgo, los oficios del vino, el proceso de elaboración del\n" +
                    "        vino y la vendimia, fabricación y uso de barricas así como los distintos tipos de\n" +
                    "       botellas a través del tiempo. En la sala sensorial descubrirás el arte de la cata\n" +
                    "       a través de la interacción de forma lúdica, mostrando los productores\n" +
                    "           guanajuatenses y las etiquetas que producen.\n" )
        }

        if(dato.equals("Casa Museo José Alfredo Jiménez")){
            imvdato.setImageResource(R.drawable.jimenes)
            txvdato.setText("A 20 minutos de Guanajuato capital por la libre  «ahí nomás tras lomita… está Dolores Hidalgo» y la casa natal de José Alfredo Jiménez adónde siempre me dan ganas de volver.")
            txvCodigo.setText("Dolores Hidalgo es un pueblo con mucha historia. Además de ser el\n" +
                    "    lugar donde se dio «el  grito de independencia», es el lugar donde\n" +
                    "      nació y vivió sus primeros años el compositor y cantante de música\n" +
                    "      ranchera José Alfredo Jiménez. Sus canciones llevan el sello del\n" +
                    "     sentir mexicano y son reconocidas y admiradas en el mundo entero.\n"
                   )
        }
        if(dato.equals("Museo Casa de Hidalgo")){
            imvdato.setImageResource(R.drawable.museo)
            txvdato.setText("Museo Casa de Hidalgo")
            txvCodigo.setText("En esta casa de finales del siglo XVIII habitó alguna vez el Padre de la Patria Don Miguel Hidalgo e\n" +
                    "incluso funcionó como su Curato hasta 1810, cuando comienza la Guerra de Independencia. Para\n" +
                    "tratar de ser lo más realista posible, se recreó el ambiente y mobiliario de la época, además de\n" +
                    "contar con algunos objetos personales del cura. El patio, las habitaciones y la cocina en sí, valen\n" +
                    "la pena admirarse ya que ahí nació la Independencia.\n"
                   )
        }
        if(dato.equals("Panteón municipal")){
            imvdato.setImageResource(R.drawable.panteon)
            txvdato.setText("Encontrarás en este lugar, el mausoleo de José Alfredo Jiménez, el cual consiste en un gigantesco sombrero y un sarape multicolor hecho de azulejo. Fue construido con motivo de su XXV aniversario luctuoso en 1998.")
            txvCodigo.setText("En el Mausoleo de José Alfredo Jímenez descansan los restos del famoso cantautor.\n" +
                    "Fue erigido el 23 de noviembre de 1998 para conmemorar su XXV aniversario de su fallecimiento.\n" +
                    " Consiste en un gigantesco sombrero, en la parte inferior un pebetero y en las letras de ronce el epitafio: “La vida no vale nada”.\n" +
                    " Emerge de manera sinuosa, un sarape multicolor hecho en azulejo de Dolores\n" +
                    "Hidalgo, en cuyo cuerpo están incrustados los títulos de diversas canciones de\n" +
                    "su obra musical. El autor del proyecto es el reconocido Arq. Javier Senosiain,\n" +
                    " esposo de Paloma Jiménez Gálvez. Es un mausoleo digno de visitarse.\n"
                    )
        }
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
