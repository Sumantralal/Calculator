package com.sumantra.good

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.sumantra.good.R
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var display1:TextView
    lateinit var display2:TextView
    lateinit var zero: Button
    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var addition: Button
    lateinit var substraction: Button
    lateinit var multiply: Button
    lateinit var division: Button
    lateinit var dot: Button
    lateinit var equal: Button
    lateinit var reset: Button

    var cur:String=""
    var last:String=""



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display1=findViewById(R.id.display1)
        display2=findViewById(R.id.display2)
        zero=findViewById(R.id.b0)
        one=findViewById(R.id.b1)
        two=findViewById(R.id.b2)
        three=findViewById(R.id.b3)
        four=findViewById(R.id.b4)
        five=findViewById(R.id.b5)
        six=findViewById(R.id.b6)
        seven=findViewById(R.id.b7)
        eight=findViewById(R.id.b8)
        nine=findViewById(R.id.b9)
        addition=findViewById(R.id.plus)
        substraction=findViewById(R.id.minus)
        multiply=findViewById(R.id.multiply)
        division=findViewById(R.id.divide)
        dot=findViewById(R.id.dot)
        equal=findViewById(R.id.equal)
        reset=findViewById(R.id.reset)

        zero.setOnClickListener{
            cur+="0"
            display1.text=cur
        }
        one.setOnClickListener{
            cur+="1"
            display1.text=cur
        }
        two.setOnClickListener{
            cur+="2"
            display1.text=cur
        }
        three.setOnClickListener{
            cur+="3"
            display1.text=cur
        }
        four.setOnClickListener{
            cur+="4"
            display1.text=cur
        }
        five.setOnClickListener{
            cur+="5"
            display1.text=cur
        }
        six.setOnClickListener{
            cur+="6"
            display1.text=cur
        }
        seven.setOnClickListener{
            cur+="7"
            display1.text=cur
        }
        eight.setOnClickListener{
            cur+="8"
            display1.text=cur
        }
        nine.setOnClickListener {
            cur += "9"
            display1.text = cur
        }
        addition.setOnClickListener{
            cur+="+"
            display1.text=cur
        }
        substraction.setOnClickListener{
            cur+="-"
            display1.text=cur
        }
        multiply.setOnClickListener{
            cur+="*"
            display1.text=cur
        }
        division.setOnClickListener{
            cur+="/"
            display1.text=cur
        }
        dot.setOnClickListener{
            cur+="."
            display1.text=cur
        }
        equal.setOnClickListener {
            try {
                val text = last + cur
                val expression = ExpressionBuilder(text).build()
                val result=expression.evaluate()

                display2.text=result.toString()
                display1.text=text
                last=result.toString()
                cur=""

            }
            catch(e:Exception){
                display2.text=""
                display1.text="Math Error"
                cur=""
                last=""
            }
        }
        reset.setOnClickListener{
            display1.text="0"
            display2.text=""
            last=""
            cur=""
        }





    }
}