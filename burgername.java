public class burgername extends hamburger{
    private String chickenburger;
    private String veggieburger;
    private String cheeseburger;
    private String fishburger;

    public burgername(String cheeseburger, String chickenburger, String fishburger, String veggieburger, String burger, String drinks, String sideitem) {
        super(burger, drinks, sideitem);
        this.cheeseburger = cheeseburger;
        this.chickenburger = chickenburger;
        this.fishburger = fishburger;
        this.veggieburger = veggieburger;
    }

    public String getChickenburger() {
        return chickenburger;
    }
 
    
}