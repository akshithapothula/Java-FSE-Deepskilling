public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobile = new MobileApp("InvestMate");
        Observer web = new WebApp("MoneyTracker");

        // Register observers
        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        // Stock price updates
        stockMarket.setStockPrice("TCS", 3850.50);
        stockMarket.setStockPrice("INFY", 1560.25);

        // Remove one observer and test again
        stockMarket.removeObserver(mobile);
        stockMarket.setStockPrice("WIPRO", 450.75);
    }
}
