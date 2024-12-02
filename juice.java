public class juice {
    private String name;       
    private int basePrice;  
    private String size;       

    
    public juice(String name, int basePrice, String size) {
        this.name = name;
        this.basePrice = basePrice;
        this.size = size.toLowerCase();
    }

    public String getName() {
        return name;
    }

    
    public double getBasePrice() {
        return basePrice;
    }

    
    public String getSize() {
        return size;
    }

    
    public double calculatePrice() {
        double sizeMultiplier = 1; 

        switch (size) {
            case "small":
                sizeMultiplier = 1; 
                break;
            case "medium":
                sizeMultiplier = 2; 
                break;
            case "large":
                sizeMultiplier = 3; 
                break;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }

        return basePrice * sizeMultiplier;
    }

    
    @Override
    public String toString() {
        return name + " (" + size + "): $" + calculatePrice();
    }
}

