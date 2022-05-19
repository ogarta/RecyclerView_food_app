package com.example.foodapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FoodModel {
    private int image;
    private String name;
    private String address;
    private List<CatetoryItem> catetoryItemList;
    private String discount;
    private float distance;
    private int openTime;
    private int closeTime;

    public FoodModel(int image, String name, String address, List<CatetoryItem> catetoryItemList, String discount, float distance, int openTime, int closeTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.catetoryItemList = catetoryItemList;
        this.discount = discount;
        this.distance = distance;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CatetoryItem> getCatetoryItemList() {
        return catetoryItemList;
    }

    public void setCatetoryItemList(List<CatetoryItem> catetoryItemList) {
        this.catetoryItemList = catetoryItemList;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public static List<FoodModel> getMock(){
        return new ArrayList<>(Arrays.asList(
            new FoodModel(R.drawable.foody_com_tam_minh_long,"Cơm Tấm Minh Long - Nguyễn Thị Thập","607 Nguyễn Thị Thập, P. Tân Hưng, Quận 7, TP. HCM",Arrays.asList(CatetoryItem.FAMILY,CatetoryItem.SHOP_ONLINE),"Ca ngay - 30%",22f,7,21),
            new FoodModel(R.drawable.foody_pizza_4p,"Pizza 4P’s - Pizza Kiểu Nhật - Lê Thánh Tôn","8/15 Lê Thánh Tôn, P. Bến Nghé,  Quận 1, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Ca ngay 50%",10.5f,10,23),
            new FoodModel(R.drawable.foody_restaurant_sanfulou,"San Fu Lou - Ẩm Thực Quảng Đông - Lê Lai","Tầng Trệt, AB Tower, 76A Lê Lai, P. Bến Thành,  Quận 1, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Buoi sang - 10%",15f,7,3),
            new FoodModel(R.drawable.foody_ut_ut_quan,"Quán Ụt Ụt - Barbecue & Beer - Võ Văn Kiệt","168 Võ Văn Kiệt, P. Cầu Ông Lãnh,  Quận 1, TP. HCM",Arrays.asList(CatetoryItem.BIRTHDAY,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Buoi toi - 20%",18f,11,23),
            new FoodModel(R.drawable.foody_restaurant_fuji,"Fuji Japanese Restaurant 富士 - Nikko Saigon Hotel","Tầng Trệt Nikko Saigon Hotel, 235 Nguyễn Văn Cừ, P. Phạm Ngũ Lão,  Quận 1, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Không có ưu đãi",14.7f,11,22),
            new FoodModel(R.drawable.foody_buffet_sabusabu,"Shabu Ya - SC VivoCity","Tầng 4 - SC VivoCity, 1058 Nguyễn Văn Linh, KP. 1, P. Tân Phong,  Quận 7, TP. HCM",Arrays.asList(CatetoryItem.BUFFET,CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Ca ngay 15%",28.4f,9,22),
            new FoodModel(R.drawable.foody_buffet_hana_bbq_and_hot_pot,"Hana BBQ & Hot Pot Buffet - Nguyễn Quý Đức","65 Nguyễn Quý Đức, P. An Phú,  Quận 2, TP. HCM",Arrays.asList(CatetoryItem.BUFFET,CatetoryItem.RESTAURANT,CatetoryItem.FAMILY),"Buoi sang 10%",13.2f,8,22),
            new FoodModel(R.drawable.foody_restaurant_kvegetarian,"Quán Chay KVegetarian - Bình Thạnh","20/15 Phan Đăng Lưu, P. 6,  Quận Bình Thạnh, TP. HCM",Arrays.asList(CatetoryItem.RESTAURANT,CatetoryItem.FAMILY,CatetoryItem.GROUP),"Không có ưu đãi",7.3f,9,21),
            new FoodModel(R.drawable.foody_streetfood_223flan,"Quán 223 - Bánh Flan Thập Cẩm","223 Trần Bình Trọng,  Quận 5, TP. HCM",Arrays.asList(CatetoryItem.STREET_FOOD,CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP),"Không có ưu đãi",20f,11,21),
            new FoodModel(R.drawable.foody_streetfood_banh_mi_bo_a_tung,"A Tùng - Bánh Mì Bò Nướng Bơ Cambodia - Cống Quỳnh","171 Cống Quỳnh,  Quận 1, TP. HCM",Arrays.asList(CatetoryItem.STREET_FOOD,CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP),"Không có ưu đãi",11f,14,21),
            new FoodModel(R.drawable.foody_shop_online_bep_rua,"Bếp Rùa - Chân Gà Rút Xương Ngâm Sả Tắc - Shop Online","127/5/9 Lê Thúc Hoạch, P. Phú Thọ Hòa,  Quận Tân Phú, TP. HCM",Arrays.asList(CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP,CatetoryItem.FAMILY),"Ca ngay 10%",20f,5,24),
            new FoodModel(R.drawable.foody_shop_online_bep_9_sach,"Bánh 9 Sạch - Bánh Sầu Riêng - Shop Online","73 An Dương Vương, P. 8,  Quận 5, TP. HCM",Arrays.asList(CatetoryItem.SHOP_ONLINE,CatetoryItem.GROUP,CatetoryItem.FAMILY),"Ca ngay 5%",16f,8,21)

            ));
    }

}
