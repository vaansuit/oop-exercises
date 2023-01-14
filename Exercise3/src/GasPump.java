public class GasPump {
    private String fuelType;
    private double pricePerLitre;
    private double fuelAmount;

    public GasPump(String fuelType, double pricePerLitre, double fuelAmount) {
        this.fuelType = fuelType;
        this.pricePerLitre = pricePerLitre;
        this.fuelAmount = fuelAmount;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public String getFuelType() {
        return fuelType;
    }

    private void setPricePerLitre(long pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }
    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
    public double getFuelAmount() {
        return fuelAmount;
    }

    public void fillByMonetaryValue (double monetaryAmount) {
        double literAmount = monetaryAmount / pricePerLitre;
    }
    
    public void fillPerLitre(double litreAmount) {
        double valueToBePaid = litreAmount * pricePerLitre;
    }
    
    public void changeLitrePrice (double newLitrePrice) {
        this.pricePerLitre = newLitrePrice;
    }
    
    public void changeFuelType (String newFuelType) {
        this.fuelType = newFuelType;
    }
    
    public void changeFuelAmount (double newFuelAmount) {
        this.fuelAmount = newFuelAmount;
    }

}
