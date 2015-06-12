package com.appxperts.cardviewandrecyclerviewstudy;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {


    RecyclerView recyclerView;

    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        initializeData();

        MyAdapter ma = new MyAdapter(persons);

        recyclerView.setAdapter(ma);


    }

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData() {
        persons = new ArrayList<>();
        persons.add(new Person("Tin Tin", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Winnie Pooh", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Pikachu", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Atif", "13 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Donald Duck", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Balu", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Uncle Scrooge", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Luanchpad", "16 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Don Karnash", "37 years old", R.mipmap.ic_launcher));
    }

}
