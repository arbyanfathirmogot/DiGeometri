package com.digeometri.digeometri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class GeometryTypesActivity : AppCompatActivity() {
    lateinit var FlatMainBtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_geometry_types)

        FlatMainBtn = findViewById(R.id.btnFlatMain)
        FlatMainBtn.setOnClickListener {
            startActivity(Intent(this,GeometryMainActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
    }
}
