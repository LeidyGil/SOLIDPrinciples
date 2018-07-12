package com.automation.srpcorrect;

public class BillGenerator {

    public Bill calculateBill(Bill bill) {
        double subtotal = 0D;
        for (Item item : bill.getItemList()) {
            subtotal += item.getPrice();
        }
        bill.setSubtotal(subtotal);
        bill.setTotal(bill.getTax() * bill.getSubtotal());
        return bill;
    }

    public void generateBill(String billType) {
        if (billType.equalsIgnoreCase("CSV")) {
            System.out.println("Generate CSV bill");
        }
        if (billType.equalsIgnoreCase("XML")) {
            System.out.println("Generate XML bill");
        }
    }
}
