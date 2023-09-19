package com.example.wsandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mhs_adaptor extends RecyclerView.Adapter<mhs_adaptor.viewHolder> {
private ArrayList<mhs_model> mhsmodels;

    public mhs_adaptor(ArrayList<mhs_model> mhsmodels) {
        this.mhsmodels = mhsmodels;
    }

    @NonNull
    @Override
    public mhs_adaptor.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
 viewHolder vh=new viewHolder(view);


        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull mhs_adaptor.viewHolder holder, int position) {
        holder.namamhs.setText(mhsmodels.get(position).getNama_mhs());
        holder.fotomhs.setImageResource(mhsmodels.get(position).getFoto_mhs());
    }

    @Override
    public int getItemCount() {

        return mhsmodels.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView namamhs;
        ImageView fotomhs;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            namamhs=itemView.findViewById(R.id.nama_mhs);
            fotomhs=itemView.findViewById(R.id.foto_anggota);


        }
    }
}
