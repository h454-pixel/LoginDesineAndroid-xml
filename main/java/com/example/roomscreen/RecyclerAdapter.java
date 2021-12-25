package com.example.roomscreen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    ArrayList personimagess;
    ArrayList personNames;
    Context context;

    public RecyclerAdapter(Context context, ArrayList personNames, ArrayList personimagess) {
        this.context = context;
        this.personimagess =personimagess;
        this.personNames = personNames;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.reycler_lay, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v,context); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText((String) personNames.get(position));
        holder.imageView.setImageResource((Integer ) personimagess.get(position));
        // implement setOnClickListener event on item view.

    }

    @Override
    public int getItemCount() {
        return personNames.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView name;
        ImageView imageView;// init the item view's
        Context context;
     //   ArrayList personimagess;

        public MyViewHolder(View itemView, Context context) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.text_rr);
            imageView =(ImageView) itemView.findViewById(R.id.image_rr);
            itemView.setOnClickListener(this);
            this.context =context;
         //   this.personimagess=personimagess;
        }

        @Override
        public void onClick(View v) {
          // Intent intent =new Intent(context,MainAcitivitydisyplay.class);
            //intent.putExtra("imageid", (Integer) personimagess.get(getAdapterPosition()));
            //context.startActivity(intent);

        }
    }


}
