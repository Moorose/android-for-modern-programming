package com.example.android.droidcafeinput;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.RecipeViewHolder> {
    private final LinkedList<Recipe> mRecipesList;
    private LayoutInflater mInflater;
    private Context context;

    public RecipeListAdapter(Context context, LinkedList<Recipe> mRecipesList) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.mRecipesList = mRecipesList;
    }

    @NonNull
    @Override
    public RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.recipe_item, parent, false);
        return new RecipeViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        Recipe recipe = mRecipesList.get(position);
        holder.recipeHeaderTextView.setText(recipe.getHeader());
        holder.recipeContentTextView.setText(recipe.getShortContent());
    }

    @Override
    public int getItemCount() {
        return mRecipesList.size();
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView recipeHeaderTextView;
        public final TextView recipeContentTextView;
        final RecipeListAdapter mAdapter;

        public RecipeViewHolder(@NonNull View itemView, RecipeListAdapter adapter) {
            super(itemView);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
            recipeHeaderTextView = itemView.findViewById(R.id.recipe_item_header);
            recipeContentTextView = itemView.findViewById(R.id.recipe_item_content);
        }

        @Override
        public void onClick(View v) {
            final int position = getAdapterPosition();
            Intent intent = new Intent(v.getContext(), RecipeItemActivity.class);
            intent.putExtra(Recipe.class.getSimpleName() , mRecipesList.get(position));
            context.startActivity(intent);
        }
    }
}
