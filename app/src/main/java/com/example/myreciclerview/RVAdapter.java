package com.example.myreciclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonaViewHolder>{

    List<Persona> personas;
    Context context;


    public RVAdapter(List<Persona> personas, Context context) {
        this.personas = personas;
        this.context = context;
    }

    @NonNull
    @Override
    public RVAdapter.PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent
            , int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.persona,parent,false);

        PersonaViewHolder personaViewHolder = new PersonaViewHolder(view);

        return personaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.PersonaViewHolder holder
            , int position) {
        holder.nombrePersona.setText(personas.get(position).nombre);
        holder.edadPersona.setText(personas.get(position).edad);
        holder.clubPersona.setText(personas.get(position).club);


        Drawable original = context
                        .getResources()
                        .getDrawable(personas.get(position).foto, null);
        Bitmap originalBitmap = ((BitmapDrawable)original).getBitmap();
        RoundedBitmapDrawable roundedBitmapDrawable =
                RoundedBitmapDrawableFactory.create(context.getResources()
                ,originalBitmap);
        roundedBitmapDrawable.setCornerRadius(originalBitmap.getHeight());

        holder.fotoPersona.setImageDrawable(roundedBitmapDrawable);

        holder.setOnClickListeners();

    }

    @Override
    public int getItemCount() {
        return personas.size();
    }



    public  static  class  PersonaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //context
        Context context;
        CardView cardView;
        TextView nombrePersona;
        TextView edadPersona;
        TextView clubPersona;
        ImageView fotoPersona;
        Button btnDetails;
        TextView detallesPersona;

        public  PersonaViewHolder(@NonNull View itemView){
            super(itemView);
            context = itemView.getContext();

            cardView = (CardView)itemView.findViewById(R.id.cv);
            nombrePersona = (TextView)itemView.findViewById(R.id.nombrePersona);
            edadPersona = (TextView)itemView.findViewById(R.id.edadPersona);
            clubPersona = (TextView)itemView.findViewById(R.id.clubPersona);
            fotoPersona = (ImageView) itemView.findViewById(R.id.fotoPersona);
            detallesPersona =(TextView) itemView.findViewById(R.id.tvDetalles);



            btnDetails =(Button) itemView.findViewById(R.id.btnDetails);

        }
        void setOnClickListeners(){
            btnDetails.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnDetails:
                    Intent intent = new Intent(context, DetailsActivity.class);

                    intent.putExtra("club", edadPersona.getText());
                    context.startActivity(intent);



                    break;




            }
        }
    }

}
