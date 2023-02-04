package solid;

import solid.srp.models.InputOrder;
import solid.srp.models.Order;
import solid.srp.models.SaveToFile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new InputOrder().inputFromConsole();
        SaveToFile file = new SaveToFile("task6/Solid2Srp2/order.json");
        file.save(order);
    }
}
