public class commonorder extends hamburger {
    private int regularburger = 100;
    private int smallcoke = 20;
    private int fries = 10;

    public commonorder(String burger, String drinks, String sideitem) {
        super(burger, drinks, sideitem); 
    }

    public int getRegularburger() {
        return regularburger;
    }

    public int getSmallcoke() {
        return smallcoke;
    }

    public int getFries() {
        return fries;
    }
}