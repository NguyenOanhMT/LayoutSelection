package com.nguyenoanh.selection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Selection extends AppCompatActivity {
    RecyclerView recyclerView1, recyclerView2, recyclerView3, recyclerView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);



        //Hot Today
        ArrayList<Item> itemList1 = new ArrayList<>();
        recyclerView1 = (RecyclerView)findViewById(R.id.recycler_hot_today);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        itemList1.add(
                new Item(Item.ItemType.ONE_ITEM,
                        getResources().getString(R.string.title_hot_today),
                        getResources().getString(R.string.pice_discount1),
                        getResources().getString(R.string.pice1),
                        R.drawable.recommendation_banner_1));

        itemList1.add(
                new Item(Item.ItemType.ONE_ITEM,
                        getResources().getString(R.string.title_hot_today),
                        getResources().getString(R.string.pice_discount1),
                        getResources().getString(R.string.pice1),
                        R.drawable.recommendation_banner_1));

        itemList1.add(
                new Item(Item.ItemType.ONE_ITEM,
                        getResources().getString(R.string.title_hot_today),
                        getResources().getString(R.string.pice_discount1),
                        getResources().getString(R.string.pice1),
                        R.drawable.recommendation_banner_1));
        ItemAdapter todayAdapter = new ItemAdapter(this, itemList1);
        recyclerView1.setAdapter(todayAdapter);

        //City Guilde
        ArrayList<Item> itemList2 = new ArrayList<>();
        recyclerView2 = (RecyclerView)findViewById(R.id.recycler_city);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        itemList2.add(
                new Item(Item.ItemType.TWO_ITEM,
                        getResources().getString(R.string.title_city1),
                        R.color.colorDrink,
                        R.drawable.drinks));

        itemList2.add(
                new Item( Item.ItemType.TWO_ITEM,
                        getResources().getString(R.string.title_city2),
                        R.color.colorGreen,
                        R.drawable.greens));

        itemList2.add(
                new Item(Item.ItemType.TWO_ITEM,
                        getResources().getString(R.string.title_city1),
                        R.color.colorDrink,
                        R.drawable.drinks));

        itemList2.add(
                new Item( Item.ItemType.TWO_ITEM,
                        getResources().getString(R.string.title_city2),
                        R.color.colorGreen,
                        R.drawable.greens));
        ItemAdapter cityAdapter = new ItemAdapter(this, itemList2);
        recyclerView2.setAdapter(cityAdapter);

        //Speical Offers
        ArrayList<Item> itemList3 = new ArrayList<>();
        recyclerView3 = (RecyclerView)findViewById(R.id.recycler_speical);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        itemList3.add(
                new Item(Item.ItemType.THREE_ITEM,
                        getResources().getString(R.string.title_speical1),
                        getResources().getString(R.string.place1),
                        getResources().getString(R.string.pice_discount21),
                        getResources().getString(R.string.pice21),
                        R.drawable.rectangle_2));

        itemList3.add(
                new Item(Item.ItemType.THREE_ITEM,
                        getResources().getString(R.string.title_speical2),
                        getResources().getString(R.string.place2),
                        getResources().getString(R.string.pice_discount22),
                        getResources().getString(R.string.pice22),
                        R.drawable.rectangle_1));

        itemList3.add(
                new Item(Item.ItemType.THREE_ITEM,
                        getResources().getString(R.string.title_speical1),
                        getResources().getString(R.string.place1),
                        getResources().getString(R.string.pice_discount21),
                        getResources().getString(R.string.pice21),
                        R.drawable.rectangle_2));
        ItemAdapter speicalAdapter = new ItemAdapter(this, itemList3);
        recyclerView3.setAdapter(speicalAdapter);

        //Colums
        ArrayList<Item> itemList4 = new ArrayList<>();
        recyclerView4 = (RecyclerView)findViewById(R.id.recycler_colums);
        recyclerView4.setHasFixedSize(true);
        recyclerView4.setLayoutManager(new LinearLayoutManager(this));
        itemList4.add(
                new Item(Item.ItemType.FOUR_ITEM,
                        getResources().getString(R.string.title_colum1)));

        itemList4.add(
                new Item(Item.ItemType.FOUR_ITEM,
                        getResources().getString(R.string.title_colum2)));

        itemList4.add(
                new Item(Item.ItemType.FOUR_ITEM,
                        getResources().getString(R.string.title_colum3)));
        ItemAdapter columAdapter = new ItemAdapter(this, itemList4);
        recyclerView4.setAdapter(columAdapter);
    }
}
