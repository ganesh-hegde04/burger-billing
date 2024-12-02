public class hamburger {
    private String burger;
    private String drinks;
    private String sideitem;
    private String size = "medium";

    public hamburger(String burger, String drinks, String sideitem) {
        this.burger = burger;
        this.drinks = drinks;
        this.sideitem = sideitem;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public void setSideitem(String sideitem) {
        this.sideitem = sideitem;
    }

    public String getBurger() {
        return burger;
    }

    public String getDrinks() {
        return drinks;
    }

    public String getSideitem() {
        return sideitem;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Order: " + burger + ", Drink: " + drinks + ", Side item: " + sideitem + ", Size: " + size;
    }
}
