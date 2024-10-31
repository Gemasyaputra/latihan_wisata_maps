package com.gema.latihan_wisata_bukittinggi.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gema.latihan_wisata_bukittinggi.DetailActivity
import com.gema.latihan_wisata_bukittinggi.R
import com.gema.latihan_wisata_bukittinggi.model.modelWisata

class adapterWisata(
    val itemListWisata: List<modelWisata>
): RecyclerView.Adapter<adapterWisata.MyviewHolder>() {
    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)  {

        var imgwisata : ImageView = itemView.findViewById(R.id.imgWisata)
        var txtnama: TextView = itemView.findViewById(R.id.txtnama)
        var txtdaerah : TextView = itemView.findViewById(R.id.txtdaerah)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemwisata,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemListWisata.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = itemListWisata[position]
        holder.imgwisata.setImageResource(currentItem.image)
        holder.txtnama.setText(currentItem.nama)
        holder.txtdaerah.setText(currentItem.daerah)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java).apply {
                // Mengirim data melalui intent
                putExtra("deskripsi", currentItem.deskripsi)
                putExtra("namaWisata",currentItem.nama)
                putExtra("imagewisata", currentItem.image)
                putExtra("latitude", currentItem.latitude)
                putExtra("longitude", currentItem.longitude)
            }
            context.startActivity(intent)
        }


    }


}
