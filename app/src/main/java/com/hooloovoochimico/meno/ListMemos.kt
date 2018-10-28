package com.hooloovoochimico.meno

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MemosAdapter(private val memos: Array<Memo>) :
        RecyclerView.Adapter<MemosAdapter.MyViewHolder>() {

    class MyViewHolder(val memoView: TextView) : RecyclerView.ViewHolder(memoView)


    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MemosAdapter.MyViewHolder {

        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.my_text_view, parent, false) as TextView

        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = memos[position]
    }

    override fun getItemCount() = memos.size
}