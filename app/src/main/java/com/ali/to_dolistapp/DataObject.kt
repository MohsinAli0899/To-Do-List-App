package com.ali.to_dolistapp

object DataObject {

    var listdata = mutableListOf<CardInfo>()

    fun setData(title: String, priority: String) {
        listdata.add(CardInfo(title, priority))
    }

    fun getData(): List<CardInfo>{
        return listdata
    }

    fun deleteData(){
        listdata.clear()
    }
}