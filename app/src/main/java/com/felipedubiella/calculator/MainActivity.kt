package com.felipedubiella.calculator

import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.children
import com.felipedubiella.calculator.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        with(binding) {

            val calc = tvCalc

            divide.setOnClickListener {
                calc.text = "${calc.text}/"
            }
            seven.setOnClickListener {
                calc.text = "${calc.text}7"
            }
            eight.setOnClickListener {
                calc.text = "${calc.text}8"
            }
            nine.setOnClickListener {
                calc.text = "${calc.text}9"
            }
            X.setOnClickListener {
                calc.text = "${calc.text}*"
            }
            four.setOnClickListener {
                calc.text = "${calc.text}4"
            }
            five.setOnClickListener {
                calc.text = "${calc.text}5"
            }
            six.setOnClickListener {
                calc.text = "${calc.text}6"
            }
            minus.setOnClickListener {
                calc.text = "${calc.text}-"
            }
            one.setOnClickListener {
                calc.text = "${calc.text}1"
            }
            two.setOnClickListener {
                calc.text = "${calc.text}2"
            }
            three.setOnClickListener {
                calc.text = "${calc.text}3"
            }
            plus.setOnClickListener {
                calc.text = "${calc.text}+"
            }
            dot.setOnClickListener {
                calc.text = "${calc.text}."
            }
            zero.setOnClickListener {
                calc.text = "${calc.text}0"
            }
            del.setOnClickListener {
                calc.text = calc.text.dropLast(1)
            }
            equal.setOnClickListener {
                val resultCalc = Expression(calc.text.toString()).calculate()

                if (resultCalc.isNaN()){
                    tvResult.text = "Invalid Expression"
                }else{
                    tvResult.text = resultCalc.toString()
                }
            }
            clear.setOnClickListener {
                calc.text = ""
                tvResult.text = ""

            }
        }
    }
}
