package com.example.android.droidcafeinput;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.LinkedList;

public class RecipesActivity extends AppCompatActivity {

    private final LinkedList<Recipe> recipeList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private RecipeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        String[] headers = getResources().getStringArray(R.array.header_recipes_array);
        String[] contents = getResources().getStringArray(R.array.content_recipes_array);
        String[] shortContents = getResources().getStringArray(R.array.short_content_recipes_array);
        String[] imgs = getResources().getStringArray(R.array.img_recipes_array);

        for (int i = 0; i < headers.length ; i++) {
            recipeList.add(new Recipe(
                    headers[i],
                    shortContents[i],
                    contents[i],
                    imgs[i]));
        }

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new RecipeListAdapter(this, recipeList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
