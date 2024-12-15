package tr.com.nuritiras.ogrenmebirimi5sirasizdesayfa188

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonEskenar = findViewById<Button>(R.id.buttonEskenar)
        val buttonIkizkenar = findViewById<Button>(R.id.buttonIkızkenar)
        val buttonCesitkenar = findViewById<Button>(R.id.buttonCesitkenar)
        val editTextNumberA = findViewById<EditText>(R.id.editTextNumberA)
        val editTextNumberB = findViewById<EditText>(R.id.editTextNumberB)
        val editTextNumberC = findViewById<EditText>(R.id.editTextNumberC)
        val textViewCevre = findViewById<TextView>(R.id.textViewCevre)

        buttonEskenar.setOnClickListener {
            val kenar1 = editTextNumberA.text.toString().toInt()
            val eskenarUcgen = Ucgen(kenar1)
            textViewCevre.text = "Çevre: " + eskenarUcgen.cevreBul().toString()
        }

        buttonIkizkenar.setOnClickListener {
            val kenar1 = editTextNumberA.text.toString().toInt()
            val kenar2 = editTextNumberB.text.toString().toInt()
            val ikizkenarUcgen = Ucgen(kenar1, kenar2)
            textViewCevre.text = "Çevre: " + ikizkenarUcgen.cevreBul().toString()
        }

        buttonCesitkenar.setOnClickListener {
            val kenar1 = editTextNumberA.text.toString().toInt()
            val kenar2 = editTextNumberB.text.toString().toInt()
            val kenar3 = editTextNumberC.text.toString().toInt()
            val cesitkenarUcgen = Ucgen(kenar1, kenar2, kenar3)
            textViewCevre.text = "Çevre: " + cesitkenarUcgen.cevreBul().toString()
        }

    }
}