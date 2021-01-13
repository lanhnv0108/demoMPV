package com.example.recyclerview.model

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.DetailItem
import com.example.recyclerview.MainActivity
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.item_list.view.*

class AdapterRecyclerView(private var mList: ArrayList<Model> , private var context : Context) :
    RecyclerView.Adapter<AdapterRecyclerView.PersonViewHolder>() {
    class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(model: Model) {
            itemView.title.text = model.title
            itemView.description.text = model.des
            itemView.imageView.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
/*        val txt1 = holder.itemView.findViewById<TextView>(R.id.textView)
        val txt2 = holder.itemView.findViewById<TextView>(R.id.textView2)
        val tittle = holder.itemView.findViewById<TextView>(R.id.title)
        val des = holder.itemView.findViewById<TextView>(R.id.description)
        txt1.text = mList[position].lastName
        txt2.text = mList[position].firstName
        tittle.text = mList[position].firstName
        des.text = mList[position].lastName*/
        holder.bindItem(mList[position])
        holder.itemView.setOnClickListener {
            /*when (position) {
                0 -> Log.e("TESS" , "dahdajkdhad")
                1 -> Log.e("TESS" , "dahdajkdhad")
                2 -> Log.e("TESS" , "dahdajkdhad")

            }*/
            val model = mList[position]
            val intent = Intent(context, DetailItem::class.java).apply {
                putExtra("DATA" , mList[position])
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = mList.size
}