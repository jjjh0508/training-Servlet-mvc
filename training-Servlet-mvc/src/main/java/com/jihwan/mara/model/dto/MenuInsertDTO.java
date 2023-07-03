package com.jihwan.mara.model.dto;

public class MenuInsertDTO {
    private String menuName;
    private String menuPrice;
    private String category;

    public MenuInsertDTO() {
    }

    public MenuInsertDTO(String menuName, String menuPrice, String category) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.category = category;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getMenuPrice() {
        return menuPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setMenuPrice(String menuPrice) {
        this.menuPrice = menuPrice;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
