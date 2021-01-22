package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleview.DataSource.Companion.createDataSet
import javax.sql.DataSource
class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerViewOn()
        addDataSet()

//        val productList = ArrayList<Product>()
//        productList.add(Product(1, "pizza", "peperoni", R.drawable.ic_baseline_local_pizza_24, true))
//        productList.add(Product(2,"Gas","Premium",R.drawable.ic_baseline_local_gas_station_24, true))
//        productList.add(Product(3,"McDonalds","Burger Menu",R.drawable.ic_baseline_fastfood_24, false))


//        productList.add(Product(1,1))


//        val adapter = ProductAdapter(productList)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = adapter

    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        productAdapter.submitList(data)
    }

    private fun recyclerViewOn(){
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        productAdapter = ProductAdapter()
        recyclerView.adapter = productAdapter
    }
