package com.example.tictacto

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tictacto.databinding.ActivityStartBinding


class StartActivity : AppCompatActivity() {
    private lateinit var binding:ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun Play(view: View) {
//        MainActivity();

//        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
        val name1 = binding.txtNameOne.text.toString()
        val name2 = binding.txtNameTwo.text.toString()
        Toast.makeText(binding.root.context, "Please enter 2 names", Toast.LENGTH_LONG).show()
        if (name1 == "" || name2 == "") {
            Toast.makeText(this, "Please enter 2 names", Toast.LENGTH_SHORT).show()
            return;
        }
        if (name1 == name2) {
            Toast.makeText(this, "Please enter 2 different names", Toast.LENGTH_SHORT).show()
            return
        }
        val intent = Intent(this@StartActivity, MainActivity::class.java)
        val b = Bundle()
        b.putString("name1", name1)
        b.putString("name2", name2)
        intent.putExtras(b)
        startActivity(intent)
        finish();
    }
}