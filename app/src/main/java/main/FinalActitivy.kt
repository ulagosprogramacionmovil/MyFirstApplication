package main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView
import com.ulagos.myfirstapplication.R

class FinalActitivy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_actitivy)

//        val txtView = findViewById<AppCompatTextView>(R.id.txtResult)
//        val name: String = intent.extras?.getString("EXTRA_TXT_NAME").orEmpty()
//
//        txtView.text = "Hola ${name}"
    }
}