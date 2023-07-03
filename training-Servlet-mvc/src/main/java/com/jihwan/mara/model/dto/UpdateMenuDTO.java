package com.jihwan.mara.model.dto;

public class UpdateMenuDTO {
    private String menuCode;
    private String status;
    private String price;

    public UpdateMenuDTO() {
    }

    public UpdateMenuDTO(String menuCode, String status, String price) {
        this.menuCode = menuCode;
        this.status = status;
        this.price = price;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public String getStatus() {
        return status;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "UpdateMenuDTO{" +
                "menuCode='" + menuCode + '\'' +
                ", status='" + status + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
