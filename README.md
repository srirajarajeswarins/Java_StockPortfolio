# Java_StockPortfolio

# Stock Portfolio Management System

This is a simple Java-based Stock Portfolio Management System that allows users to manage their stock investments. 
Users can add, remove, and update stock prices, as well as view their current portfolio and track gains or losses.

## Features

- Add stocks to the portfolio by specifying the stock symbol, purchase price, and number of shares.
- Remove stocks from the portfolio.
- Update the current price of a stock.
- View details of the entire portfolio, including total investment, current value, and gain/loss for each stock.

## Files

- `Main.java`: Handles user interaction and manages the portfolio through a simple console interface.
- `Portfolio.java`: Manages the stock portfolio, providing methods to add, remove, and update stocks.
- `Stock.java`: Represents an individual stock with attributes like symbol, purchase price, shares, and current price.

## How It Works

1. **Add Stock**: Allows the user to add a new stock to the portfolio by entering the stock symbol, purchase price, and number of shares.
2. **Remove Stock**: Removes a stock from the portfolio by specifying the stock symbol.
3. **Update Stock Price**: Updates the current price of a stock.
4. **View Portfolio**: Displays the portfolio with details such as stock symbol, purchase price, number of shares, current price, total investment, current value, and gain/loss.
5. **Save and Exit**: Saves the portfolio data and exits the program.

## Sample Input and Output

### 1. Add Stock:
- **Input**:
  - Choose option: `1`
  - Stock symbol: `AAPL`
  - Purchase price: `150.00`
  - Number of shares: `10`

- **Output**: Stock AAPL added to the portfolio.
- 
### 2. View Portfolio:
- **Input**:
- Choose option: `4`

- **Output**: Symbol: AAPL, Purchase Price: 150.00, Shares: 10, Current Price: 150.00, Total Investment: 1500.00, Current Value: 1500.00, Gain/Loss: 0.00 Total Portfolio Value: 1500.0 Overall Gain/Loss: 0.0
- 
### 3. Update Stock Price:
- **Input**:
- Choose option: `3`
- Stock symbol: `AAPL`
- New price: `155.00`

- **Output**: Stock price updated. AAPL current price is now 155.00.


### 4. View Portfolio After Price Update:
- **Input**:
- Choose option: `4`

- **Output**: Symbol: AAPL, Purchase Price: 150.00, Shares: 10, Current Price: 155.00, Total Investment: 1500.00, Current Value: 1550.00, Gain/Loss: 50.00 Total Portfolio Value: 1550.0 Overall Gain/Loss: 50.0



## How to Run

Compile java files: javac Main.java Portfolio.java Stock.java
Run the application: java Main



