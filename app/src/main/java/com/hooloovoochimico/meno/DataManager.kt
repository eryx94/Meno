package com.hooloovoochimico.meno

import android.content.Context
import net.rehacktive.waspdb.WaspDb
import net.rehacktive.waspdb.WaspFactory

class DataManager(val context: Context){
    private val path = context.filesDir.path
    companion object {
        private const val  databaseName = "MenoDb"
        private const val password = "b0ris"
    }
    
    private val dataBase: WaspDb = WaspFactory.openOrCreateDatabase(path,databaseName,password)

    private val memoDb = dataBase.openOrCreateHash("meno")

    // and simply store it!
    fun storeMemo(memo: Memo){
        memoDb.put(memo.id, memo)
    }
}