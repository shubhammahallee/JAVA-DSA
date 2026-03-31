import java.util.*;

interface ShoppingCart {
    void addItem(Product product, int quantity);
    void removeItem(Product product);
    List<CartItem> getCartItems();
    double getTotalPrice();
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class SimpleShoppingCart implements ShoppingCart {
    private List<CartItem> cartItems;

    public SimpleShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getName().equals(product.getName())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new CartItem(product, quantity));
    }

    public void removeItem(Product product) {
        cartItems.removeIf(item -> item.getProduct().getName().equals(product.getName()));
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }
}

public class ShoppingWebsiteDemo {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Phone", 499.99);

        ShoppingCart cart = new SimpleShoppingCart();
        cart.addItem(p1, 2);
        cart.addItem(p2, 1);

        for (CartItem item : cart.getCartItems()) {
            System.out.println(item.getProduct().getName() + " x " + item.getQuantity());
        }

        System.out.println("Total: $" + cart.getTotalPrice());
    }
}
