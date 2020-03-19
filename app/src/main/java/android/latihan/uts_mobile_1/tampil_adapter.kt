package android.latihan.uts_mobile_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class tampil_adapter (val facList: List<fakultasData>, val clickListener: (fakultasData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item, parent,false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(facList[position], clickListener)
    }

    override fun getItemCount(): Int = facList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(fakTampil: fakultasData, clickListener: (fakultasData) -> Unit){
            val myImage = itemView.findViewById<ImageView>(R.id.img_part)
            myImage.setImageResource(fakTampil.photo)
            itemView.part_item_name.text = fakTampil.facName
            itemView.setOnClickListener{clickListener(fakTampil)}
        }
    }
}