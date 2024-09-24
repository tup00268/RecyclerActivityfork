package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val numbers: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* TODO Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NumberViewHolder (
        TextView(parent.context).apply {
            setPadding(5,5,5,5)
        }
        //val textView = TextView(parent.context)
        // textView.setPadding(5, 5, 5, 5)
        //val numberViewHolder = NumberViewHolder(textView)
        //return numberViewHolder
    )

    override fun getItemCount() = numbers.size

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
        holder.textView.textSize = numbers[position].toFloat()
    }

    // TODO Step 3b: Complete function definitions for adapter

}