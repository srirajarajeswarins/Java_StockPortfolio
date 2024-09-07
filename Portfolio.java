// Portfolio.java
import java.io.*;
import java.util.*;

public class Portfolio {
    private Map<String, Stock> stocks = new HashMap<>();

    public void addStock(Stock stock) {
        stocks.put(stock.getSymbol(), stock);
    }

    public void removeStock(String symbol) {
        stocks.remove(symbol);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        Stock stock = stocks.get(symbol);
        if (stock != null) {
            stock.setCurrentPrice(newPrice);
        }
    }

    public void viewPortfolio() {
        for (Stock stock : stocks.values()) {
            System.out.println(stock);
        }
        System.out.println("Total Portfolio Value: " + getTotalPortfolioValue());
        System.out.println("Overall Gain/Loss: " + getOverallGainLoss());
    }

    public double getTotalPortfolioValue() {
        return stocks.values().stream().mapToDouble(Stock::getCurrentValue).sum();
    }

    public double getOverallGainLoss() {
        return stocks.values().stream().mapToDouble(Stock::getGainLoss).sum();
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Stock stock : stocks.values()) {
                writer.write(stock.getSymbol() + "," + stock.getPurchasePrice() + "," + stock.getShares() + "," + stock.getCurrentPrice());
                writer.newLine();
            }
        }
    }

    public void loadFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String symbol = parts[0];
                double purchasePrice = Double.parseDouble(parts[1]);
                int shares = Integer.parseInt(parts[2]);
                double currentPrice = Double.parseDouble(parts[3]);
                Stock stock = new Stock(symbol, purchasePrice, shares);
                stock.setCurrentPrice(currentPrice);
                addStock(stock);
            }
        }
    }
}
