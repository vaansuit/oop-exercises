public class Invoice {

    private int itemNumber;
    private String itemDesc;
    private int quantity;
    private double itemPrice;

    public Invoice(int itemNumber, String itemDesc, int quantity, double itemPrice) {
        this.itemNumber = itemNumber;
        this.itemDesc = itemDesc;
        this.quantity = quantity;
        this.itemPrice = itemPrice;

        if ( itemPrice < 0) {
            this.itemPrice = 0;
        }

        if (quantity < 0) {
            this.quantity = 0;
        }

    }

    public int getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getInvoiceAmount() {
        double invoice = quantity * itemPrice;
        return invoice;
    }


}
