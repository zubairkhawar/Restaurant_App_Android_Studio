package com.example.restaurantapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    private ArrayList<Restaurant> restaurantList;
    private Context context;
    private final static int FADE_DURATION = 1000; // in milliseconds
    private AlertDialog alertDialog;

    public RestaurantAdapter(Context context, ArrayList<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);
        holder.bind(restaurant);
        setFadeAnimation(holder.itemView);

        // Set click listener for the card
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display popup with restaurant details
                showPopup(restaurant);
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    private void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);
    }

    private void showPopup(Restaurant restaurant) {
        // Create a custom popup layout
        View popupView = LayoutInflater.from(context).inflate(R.layout.popup_layout, null);

        // Set restaurant details in the popup layout
        TextView textViewName = popupView.findViewById(R.id.popupTextViewName);
        textViewName.setText(restaurant.getName());

        TextView textViewLocation = popupView.findViewById(R.id.popupTextViewLocation);
        textViewLocation.setText(restaurant.getLocation());

        TextView textViewPhone = popupView.findViewById(R.id.popupTextViewPhone);
        textViewPhone.setText(restaurant.getPhone());

        TextView textViewDescription = popupView.findViewById(R.id.popupTextViewDescription);
        textViewDescription.setText(restaurant.getDescription());

        // Close button functionality
        ImageView imageViewClose = popupView.findViewById(R.id.imageViewClose);
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss(); // Dismiss the popup
            }
        });

        // Create AlertDialog and set the custom layout
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(popupView);
        alertDialog = builder.create();
        alertDialog.show();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private MaterialCardView cardView;
        private TextView textViewName, textViewLocation;
        private ImageView imageViewRestaurant;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewLocation = itemView.findViewById(R.id.textViewLocation);
            imageViewRestaurant = itemView.findViewById(R.id.imageViewRestaurant);
        }

        public void bind(Restaurant restaurant) {
            textViewName.setText(restaurant.getName());
            textViewLocation.setText(restaurant.getLocation());
            // Set restaurant image here using Picasso or Glide library
            // Example: Picasso.get().load(restaurant.getImageUrl()).into(imageViewRestaurant);
            // Or: Glide.with(context).load(restaurant.getImageUrl()).into(imageViewRestaurant);
        }
    }
}
