package com.example.foodapp;

public enum CatetoryItem {
    RESTAURANT("Nhà hàng"), SHOP_ONLINE("Shoponline"), FAMILY("Gia đình"), GROUP("Hội nhóm"), BIRTHDAY("Sinh nhật"), BUFFET("Buffet"), STREET_FOOD("Quán vỉa hè");

    private String text;
    CatetoryItem(String text){
        this.text = text;
    }

    public  String getText(){
        return text;
    }
}
