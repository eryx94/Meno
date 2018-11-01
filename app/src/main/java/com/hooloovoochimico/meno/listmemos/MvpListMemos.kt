package com.hooloovoochimico.meno.listmemos

import android.content.Context
import com.hooloovoochimico.meno.Memo
import kotlinx.coroutines.*

interface IView{
    fun fillAdapter(menos: List<Memo>)
}

interface IPresenter{
    fun subscribe(view: IView)
    fun unsubscribe()
    fun loadMemos()
}

interface ILogic{
    fun loadMemos(): Deferred<List<Memo>>
}

class ListMemosPresenter(private val context: Context): IPresenter{
    override fun subscribe(view: IView) {
        this.view = view
    }

    override fun unsubscribe() {
        this.view = null
    }

    override fun loadMemos() {
        GlobalScope.launch(Dispatchers.Main) {

            logic.loadMemos().await()
        }
    }

    private var view: IView? = null
    private val logic = ListMemosLogic(context)

}

class ListMemosLogic(private val context: Context): ILogic{
    override fun loadMemos(): Deferred<List<Memo>> {
        return GlobalScope.async(Dispatchers.IO) {
            listOf<Memo>()
        }
    }

}
