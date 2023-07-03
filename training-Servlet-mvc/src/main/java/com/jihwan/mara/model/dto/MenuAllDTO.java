package com.jihwan.mara.model.dto;

public class MenuAllDTO {

    private String menuName;
    private int menuPrice;

    public MenuAllDTO() {
    }

    public MenuAllDTO(String menuName, int menuPrice) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    @Override
    public String toString() {
        return "MenuAllDTO{" +
                "menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                '}';
    }
}
