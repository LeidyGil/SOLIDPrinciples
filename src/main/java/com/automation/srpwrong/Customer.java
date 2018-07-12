package com.automation.srpwrong;

import java.util.List;

public class Customer {

    private String name;
    private String addres;
    private String phone;
    private long bill;
    private List<Item> itemList;

    public Customer() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getBill() {
        return bill;
    }

    public void setBill(long bill) {
        this.bill = bill;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public long calculateBill(long tax) {
        for (Item item : itemList) {
            bill += item.getPrice();
        }
        bill += tax;
        this.setBill(bill);
        return bill;
    }

    public void generateBill(String reportType) {
        if (reportType.equalsIgnoreCase("CSV")) {
            System.out.println("Generate CSV bill");
        }
        if (reportType.equalsIgnoreCase("XML")) {
            System.out.println("Generate XML bill");
        }
    }
}
