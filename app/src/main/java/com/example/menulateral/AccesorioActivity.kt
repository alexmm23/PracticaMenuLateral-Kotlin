package com.example.menulateral

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AccesorioActivity :AppCompatActivity() {
    private lateinit var descripcion : TextView
    private lateinit var imagen : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accesorio)
        descripcion = findViewById(R.id.txtDescripcion)
        imagen = findViewById(R.id.imgAccesorioDetalle)
        val info = intent.extras
        val detalle: String?
        val costo: String?
        val num: Int?
        if(info != null){
            detalle = info.getString("detalle")
            costo = info.getString("costo")
            num = info.getInt("numAccesorio")
            descripcion.text = "Descripcion del producto:\n${detalle}\nCosto: ${costo}"
            when(num){
                1->imagen.setImageResource(R.drawable.accesorio01)
                2->imagen.setImageResource(R.drawable.accesorio02)
                3->imagen.setImageResource(R.drawable.accesorio03)
                4->imagen.setImageResource(R.drawable.accesorio04)
                5->imagen.setImageResource(R.drawable.accesorio05)
            }
        }else{
            detalle = "Sin detalle"
            costo = "$0.00"
            num = 1
            descripcion.text = "Descripcion del produto:\n${detalle}\nCosto: ${costo}"
        }
    }
}