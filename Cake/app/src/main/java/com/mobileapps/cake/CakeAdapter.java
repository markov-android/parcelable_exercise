package com.mobileapps.cake;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.MyViewHolder> {

    private ArrayList<Cake> cakes;
    //REMEMBER: THERE ARE FOR METHODS TO BE ALWAYS MENTIONED IN THIS CLASS OF ADAPTER
    // 1. Constructor of the class
    // 2. Static inner class to initialize the views of rows
    // 3. onCreateViewHolder(): specify the row layout file and click for each row
    // 4. onBindViewHolder(): load data in each row element
    // 5. getItemCount(): check the size
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewEmail;
        ImageView imageViewIcon;

        public String versionName;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewEmail = (TextView) itemView.findViewById(R.id.textViewEmail);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);

            //     itemView.setOnClickListener(new View.OnClickListener() {

            //         @Override
            //        public void onClick(View v) {

            //          Toast.makeText(v.getContext(), "OnClick Version :"+versionName,
            //                Toast.LENGTH_SHORT).show();

            //  }
            //});

//            itemView.setOnLongClickListener(new View.OnLongClickListener() {

            //              @Override
            //            public boolean onLongClick(View v) {

            //              Toast.makeText(v.getContext(), "OnLongClick Version :"+versionName ,
            //                    Toast.LENGTH_SHORT).show();
            //          return true;

            //    }
            //});
        }
    }

    public CakeAdapter(ArrayList<Cake> cakes) {
        this.cakes = cakes;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);
//Click event
        view.setOnClickListener(MainActivity.myOnClickListener);


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewEmail = holder.textViewEmail;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(cakes.get(listPosition).getTitle());
        textViewEmail.setText(cakes.get(listPosition).getDesc());
        //imageView.setImageResource(cakes.get(listPosition).getImage());
        holder.versionName=textViewName.getText().toString();


    }

    @Override
    public int getItemCount() {
        return cakes.size();
    }
}
