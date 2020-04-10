package com.tads.cachorro_idade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Int = intent.extras
    }

}
