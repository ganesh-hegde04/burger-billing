public class otherburger {
    public static final int CHICKEN_BURGER_SMALL = 150;
    public static final int CHICKEN_BURGER_MEDIUM = 200;
    public static final int CHICKEN_BURGER_LARGE = 250;

    public static final int VEGGIE_BURGER_SMALL = 120;
    public static final int VEGGIE_BURGER_MEDIUM = 170;
    public static final int VEGGIE_BURGER_LARGE = 220;

    public static final int CHEESE_BURGER_SMALL = 180;
    public static final int CHEESE_BURGER_MEDIUM = 230;
    public static final int CHEESE_BURGER_LARGE = 280;

    public static final int FISH_BURGER_SMALL = 200;
    public static final int FISH_BURGER_MEDIUM = 250;
    public static final int FISH_BURGER_LARGE = 300;

    public static final int PEPSI_SMALL = 50;
    public static final int PEPSI_MEDIUM = 75;
    public static final int PEPSI_LARGE = 100;

    public static final int COKE_SMALL = 50;
    public static final int COKE_MEDIUM = 75;
    public static final int COKE_LARGE = 100;

    public static final int SPRITE_SMALL = 50;
    public static final int SPRITE_MEDIUM = 75;
    public static final int SPRITE_LARGE = 100;

    public static final int SIDE_ITEM_SMALL = 30;
    public static final int SIDE_ITEM_MEDIUM = 50;
    public static final int SIDE_ITEM_LARGE = 70;

    private String burgerType;
    private String burgerSize;
    private String juiceType;
    private String juiceSize;
    private String sideItem;
    private String sideItemSize;

    public otherburger(String burgerType, String burgerSize, String juiceType, String juiceSize, String sideItem, String sideItemSize) {
        this.burgerType = burgerType;
        this.burgerSize = burgerSize;
        this.juiceType = juiceType;
        this.juiceSize = juiceSize;
        this.sideItem = sideItem;
        this.sideItemSize = sideItemSize;
    }

    public int getBurgerPrice() {
        switch (burgerType) {
            case "Chicken Burger":
                return getChickenBurgerPrice();
            case "Veggie Burger":
                return getVeggieBurgerPrice();
            case "Cheese Burger":
                return getCheeseBurgerPrice();
            case "Fish Burger":
                return getFishBurgerPrice();
            default:
                throw new IllegalArgumentException("Invalid burger type");
        }
    }

    private int getChickenBurgerPrice() {
        switch (burgerSize.toLowerCase()) {
            case "small":
                return CHICKEN_BURGER_SMALL;
            case "medium":
                return CHICKEN_BURGER_MEDIUM;
            case "large":
                return CHICKEN_BURGER_LARGE;
            default:
                throw new IllegalArgumentException("Invalid burger size: " + burgerSize);
        }
    }

    private int getVeggieBurgerPrice() {
        switch (burgerSize.toLowerCase()) {
            case "small":
                return VEGGIE_BURGER_SMALL;
            case "medium":
                return VEGGIE_BURGER_MEDIUM;
            case "large":
                return VEGGIE_BURGER_LARGE;
            default:
                throw new IllegalArgumentException("Invalid burger size: " + burgerSize);
        }
    }

    private int getCheeseBurgerPrice() {
        switch (burgerSize.toLowerCase()) {
            case "small":
                return CHEESE_BURGER_SMALL;
            case "medium":
                return CHEESE_BURGER_MEDIUM;
            case "large":
                return CHEESE_BURGER_LARGE;
            default:
                throw new IllegalArgumentException("Invalid burger size: " + burgerSize);
        }
    }

    private int getFishBurgerPrice() {
        switch (burgerSize.toLowerCase()) {
            case "small":
                return FISH_BURGER_SMALL;
            case "medium":
                return FISH_BURGER_MEDIUM;
            case "large":
                return FISH_BURGER_LARGE;
            default:
                throw new IllegalArgumentException("Invalid burger size: " + burgerSize);
        }
    }

    public int getJuicePrice() {
        switch (juiceType.toLowerCase()) {
            case "pepsi":
                return getPepsiPrice();
            case "coke":
                return getCokePrice();
            case "sprite":
                return getSpritePrice();
            default:
                throw new IllegalArgumentException("Invalid juice type: " + juiceType);
        }
    }

    private int getPepsiPrice() {
        switch (juiceSize.toLowerCase()) {
            case "small":
                return PEPSI_SMALL;
            case "medium":
                return PEPSI_MEDIUM;
            case "large":
                return PEPSI_LARGE;
            default:
                throw new IllegalArgumentException("Invalid juice size: " + juiceSize);
        }
    }

    private int getCokePrice() {
        switch (juiceSize.toLowerCase()) {
            case "small":
                return COKE_SMALL;
            case "medium":
                return COKE_MEDIUM;
            case "large":
                return COKE_LARGE;
            default:
                throw new IllegalArgumentException("Invalid juice size: " + juiceSize);
        }
    }

    private int getSpritePrice() {
        switch (juiceSize.toLowerCase()) {
            case "small":
                return SPRITE_SMALL;
            case "medium":
                return SPRITE_MEDIUM;
            case "large":
                return SPRITE_LARGE;
            default:
                throw new IllegalArgumentException("Invalid juice size: " + juiceSize);
        }
    }

    public int getSideItemPrice() {
        switch (sideItemSize.toLowerCase()) {
            case "small":
                return SIDE_ITEM_SMALL;
            case "medium":
                return SIDE_ITEM_MEDIUM;
            case "large":
                return SIDE_ITEM_LARGE;
            default:
                throw new IllegalArgumentException("Invalid side item size: " + sideItemSize);
        }
    }

    public int calculateTotalBill() {
        int burgerPrice = getBurgerPrice();
        int juicePrice = getJuicePrice();
        int sideItemPrice = getSideItemPrice();

        return burgerPrice + juicePrice + sideItemPrice;
    }

    @Override
    public String toString() {
        return "Order Details: \n" +
                "Burger: " + burgerType + " - " + burgerSize + "\n" +
                "Juice: " + juiceType + " - " + juiceSize + "\n" +
                "Side Item: " + sideItem + " - " + sideItemSize;
    }
}
