// Stock.java
public class Stock {
    private String symbol;
    private double purchasePrice;
    private int shares;
    private double currentPrice;

    public Stock(String symbol, double purchasePrice, int shares) {
        this.symbol = symbol;
        this.purchasePrice = purchasePrice;
        this.shares = shares;
        this.currentPrice = purchasePrice; // Initialize currentPrice with purchasePrice
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public int getShares() {
        return shares;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getTotalInvestment() {
        return purchasePrice * shares;
    }

    public double getCurrentValue() {
        return currentPrice * shares;
    }

    public double getGainLoss() {
        return getCurrentValue() - getTotalInvestment();
    }

    @Override
    public String toString() {
        return String.format("Symbol: %s, Purchase Price: %.2f, Shares: %d, Current Price: %.2f, Total Investment: %.2f, Current Value: %.2f, Gain/Loss: %.2f",
                symbol, purchasePrice, shares, currentPrice, getTotalInvestment(), getCurrentValue(), getGainLoss());
    }
}