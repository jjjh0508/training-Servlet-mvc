package com.jihwan.mara.model.dto;

public class MenuOneDTO {

    private String menuName;
    private String categoryName;
    private int price;
    private String category;
    private String orderableSataus;


    public MenuOneDTO() {
    }

    public MenuOneDTO(String menuName, String categoryName, int price, String category, String orderableSataus) {
        this.menuName = menuName;
        this.categoryName = categoryName;
        this.price = price;
        this.category = category;
        this.orderableSataus = orderableSataus;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setOrderableSataus(String orderableSataus) {
        this.orderableSataus = orderableSataus;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getOrderableSataus() {
        return orderableSataus;
    }



    @Override
    public String toString() {
        return "MenuOneDTO{" +
                "menuName='" + menuName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", orderableSataus='" + orderableSataus + '\'' +
                '}';
    }
}
