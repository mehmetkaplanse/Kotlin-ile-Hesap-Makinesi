package com.mehmetkaplan.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mehmetkaplan.kotlinlearning.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

    private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    var prevNumber = ""
    var operator = "*"
    var newOperator = true

    fun btnSayiTik(view: View) {
        if(newOperator) {
            textView.setText("")
        }
        newOperator = false

        var btnSec = view as Button
        var btnTikDeger: String = textView.text.toString()

        if (btnTikDeger.equals("0")) {
            btnTikDeger = ""
            when (btnSec.id) {
                btn0.id -> {
                    btnTikDeger = "0"
                }
                btn1.id -> {
                    btnTikDeger += "1"
                }
                btn2.id -> {
                    btnTikDeger += "2"
                }
                btn3.id -> {
                    btnTikDeger += "3"
                }
                btn4.id -> {
                    btnTikDeger += "4"
                }
                btn5.id -> {
                    btnTikDeger += "5"
                }
                btn6.id -> {
                    btnTikDeger += "6"
                }
                btn7.id -> {
                    btnTikDeger += "7"
                }
                btn8.id -> {
                    btnTikDeger += "8"
                }
                btn9.id -> {
                    btnTikDeger += "9"
                }
                btnartieksi.id -> {
                    btnTikDeger = "-" + btnTikDeger
                }
            }
        } else {
            when (btnSec.id) {
                btn0.id -> {
                    btnTikDeger += "0"
                }
                btn1.id -> {
                    btnTikDeger += "1"
                }
                btn2.id -> {
                    btnTikDeger += "2"
                }
                btn3.id -> {
                    btnTikDeger += "3"
                }
                btn4.id -> {
                    btnTikDeger += "4"
                }
                btn5.id -> {
                    btnTikDeger += "5"
                }
                btn6.id -> {
                    btnTikDeger += "6"
                }
                btn7.id -> {
                    btnTikDeger += "7"
                }
                btn8.id -> {
                    btnTikDeger += "8"
                }
                btn9.id -> {
                    btnTikDeger += "9"
                }
                btnartieksi.id -> {
                    btnTikDeger = "-" + btnTikDeger
                }
            }

        }

        textView.setText(btnTikDeger)

    }

    fun btnOpTik(view: View) {
        var btnSec = view as Button

        when(btnSec.id) {
            btndivide.id-> {
                operator="/"
            }
            btnmultiply.id-> {
                operator="*"
            }
            btnminus.id-> {
                operator="-"
            }
            btnplus.id-> {
                operator="+"
            }
        }
        prevNumber = textView.text.toString()
        newOperator=true

    }

    fun btnEqualTik(view: View) {
        var newNumber = textView.text.toString()
        var result:Double ?= null

        when(operator) {
            "/"-> {
                result = prevNumber.toDouble() / newNumber.toDouble()
            }
            "*"-> {
                result = prevNumber.toDouble() * newNumber.toDouble()
            }
            "-"-> {
                result = prevNumber.toDouble() - newNumber.toDouble()
            }
            "+"-> {
                result = prevNumber.toDouble() + newNumber.toDouble()
            }
        }
        textView.setText(result.toString())
    }

    fun btnResetTik(view: View) {
        textView.setText("0")
        newOperator = true
        prevNumber = ""
        operator = ""
    }

    fun btnPercentTik(view: View) {
        var sayi:Double = textView.text.toString().toDouble()/100
        textView.setText(sayi.toString())
        newOperator = true
    }
}