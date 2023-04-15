package com.example.mylibarary;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class adapterforseallbooks extends RecyclerView.Adapter<adapterforseallbooks.ViewHolder>{
   private ArrayList <Books> al = new ArrayList<>();
   private Context context;

    public adapterforseallbooks(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewforseeallbooks,parent,false);
                ViewHolder holder= new ViewHolder(view);
                return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final  int position) {
holder.txt.setText(al.get(position).getName());
holder.img.setImageResource(al.get(position).getImages());
        holder.authorname.setText(al.get(position).getAuthor());
        holder.Shortdesc.setText(al.get(position).getShortDesc());

holder.cardView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent= new Intent(context,bookdetails.class);
context.startActivity(intent);
    }
});
if(al.get(position).isExpand()){
    holder.expandable.setVisibility(View.VISIBLE);
    holder.downarrow.setVisibility(View.INVISIBLE);
}
else{
    holder.expandable.setVisibility(View.INVISIBLE);
    holder.downarrow.setVisibility(View.VISIBLE);
}
    }


    @Override
    public int getItemCount() {
        return al.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder
    {
        private RelativeLayout cardView;
        private ImageView img;
        private TextView txt,authorname,Shortdesc;


private RelativeLayout expandable;
private  ImageView uparrow;
private  ImageView downarrow;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardview);
           img=itemView.findViewById(R.id.img);
            txt=itemView.findViewById(R.id.books);
uparrow=itemView.findViewById(R.id.uparrow);
          downarrow=itemView.findViewById(R.id.downarrow);
          expandable=itemView.findViewById(R.id.expandable);
          authorname=itemView.findViewById(R.id.author);
          Shortdesc=itemView.findViewById(R.id.shortdecs);

          uparrow.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                 Books books= al.get(getAdapterPosition());
                 if(books.isExpand()==false){
                     books.setExpand(true);
                     notifyItemChanged(getAdapterPosition());
                 }
                 else{
                     books.setExpand(false);

                 notifyItemChanged(getAdapterPosition());}
              }
          });
        downarrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Books books= al.get(getAdapterPosition());
                    if(books.isExpand()==false){
                        books.setExpand(true);
                        notifyItemChanged(getAdapterPosition());
                    }
                    else {
                        books.setExpand(false);

                        notifyItemChanged(getAdapterPosition());
                    }
                }
            });
        }
    }

   public  void adapterforseallbooks(ArrayList<Books> al) {
        this.al = al;
        notifyDataSetChanged();
    }
}
