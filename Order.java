import java.lang.reflect.Method;

public class Order extends Pizza {
    boolean added_cheese = false;
    boolean added_toppings = false;

    public void menu() {
        System.out.println("Choose from the menu: \n Veg     :    Enter 1 \n Non Veg :    Enter 2 ");
        int select_veg = sc.nextInt();
        if (select_veg == 1) {
            setVeg(true);
            vegMenu();
            size();
        } else if (select_veg == 2) {
            setVeg(false);
            nonVegMenu();
            size();
        }
    }

    public void addOnsCheese() {
        System.out.println("Do you want extra cheese? \nY/N : ");
        char ch = sc.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            added_cheese = true;
            addingCheeseGetter();
        } else if (ch == 'N' || ch == 'n') {
            return;
        } else {
            System.out.println("Invalid input! ");
        }
    }

    public void addOnsToppings() {
        System.out.println("Do you want extra Toppings? \nY/N : ");
        char ch = sc.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            added_toppings = true;
            addingToppingsGetter();
        } else if (ch == 'N' || ch == 'n') {
            return;
        } else {
            System.out.println("Invalid input! ");
        }
    }

    //
    public void vegMenu() {
        System.out.println(" Cheese                :    Enter 1 \n Onion                 :    Enter 2 \n Sweet corn            :    Enter 3 ");
        System.out.println(" Onion & Tomato        :    Enter 4 \n Peppy Paneer          :    Enter 5 \n Delux Tandoori Paneer :    Enter 6 ");
        this.select_pizza = sc.nextInt();
    }

    public void nonVegMenu() {
        System.out.println(" Chicken           :    Enter 1 \n Chicken Peri Peri :    Enter 2 ");
        System.out.println(" Chicken Paprika   :    Enter 3 \n Mutton            :    Enter 4 ");
        this.select_pizza = 6 + sc.nextInt();
    }

    public void size() {
        System.out.println(" Regular   :    Enter 1 \n Medium    :    Enter 2 \n Large     :    Enter 3 ");
        int select_size = sc.nextInt();
        sizeGetter(select_size);
    }
}
