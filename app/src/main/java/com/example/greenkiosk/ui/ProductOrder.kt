package com.example.greenkiosk.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.greenkiosk.R
import com.squareup.picasso.Picasso

class ProductOrder(var cardTitles: Array<String>, var cardImages: Array<String>, var cardKilograms: Array<String>, var cardPrices: Array<String>): RecyclerView.Adapter<ProductOrdersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductOrdersViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.products_orders,parent,false)
        return ProductOrdersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductOrdersViewHolder, position: Int) {
        holder.cardTitle.text=cardTitles[position]
        holder.cardKilograms.text=cardKilograms[position]
        holder.cardPrices.text=cardPrices[position]
        Picasso.get().load(cardImages[position]).into(holder.cardImages)
    }

    override fun getItemCount(): Int {
        return cardImages.size
    }

}
class ProductOrdersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var cardImages=itemView.findViewById<ImageView>(R.id.imgProduct1)
    var cardTitle= itemView.findViewById<TextView>(R.id.etProduct)
    var cardKilograms=itemView.findViewById<TextView>(R.id.etKilograms)
    var cardPrices=itemView.findViewById<TextView>(R.id.etPrices)
}
