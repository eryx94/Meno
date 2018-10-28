package com.hooloovoochimico.meno.listmemos

import android.content.Context
import com.hooloovoochimico.meno.Memo
import java.net.ContentHandler

interface IView{
    fun fillAdapter(menos: List<Memo>)
}

interface IPresenter{
    fun subscribe(view: IView)
    fun unsubscribe()
    fun loadMemos()
}

interface ILogic{
    fun loadMemos()
}

class ListMemosPresenter(private val context: Context)
