package com.example.foodie;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodie.Adaptor.ProductAdapter;
import com.example.foodie.Classes.RecyclerItemClickListener;
import com.example.foodie.Model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    RelativeLayout img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.dash);

        rv =findViewById(R.id.list);
        ArrayList<Product> list = new ArrayList<>();
        ArrayList<String> pizzaIngredients = new ArrayList<>();


        list.add(new Product(R.drawable.pizza, "Pizza","i am the Pizza description", "i am the recipe"));
        list.add(new Product(R.drawable.pasta, "Pasta","i am the Pasta description", "i am the recipe"));
        list.add(new Product(R.drawable.steak, "Steak","i am the Steak description", "i am the recipe"));
        list.add(new Product(R.drawable.steak, "Spicy Steak","i am the description", "i am the recipe"));
        list.add(new Product(R.drawable.steak, "Steak","i am the description", "i am the recipe"));
        list.add(new Product(R.drawable.steak, "Steak","i am the description", "i am the recipe"));





        ProductAdapter ad = new ProductAdapter(list,this);
        rv.setAdapter(ad);


        LinearLayoutManager lm= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(lm);

        rv.addOnItemTouchListener( new RecyclerItemClickListener(this, rv, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                Intent i= new Intent(MainActivity.this,Product_Details.class);
                i.putExtra("productdetails", list.get(position));
                startActivity(i);

            }

            @Override
            public void onLongItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "I am Product "+position, Toast.LENGTH_SHORT).show();

            }
        }));
    }
}