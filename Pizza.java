import java.util.Scanner;

abstract class Pizza {
    static Scanner sc = new Scanner(System.in);
    int select_pizza;
    private long price;
    private int base_price;
    private double gst;
    private boolean isVeg;
    private int extra_cheese = 30;
    private int extra_toppings = 40;
    private final int cheese = 80;
    private final int onion = 90;
    private final int sweet_corn = 90;
    private final int onion_and_capsicum = 110;
    private final int peppy_paneer = 120;
    private final int delux_tandoori_paneer = 140;
    private final int chicken = 160;
    private final int chicken_peri_peri = 180;
    private final int chicken_paprika = 170;
    private final int mutton = 210;
    private void regular(int select_pizza) {
        this.select_pizza = select_pizza;
        if(this.select_pizza == 1) {
            this.price = this.base_price = cheese;
        }
        else if(this.select_pizza == 2) {
            this.price = this.base_price = onion;
        }
        else if(this.select_pizza == 3) {
            this.price = this.base_price = sweet_corn;
        }
        else if(this.select_pizza == 4) {
            this.price = this.base_price = onion_and_capsicum;
        }
        else if(this.select_pizza == 5) {
            this.price = this.base_price = peppy_paneer;
        }
        else if(this.select_pizza == 6) {
            this.price = this.base_price = delux_tandoori_paneer;
        }
        else if(this.select_pizza == 7) {
            this.price = this.base_price = chicken;
        }
        else if(this.select_pizza == 8) {
            this.price = this.base_price = chicken_paprika;
        }
        else if(this.select_pizza == 9) {
            this.price = this.base_price = chicken_peri_peri;
        }
        else if(this.select_pizza == 10) {
            this.price = this.base_price = mutton;
        }
        else {
            System.out.println("Invalid Input! ");
        }
    }
    private void medium() {
        regular(this.select_pizza);
        this.extra_cheese += 20;
        if(isVeg) {
            this.price += 40;
            this.base_price += 40;
            this.extra_toppings += 30;
        }
        else {
            this.price += 70;
            this.base_price += 70;
            this.extra_toppings += 50;
        }
    }
    private void large() {
        regular(this.select_pizza);
        this.extra_cheese += 40;
        if(isVeg) {
            this.price += 70;
            this.base_price += 70;
            this.extra_toppings += 50;
        }
        else {
            this.price += 100;
            this.base_price += 100;
            this.extra_toppings += 70;
        }
    }
    public void sizeGetter(int n) {
        if(n == 1) {
            regular(this.select_pizza);
        }
        else if(n == 2) {
            medium();
        }
        else if(n == 3) {
            large();
        }
    }
    public void addingCheeseGetter() {
        this.price += extra_cheese;
    }
    public void addingToppingsGetter() {
        this.price += extra_toppings;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBase_price() {
        return base_price;
    }

    public int getExtra_cheese() {
        return extra_cheese;
    }

    public int getExtra_toppings() {
        return extra_toppings;
    }

    public double getPrice() {
        return price + gst;
    }
    public double getGst() {
        gst = (this.price * 18) / 100;
        return gst;
    }
}
