package com.example.foodapp;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{
    List<FoodModel> listFood;
    Date date = new Date();

    public FoodAdapter(List<FoodModel> listFood){
        this.listFood = listFood;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FoodModel foodModel = listFood.get(position);
        holder.bind(foodModel);
    }

    @Override
    public int getItemCount() {
        if(listFood == null || listFood.size() == 0){
            return 0;

        }
        return listFood.size();

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txtTimeOpen, txtName, txtAddress, txtCategory, txtDiscount, txtDistance, txtTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageViewFood);
            txtTimeOpen = itemView.findViewById(R.id.textViewOpen);
            txtName = itemView.findViewById(R.id.textViewName);
            txtAddress = itemView.findViewById(R.id.textViewAddress);
            txtCategory = itemView.findViewById(R.id.textViewCategory);
            txtTime = itemView.findViewById(R.id.textViewTime);
            txtDiscount = itemView.findViewById(R.id.textViewDiscount);
            txtDistance = itemView.findViewById(R.id.textViewDistance);

        }
        public void bind(FoodModel foodModel){
            if(foodModel.getCloseTime()<date.getHours()){
                txtTimeOpen.setVisibility(View.VISIBLE);
                txtTimeOpen.setBackgroundColor(Color.parseColor("#B4000000"));
                txtTimeOpen.setText("Đóng cửa \n Đặt bàn vào lúc "+foodModel.getOpenTime()+":00");

            }

            img.setImageResource(foodModel.getImage());
            txtName.setText(foodModel.getName());
            txtAddress.setText(foodModel.getAddress());
            txtCategory.setText(catetory(foodModel.getCatetoryItemList()));
            txtDiscount.setText(foodModel.getDiscount());
            txtDiscount.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_new,0,0,0);
            txtDistance.setText(Float.toString(foodModel.getDistance()));
            txtTime.setText(foodModel.getOpenTime()+":00" +" - "+foodModel.getCloseTime()+":00");
        }

        private String catetory(List<CatetoryItem> catetoryItemList){
            String sCate = "";
            for (CatetoryItem cate: catetoryItemList) {
                sCate += cate.name() +"/";
                Log.d("ahihi", cate.name());
            }
            return sCate;
        }
    }
}
