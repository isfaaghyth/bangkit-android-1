package app.isfaaghyth.bangkit

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var txtResult: TextView
    private lateinit var btnCalculate: Button

    private val STATE_RESULT_ID = "result_text_id"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // it will be render the layout activity
        setContentView(R.layout.activity_main)

        // casting the view components (link) into the ids
        txtResult = findViewById(R.id.txt_result)
        btnCalculate = findViewById(R.id.btn_calculate)

        // render the state
        savedInstanceState?.let {
            txtResult.text = it.getString(STATE_RESULT_ID).orEmpty()
        }

        // if the button is clicked, it will be change the text result
        btnCalculate.setOnClickListener {
            txtResult.text = "Hai, I'm Isfa ganteng!"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // this is for save the last state of the text result
        outState.putString(STATE_RESULT_ID, txtResult.text.toString())
    }

}