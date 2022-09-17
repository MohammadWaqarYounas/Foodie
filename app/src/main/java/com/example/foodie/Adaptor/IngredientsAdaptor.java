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

public class IngredientsAdaptor extends RecyclerView.Adapter<IngredientsAdaptor.viewHolder>{
    ArrayList<String> list;
    Context context;

    //-->Constructor
    public IngredientsAdaptor(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public IngredientsAdaptor.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.ingredient_widget,parent,false);
        //-->Agr new keyword na lgaen to next listing product ka size different ho jata h.
        return new IngredientsAdaptor.viewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        String model = list.get(position);

//        holder.ingimage.setImageResource(model.getImage());
//        holder.name.setText(model.getName());
    }


    @Override
    public int getItemCount() {
        //-->List ka size count krta hy.
        return list.size();
    }


    //-->recycler View mn veiw ko hold krata hy.
    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView ingimage;
        TextView name;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            ingimage= itemView.findViewById(R.id.ingredientpicture);
            name= itemView.findViewById(R.id.ingredientname);

        }
    }
}
