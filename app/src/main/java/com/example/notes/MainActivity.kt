package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var title: EditText;
    private lateinit var note: EditText;
    private lateinit var addBtn: Button;
    private lateinit var testField: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = findViewById(R.id.editTitle)
        note = findViewById(R.id.editNote)
        addBtn = findViewById(R.id.addBtn)
        testField = findViewById(R.id.textfield)

        addBtn.setOnClickListener { addNote() }
    }

    private fun addNote() {
        if (title.text.toString().isEmpty()) {
            Toast.makeText(this, "Empty title", Toast.LENGTH_SHORT).show()
            return
        }
        if (note.text.toString().isEmpty()) {
            Toast.makeText(this, "Empty note", Toast.LENGTH_SHORT).show()
            return
        }

        var text = testField.text.toString()
        text += "\n" + title.text.toString() + ":\n" + note.text.toString() + "\n"

        testField.setText(text)

        title.setText("")
        note.setText("")
    }


}