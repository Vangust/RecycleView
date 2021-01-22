package com.example.recycleview


class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Product>{
            val list = ArrayList<Product>()
            list.add(
                Product(
                    "https://pbs.twimg.com/media/EVYdEGLUUAY0CBs.jpg"
                ))
            return list
        }
    }
}