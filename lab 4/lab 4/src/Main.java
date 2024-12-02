public class Main {
    public static void main(String[] args) {
       
        Store store = new Store();

     
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));


        store.addProduct(new Accessory("Wireless Mouse", 25.0));
        store.addProduct(new Accessory("Keyboard", 45.0));

     
        System.out.println("Applying 10% discount:");
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);

        
        System.out.println("\nApplying $50 fixed discount:");
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store.applyDiscount(fiftyDollarsDiscount);

       
        System.out.println("\nApplying combined discount:");
        Discountable combinedDiscount = product -> {
            if (product.getPrice() > 100) {
                return product.getPrice() * 0.85;
            } else {
                return product.getPrice() - 10.0;
            }
        };
        store.applyDiscount(combinedDiscount);

        
        System.out.println("\nApplying category-based discount:");
        Discountable categoryDiscount = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() * 0.8; 
            } else if (product instanceof Accessory) {
                return product.getPrice() - 5.0; 
            } else {
                return product.getPrice(); 
            }
        };
        store.applyDiscount(categoryDiscount);
    }
}