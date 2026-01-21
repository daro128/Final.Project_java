package data1;
public class insertData{
    public makeItem[] item = new makeItem[10];
    public insertData() {
        item[0] = new makeItem(1, "Apple", 50, 0.5, 1.0);
        item[1] = new makeItem(2, "Banana", 40, 0.3, 0.8);
        item[2] = new makeItem(3, "Bread", 30, 1.0, 1.5);
        item[3] = new makeItem(4, "Milk", 20, 1.2, 2.0);
        item[4] = new makeItem(5, "Eggs (12pcs)", 25, 2.0, 3.0);
        item[5] = new makeItem(6, "Orange Juice", 15, 2.5, 4.0);
        item[6] = new makeItem(7, "Rice (1kg)", 30, 1.5, 2.5);
        item[7] = new makeItem(8, "Chicken Breast", 20, 3.0, 5.0);
        item[8] = new makeItem(9, "Cheese", 10, 2.5, 4.0);
        item[9] = new makeItem(10, "Chocolate Bar", 50, 0.8, 1.5);
    }

}