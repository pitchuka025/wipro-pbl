public class Bid {
    private String itemId;
    private String itemName;
    private String bidderName;
    private String bidderEmail;
    private double bidAmount;
    private boolean autoIncrement;
    
    // Default constructor
    public Bid() {
    }
    
    // Parameterized constructor
    public Bid(String itemId, String itemName, String bidderName, 
               String bidderEmail, double bidAmount, boolean autoIncrement) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.bidderName = bidderName;
        this.bidderEmail = bidderEmail;
        this.bidAmount = bidAmount;
        this.autoIncrement = autoIncrement;
    }
    
    // Getters and Setters
    public String getItemId() {
        return itemId;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getBidderName() {
        return bidderName;
    }
    
    public void setBidderName(String bidderName) {
        this.bidderName = bidderName;
    }
    
    public String getBidderEmail() {
        return bidderEmail;
    }
    
    public void setBidderEmail(String bidderEmail) {
        this.bidderEmail = bidderEmail;
    }
    
    public double getBidAmount() {
        return bidAmount;
    }
    
    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }
    
    public boolean isAutoIncrement() {
        return autoIncrement;
    }
    
    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }
    
    @Override
    public String toString() {
        return "Bid{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", bidderName='" + bidderName + '\'' +
                ", bidderEmail='" + bidderEmail + '\'' +
                ", bidAmount=" + bidAmount +
                ", autoIncrement=" + autoIncrement +
                '}';
    }
}
