package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var waveLoadingView: ProgressBar = findViewById(R.id.progressBar1);
        waveLoadingView.setProgress(0);
        val myButton: Button = findViewById(R.id.button1)
        val myCheckBox: CheckBox = findViewById(R.id.checkBox1)
        myCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                myButton.setOnClickListener {
                    val myEditText = findViewById<View>(R.id.edittext1) as EditText
                    val myTextView = findViewById<View>(R.id.textView1) as TextView
                    val result = myEditText.text.toString()
                    myTextView.text = result
                    waveLoadingView.setProgress(waveLoadingView.getProgress() + 10);
                }
            } else {
                val myTextView = findViewById<View>(R.id.textView1) as TextView
                myButton.setOnClickListener {
                    myTextView.text = "Поставь галочку :)"
                }
            }
        }
    }
}