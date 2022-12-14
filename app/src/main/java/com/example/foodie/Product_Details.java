package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foodie.Adaptor.IngredientsAdaptor;
import com.example.foodie.Model.Product;

public class Product_Details extends AppCompatActivity{

    RecyclerView rv;
    ImageView productImage;
    TextView name,description,recipe;
    Product p = new Product();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        rv =findViewById(R.id.ingredientsrecycleview);
        productImage=findViewById(R.id.productimage);
        name=findViewById(R.id.productname);
        description=findViewById(R.id.description);
        recipe=findViewById(R.id.recipe);

        p = (Product) getIntent().getSerializableExtra("productdetails");
        productImage.setImageResource(p.getImage());
        name.setText(p.getName());
        description.setText(p.getDescription());
        recipe.setText(p.getRecipe());

        IngredientsAdaptor ad= new IngredientsAdaptor(p.getIngredients(),this);

    }
}