package main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.ulagos.myfirstapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOk = findViewById<AppCompatButton>(R.id.btnOk) // aqui se enlaza el componente a la variable
        // a continuacion programamos lo que queremos que se ejecute cuando se pulse el boton
        val editTxtName = findViewById<AppCompatEditText>(R.id.editTxtName)

        btnOk.setOnClickListener {
            var name = editTxtName.text.toString()

            if (name.isNotEmpty()){
                Log.i("Debug", "Boton OK pulsado por $name")
            }
        }
    }
}
