package com.appxperts.cardviewandrecyclerviewstudy;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gufran on 6/12/15.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder> {


    private List<Person> persons;


    public MyAdapter(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cards_layout, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.person_name.setText(persons.get(i).name);
        personViewHolder.person_age.setText(persons.get(i).age);
        personViewHolder.person_photo.setImageResource(persons.get(i).photo_id);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView person_photo;
        TextView person_name;
        TextView person_age;

        public PersonViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardView);
            this.person_photo = (ImageView) itemView.findViewById(R.id.person_photo);
            this.person_name = (TextView) itemView.findViewById(R.id.person_name);
            this.person_age = (TextView) itemView.findViewById(R.id.person_age);
        }
    }

}
