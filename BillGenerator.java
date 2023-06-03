public class BillGenerator {
    public static void main(String[] args) {
        Order pizza = new Order();
        pizza.menu();
        pizza.addOnsCheese();
        pizza.addOnsToppings();
        System.out.println("Your bill is : \n ");
        System.out.println("Pizza             :    " + pizza.getBase_price());
        if(pizza.added_cheese) {
            System.out.println("Extra Cheese      :    " + pizza.getExtra_cheese());
        }
        if(pizza.added_toppings) {
            System.out.println("Extra Toppings    :    " + pizza.getExtra_toppings());
        }
        System.out.println("GST 18%           :    " + pizza.getGst());
        System.out.println("Your Total        :    " + pizza.getPrice());
    }
}
