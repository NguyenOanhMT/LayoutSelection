package com.nguyenoanh.selection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int TYPE_ONE = 1;
    private static final int TYPE_TWO = 2;
    private static final int TYPE_THREE = 3;
    private static final int TYPE_FOUR = 4;

    private Context context;
    private ArrayList<Item> itemList;

    public ItemAdapter(Context context, ArrayList<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getItemViewType(int i) {
        Item item = itemList.get(i);
        if (item.getItemType() == Item.ItemType.ONE_ITEM) {
            return TYPE_ONE;
        } else if (item.getItemType() == Item.ItemType.TWO_ITEM) {
            return TYPE_TWO;
        } else if (item.getItemType() == Item.ItemType.THREE_ITEM) {
            return TYPE_THREE;
        } else if (item.getItemType() == Item.ItemType.FOUR_ITEM) {
            return TYPE_FOUR;
        } else{
            return -1;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        if (viewType == TYPE_ONE) {
             View view = inflater.inflate(R.layout.item_hot_today, null);
            return new ViewHolderOne(view);
        } else if (viewType == TYPE_TWO) {
            View view =  inflater.inflate(R.layout.item_city, null);
            return new ViewHolderTwo(view);
        } else if (viewType == TYPE_THREE) {
            View view = inflater.inflate(R.layout.item_speical, null);
            return new ViewHolderThree(view);
        } else if (viewType == TYPE_FOUR) {
            View view =  inflater.inflate(R.layout.item_colums, null);
            return new ViewHolderFour(view);
        } else {
            throw new RuntimeException("Exception");
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        switch (holder.getItemViewType()) {
            case TYPE_ONE:
                initLayoutOne((ViewHolderOne)holder, i);
                break;
            case TYPE_TWO:
                initLayoutTwo((ViewHolderTwo) holder, i);
                break;
            case TYPE_THREE:
                initLayoutThree((ViewHolderThree)holder, i);
                break;
            case TYPE_FOUR:
                initLayoutFour((ViewHolderFour) holder, i);
                break;
            default:
                break;
        }
    }

    //type one
    private void initLayoutOne(ViewHolderOne holder, int i) {
        Item item = itemList.get(i);

        holder.title.setText(item.getTitle());
        holder.discount.setText(item.getPiceDiscount());
        holder.pice.setText(item.getPice());
        holder.image.setImageDrawable(context.getResources().getDrawable(item.getImage()));
    }

    static class ViewHolderOne extends RecyclerView.ViewHolder {
        public TextView title, discount, pice;

        ImageView image;
        public ViewHolderOne(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_title);
            discount = (TextView) itemView.findViewById(R.id.tv_pice_discount);
            pice = (TextView) itemView.findViewById(R.id.tv_pice);
            image = (ImageView) itemView.findViewById(R.id.imv_image);

        }
    }

    //type two
    private void initLayoutTwo(ViewHolderTwo holder, int i) {
        Item item = itemList.get(i);

        holder.title.setText(item.getTitle());
        holder.color.setBackgroundResource(item.getColor());;
        holder.image.setImageDrawable(context.getResources().getDrawable(item.getImage()));
    }

    static class ViewHolderTwo extends RecyclerView.ViewHolder {
        public TextView title;

        View color;
        ImageView image;
        public ViewHolderTwo(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_title);
            color = (View) itemView.findViewById(R.id.view_color);
            image = (ImageView) itemView.findViewById(R.id.imv_image);

        }
    }

    //type three
    private void initLayoutThree(ViewHolderThree holder, int i) {
        Item item = itemList.get(i);

        holder.title.setText(item.getTitle());
        holder.place.setText(item.getPlace());
        holder.discount.setText(item.getPiceDiscount());
        holder.pice.setText(item.getPice());
        holder.image.setImageDrawable(context.getResources().getDrawable(item.getImage()));
    }

    static class ViewHolderThree extends RecyclerView.ViewHolder {
        public TextView title, place, discount, pice;

        ImageView image;
        public ViewHolderThree(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_title);
            place = (TextView) itemView.findViewById(R.id.tv_place);
            discount = (TextView) itemView.findViewById(R.id.tv_pice_discount);
            pice = (TextView) itemView.findViewById(R.id.tv_pice);
            image = (ImageView) itemView.findViewById(R.id.imv_image);

        }
    }

    private void initLayoutFour(ViewHolderFour holder, int i) {
        Item item = itemList.get(i);

        holder.title.setText(item.getTitle());
    }

    static class ViewHolderFour extends RecyclerView.ViewHolder {
        public TextView title;
        public ViewHolderFour(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_content);

        }
    }

    @Override
    public int getItemCount() {
        return itemList==null ? 0 : itemList.size();
    }
}
