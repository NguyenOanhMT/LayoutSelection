package com.nguyenoanh.selection;

public class Item{

    public enum ItemType {
        ONE_ITEM, TWO_ITEM, THREE_ITEM, FOUR_ITEM;
    }

    String title;
    String place;
    String piceDiscount;
    String pice;

    int color;
    int image;
    private ItemType itemType;

    public Item(ItemType itemType, String title, String place, String piceDiscount, String pice, int image) {
        this.itemType = itemType;
        this.title = title;
        this.place = place;
        this.piceDiscount = piceDiscount;
        this.pice = pice;
        this.image = image;
    }

    public Item(ItemType itemType, String title, String piceDiscount, String pice, int image) {
        this.itemType = itemType;
        this.title = title;
        this.pice = pice;
        this.piceDiscount = piceDiscount;
        this.image = image;
    }

    public Item(ItemType itemType, String title, int color, int image) {
        this.itemType = itemType;
        this.title = title;
        this.color = color;
        this.image = image;
    }

    public Item(ItemType itemType,String title) {
        this.itemType = itemType;
        this.title = title;
    }

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPice() {
        return pice;
    }

    public void setPice(String pice) {
        this.pice = pice;
    }

    public String getPiceDiscount() {
        return piceDiscount;
    }

    public void setPiceDiscount(String piceDiscount) {
        this.piceDiscount = piceDiscount;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

