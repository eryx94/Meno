package com.hooloovoochimico.meno.listmemos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hooloovoochimico.meno.Memo
import com.hooloovoochimico.meno.R


class ListMemosActivity : AppCompatActivity(), IView {
    override fun fillAdapter(menos: List<Memo>) {
        recyclerView.adapter = MemosAdapter(menos)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memos_list)

        recyclerView = findViewById<RecyclerView>(R.id.memos_recycler).apply{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ListMemosActivity)
        }
    }

    private lateinit var recyclerView: RecyclerView
    private val presenter = ListMemosPresenter(this)
}
