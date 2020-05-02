package com.example.recyclerviewrepeat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private LayoutInflater layoutInflater;
    private List<String> datanumber;
    private List<String> datawords;

    public Adapter(Context context, List<String> datanumber, List<String> datawords) {

        this.layoutInflater = LayoutInflater.from(context);
        this.datanumber = datanumber;
        this.datawords = datawords;
    }




    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.recyclelayout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String number= datanumber.get(position);
        holder.number.setText(number);

        String words = datawords.get(position);
        holder.words.setText(words);



    }

    @Override
    public int getItemCount() {
        return datanumber.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView number;
        TextView words;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            number=itemView.findViewById(R.id.number);
            words = itemView.findViewById(R.id.words);
        }
    }
}














