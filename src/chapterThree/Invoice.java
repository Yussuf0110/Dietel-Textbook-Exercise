package chapterThree;

public class Invoice {
    private String number;
    private String description;
    private int quantityItemPurchased;
    private double pricePerItem;


    public Invoice(String number, String description, int quantityItemPurchased, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantityItemPurchased = quantityItemPurchased;
        this.pricePerItem = pricePerItem;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public void setQuantityItemPurchased(int quantityItemPurchased){
        if (quantityItemPurchased > 0){
            this.quantityItemPurchased = quantityItemPurchased;
        }
        else if (quantityItemPurchased < 0){
            this.quantityItemPurchased = 0;
        }
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0){
            this.pricePerItem = pricePerItem;
        }
        else if (pricePerItem < 0){
            this.pricePerItem = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQuantityItemPurchased() {
            return quantityItemPurchased;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public double getInvoiceAmount(int quantityItemPurchased, double pricePerItem){
        double invoiceAmount = getPricePerItem() * getQuantityItemPurchased();
    return invoiceAmount;
    }


}
