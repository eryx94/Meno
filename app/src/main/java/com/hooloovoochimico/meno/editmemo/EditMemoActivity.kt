package com.hooloovoochimico.meno.editmemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.hooloovoochimico.meno.Memo
import com.hooloovoochimico.meno.MenoConstant.EXTRA_MODIFY_ID
import com.hooloovoochimico.meno.Notifier
import com.hooloovoochimico.meno.R


class EditMemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_memo)

        val title = findViewById<EditText>(R.id.title)
        val body = findViewById<EditText>(R.id.body)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val note = Notifier(this, 1, Memo(1, title.text.toString(), body.text.toString()))
            note.showNotify()
        }

        if(intent.hasExtra(EXTRA_MODIFY_ID)){
            title.setText("Questo è un evento di modifica xD")
            val testo = "Questa è l'evento di modifica dalla notifica: ${intent.getIntExtra(EXTRA_MODIFY_ID, 0)}"
            body.setText(testo)
        }





    }
}
