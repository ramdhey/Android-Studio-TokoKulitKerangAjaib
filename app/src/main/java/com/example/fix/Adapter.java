package com.example.fix;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<SetterGetter> listdata;
    public Adapter(ArrayList<SetterGetter>listdata){
        this.listdata=listdata;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dashboard_item,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        final  SetterGetter getData=listdata.get(position);
        String judul = getData.getJudul();
        String gambarnya = getData.getGambarnya();

        holder.judul.setText(judul) ;
        if (gambarnya.equals("ebook")){
            holder.gambarnya.setImageResource(R.drawable.ebook);
        }else if (gambarnya.equals("house")){
            holder.gambarnya.setImageResource(R.drawable.house);
        }else if (gambarnya.equals("pulsa")){
            holder.gambarnya.setImageResource(R.drawable.pulsa);
        }else if (gambarnya.equals("listrik")){
            holder.gambarnya.setImageResource(R.drawable.listrik);
        }else if (gambarnya.equals("bicycle")){
            holder.gambarnya.setImageResource(R.drawable.bicycle);
        }else if (gambarnya.equals("quit")){
            holder.gambarnya.setImageResource(R.drawable.ticket);
        }

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView judul;
        ImageView gambarnya;
        public Holder(@NonNull View itemView) {
            super(itemView);

            judul=itemView.findViewById(R.id.quit);
            gambarnya=itemView.findViewById(R.id.gmbrnya);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context,Order.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}
