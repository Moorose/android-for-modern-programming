package com.example.android.droidcafeinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_item);

        TextView header = findViewById(R.id.recipe_header);
        ImageView imageView = findViewById(R.id.recipe_img);
        TextView content = findViewById(R.id.recipe_content);

        Bundle arguments = getIntent().getExtras();
        final Recipe recipe;
        if (arguments != null) {
            recipe = (Recipe) arguments.getSerializable(Recipe.class.getSimpleName());
            header.setText(recipe.getHeader());
            content.setText(recipe.getContent());
            setImage(imageView, recipe.getImg());
        }
    }

    void setImage(ImageView imageView, String ID) {
        String[] imgs = getResources().getStringArray(R.array.img_recipes_array);
            if (ID.equals(imgs[0])) {
                imageView.setImageResource(R.drawable.dessert_crepes);
            }
            if (ID.equals(imgs[1])) {
                imageView.setImageResource(R.drawable.cake_balls);
            }
            if (ID.equals(imgs[2])) {
                imageView.setImageResource(R.drawable.battenburg_cake);
            }
            if (ID.equals(imgs[3])) {
                imageView.setImageResource(R.drawable.chocolate_covered_oreos);
            }
            if (ID.equals(imgs[4])) {
                imageView.setImageResource(R.drawable.delish_oreo_truffles);
            }
            if (ID.equals(imgs[5])) {
                imageView.setImageResource(R.drawable.ice_cream_sandwiches);
            }
            if (ID.equals(imgs[6])) {
                imageView.setImageResource(R.drawable.cake_balls);
            }
    }
}
