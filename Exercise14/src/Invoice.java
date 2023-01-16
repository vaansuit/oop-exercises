public class Invoice {

    private String invoiceNum;
    private String invoiceDesc;
    private int itemQuantity;
    private double itemCost;

    public Invoice(String invoiceNum, String invoiceDesc, int itemQuantity, double itemCost) {
        this.invoiceNum = invoiceNum;
        this.invoiceDesc = invoiceDesc;
        this.itemQuantity = itemQuantity;
        this.itemCost = itemCost;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDesc() {
        return invoiceDesc;
    }

    public void setInvoiceDesc(String invoiceDesc) {
        this.invoiceDesc = invoiceDesc;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public void getTotalInvoice() {
        double totalInvoice = itemQuantity * itemCost;
        System.out.println(totalInvoice);

    }
}
