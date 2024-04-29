package com.example.menulateral

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IngresoActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso)
        email = findViewById(R.id.edtCorreo)
        password = findViewById(R.id.edtContrasena)
    }
    fun onClick(view: View?){
        when(view?.id){
            R.id.btnAceptar -> aceptar()
            R.id.btnCancelar->cancelar()
        }
    }
    private fun aceptar(){
        if(email.text.isNotEmpty() && email.text.isNotBlank() && password.text.isNotBlank() && password.text.isNotEmpty()){
            if(email.text.toString() == "usr" && password.text.toString() == "12345"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Usuario o contraseña invalidos", Toast.LENGTH_LONG).show()
                return
            }
        }else{
            Toast.makeText(this,"Infresar información.", Toast.LENGTH_LONG).show()
        }
    }
    private fun cancelar(){
        Toast.makeText(this, "Terminar aplicacion", Toast.LENGTH_LONG).show()
        finish()
    }
}