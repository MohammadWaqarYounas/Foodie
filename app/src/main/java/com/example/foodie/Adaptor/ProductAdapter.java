package com.example.foodie.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodie.Model.Product;
import com.example.foodie.R;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.viewHolder>{
    ArrayList<Product> list;
    Context context;

    //-->Constructor
    public ProductAdapter(ArrayList<Product> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.product_widget,parent,false);
        //-->Agr new keyword na lgaen to next listing product ka size different ho jata h.
        return new ProductAdapter.viewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.viewHolder holder, int position) {

        //-->Jo k view pr name picture ya kuch B or cheez set | Hold krata hy.
        Product model= list.get(position);

        holder.productimage.setImageResource(model.getImage());
        holder.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        //-->List ka size count krta hy.
        return list.size();
    }


    //-->recycler View mn veiw ko hold krata hy.
    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView productimage;
        TextView name,description,recipe;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            productimage= itemView.findViewById(R.id.picture);
            name= itemView.findViewById(R.id.name);

        }
    }
}
