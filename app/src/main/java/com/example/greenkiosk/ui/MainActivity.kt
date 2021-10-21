package com.example.greenkiosk.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getProductDetails()
    }
    fun getProductDetails(){

        val rvOrders=findViewById<RecyclerView>(R.id.rvOrders)
        val cardTitle: Array<String> = resources.getStringArray(R.array.cardTitles)
        val cardImages: Array<String> = resources.getStringArray(R.array.cardImages)
        val cardKilograms: Array<String> =resources.getStringArray(R.array.cartKilograms)
        val cardPrices: Array<String> =resources.getStringArray(R.array.cardPrices)
        val adapter= ProductOrder(cardTitle,cardImages,cardKilograms,cardPrices)
        val gridLayout= GridLayoutManager(this, 2)
        rvOrders.layoutManager= gridLayout
        rvOrders.adapter=adapter

    }
    fun viewCheckout(){
        
    }
}