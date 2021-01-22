package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.product_item.view.*

class ProductAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Product> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.product_item,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ProductViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    fun submitList(product: List<Product>){
        items = product
    }

    class ProductViewHolder(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val product_image = itemView.imageView

        fun bind(product: Product){


            val requestOptions = RequestOptions().placeholder(R.drawable
                .ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(product.image)
                .into(product_image)
        }

    }


}

//class ProductAdapter(private var products: List<Product>,context: Context):
//    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

//    class ProductViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

//        val imageView: ImageView = //itemView.findViewById(R.id.imageView)
//        val textView: TextView = itemView.findViewById(R.id.textView)
//        val textView2: TextView = itemView.findViewById(R.id.textView2)
//        val imageView2: ImageView = //itemView.findViewById(R.id.imageView2)
//    }

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
//        return ProductViewHolder(view)
//    }



//    override fun getItemCount(): Int = products.size


//    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
//        val p = products[position]
//
//        holder.imageView.setImageResource(p.image)





//        holder.textView.text = p.title

//        holder.textView2.text = p.description

//        if(!p.isimportant)
//            holder.imageView2.visibility = View.GONE
//    }
//}


