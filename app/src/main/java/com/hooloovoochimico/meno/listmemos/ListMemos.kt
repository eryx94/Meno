package com.hooloovoochimico.meno.listmemos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.hooloovoochimico.meno.Memo
import com.hooloovoochimico.meno.R
import kotlinx.android.synthetic.main.memo_view.view.*

class MemosAdapter(private val memos: Array<Memo>) :
        RecyclerView.Adapter<MemosAdapter.MyViewHolder>() {

    class MyViewHolder(val memoView: LinearLayout) : RecyclerView.ViewHolder(memoView){
        val title: TextView = memoView.findViewById(R.id.title)

        val body: TextView = memoView.findViewById(R.id.body)
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {

        val memoView = LayoutInflater.from(parent.context)
                .inflate(R.layout.memo_view, parent, false) as LinearLayout

        return MyViewHolder(memoView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.memoView.title.text = memos[position].title
        holder.memoView.title.text = memos[position].body
    }

    override fun getItemCount() = memos.size
}