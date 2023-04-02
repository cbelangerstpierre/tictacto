package com.example.tictacto

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tictacto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var turn = 1;
    private var image0:Int=0
    private var image1:Int=0
    private var image2:Int=0
    private var image3:Int=0
    private var image4:Int=0
    private var image5:Int=0
    private var image6:Int=0
    private var image7:Int=0
    private var image8:Int=0
    private var name1:String = ""
    private var name2:String = ""
    private var pts1:Int = 0
    private var pts2:Int = 0
    private var finished:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        val b = intent.extras
        if (b != null) {
            name1 = b.getString("name1").toString()
            name2 = b.getString("name2").toString()

            binding.textView.text = "Gamer 1 : " + name1
            binding.textView2.text = "Gamer 2 : " + name2
        }
        setContentView(view)
    }

    fun checkWin() {
        var winner = 0;
        if (image0 != 0 && ((image0 == image1 && image1 == image2) || (image0 == image3 && image3 == image6) || (image0 == image4 && image4 == image8))) {
            winner = image0
        }
        else if (image4 != 0 && ((image4 == image1 && image4 == image7) || (image4 == image3 && image4 == image5) || (image4 == image2 && image4 == image6))) {
            winner = image4
        }
        else if (image8 != 0 && ((image8 == image7 && image7 == image6) || (image8 == image5 && image5 == image2))) {
            winner = image8
        }
        if (winner != 0) finished = true
        if (winner == 1) {
            pts1++
            binding.textView4.text = "Pts : " + pts1.toString()
            Toast.makeText(baseContext, "The winner is : $name1", Toast.LENGTH_LONG).show()
        }
        else if (winner == 2) {
            pts2++
            binding.textView3.text = "Pts : " + pts2.toString()
            Toast.makeText(baseContext, "The winner is : $name2", Toast.LENGTH_LONG).show()

        }
    }


    fun addImage(button: ImageButton) {
        turn = if (turn == 1) {
            button.setBackgroundResource(R.drawable.circle)
            2
        } else {
            button.setBackgroundResource(R.drawable.cross)
            1
        }
        checkWin();
    }

        fun btn1(view: View) {
            if (finished) return
            if (image0 == 0) {
                image0 = turn
                addImage(binding.button1)
            };
        }
        fun btn2(view: View) {
            if (finished) return
            if (image1 == 0) {
                image1 = turn
                addImage(binding.button2);
            }
        }
        fun btn3(view: View) {
            if (finished) return
            if (image2 == 0) {
                image2 = turn
                addImage(binding.button3);
            }
        }
        fun btn4(view: View) {
            if (finished) return
            if (image3 == 0) {
                image3 = turn
                addImage(binding.button4);
            }
        }
        fun btn5(view: View) {
            if (finished) return
            if (image4 == 0) {
                image4 = turn
                addImage(binding.button5);
            }
        }
        fun btn6(view: View) {
            if (finished) return
            if (image5 == 0) {
                image5 = turn
                addImage(binding.button6);
            }
        }
        fun btn7(view: View) {
            if (finished) return
            if (image6 == 0) {
                image6 = turn
                addImage(binding.button7);
            }
        }
        fun btn8(view: View) {
            if (finished) return
            if (image7 == 0) {
                image7 = turn
                addImage(binding.button8);
            }
        }
        fun btn9(view: View) {
            if (finished) return
            if (image8 == 0) {
                image8 = turn
                addImage(binding.button9);
            }
        }

    fun Reset(view: View) {
        turn = 1
        finished = false
        image0 = 0
        image1 = 0
        image2 = 0
        image3 = 0
        image4 = 0
        image5 = 0
        image6 = 0
        image7 = 0
        image8 = 0
        binding.button1.setBackgroundResource(R.drawable.button_border);
        binding.button2.setBackgroundResource(R.drawable.button_border);
        binding.button3.setBackgroundResource(R.drawable.button_border);
        binding.button4.setBackgroundResource(R.drawable.button_border);
        binding.button5.setBackgroundResource(R.drawable.button_border);
        binding.button6.setBackgroundResource(R.drawable.button_border);
        binding.button7.setBackgroundResource(R.drawable.button_border);
        binding.button8.setBackgroundResource(R.drawable.button_border);
        binding.button9.setBackgroundResource(R.drawable.button_border);
    }
}




