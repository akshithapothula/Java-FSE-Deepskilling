public class WebApp implements Observer {
    private String siteName;

    public WebApp(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(siteName + " WebApp → " + stockName + " price: ₹" + stockPrice);
    }
}
