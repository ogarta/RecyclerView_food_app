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

import java.util.Calendar;
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
        int hourCurrent = 0;
        int minusCurrent = 0;
        int hourOpenModel = 0;
        int minusOpenModel = 0;
        int hourCloseModel = 0;
        int minusCloseModel = 0;

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
            Calendar calendar = Calendar.getInstance();
            hourCurrent = calendar.get(Calendar.HOUR_OF_DAY);
            minusCurrent = calendar.get(Calendar.MINUTE);
            hourOpenModel = Utils.milliToHour(foodModel.getOpenTime());
            minusOpenModel = Utils.milliToMinus(foodModel.getOpenTime());
            hourCloseModel = Utils.milliToHour(foodModel.getCloseTime());
            minusCloseModel = Utils.milliToMinus(foodModel.getCloseTime());
            // them dieu kien
            if ((hourCurrent < hourOpenModel) || (hourCurrent > hourCloseModel) || (hourCurrent == hourOpenModel && minusCurrent < minusOpenModel) || (hourCurrent == hourCloseModel && minusCurrent > minusCloseModel)) {
                txtTimeOpen.setVisibility(View.VISIBLE);
                txtTimeOpen.setText(String.format("Đóng cửa\nMở cửa vào lúc %s", Utils.formatTimeToString(foodModel.getOpenTime())));
                txtTimeOpen.setBackgroundColor(Color.parseColor("#66000000"));
            }
            if(!foodModel.getDiscount().equals("Không có ưu đãi")){
                txtDiscount.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_new,0,0,0);
            }
            img.setImageResource(foodModel.getImage());
            txtName.setText(foodModel.getName());
            txtAddress.setText(foodModel.getAddress());
            txtCategory.setText(catetory(foodModel.getCategoryList()));
            txtDiscount.setText(foodModel.getDiscount());
            txtDistance.setText(String.format(">%.2fkm",foodModel.getDistance()));
            txtTime.setText((String.format("%s - %s",Utils.formatTimeToString(foodModel.getOpenTime()),Utils.formatTimeToString(foodModel.getCloseTime()))));
        }

        private StringBuilder catetory(List<CatetoryItem> catetoryItemList){
            StringBuilder sCate = new StringBuilder();
            for (int i = 0; i < catetoryItemList.size(); i++) {
                if(i == catetoryItemList.size()-1){
                    sCate.append(catetoryItemList.get(i).getText());
                }else{
                    sCate.append(catetoryItemList.get(i).getText()+"/");
                }
            }
            return sCate;
        }
    }
}
