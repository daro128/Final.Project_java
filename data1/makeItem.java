package data1;

public class makeItem {
    public int id;
    public String name;
    public int quantity;
    public double buy;
    public double sell;
    public double profit; 
    public double totalProfit;

    public makeItem(int id,String name,int quantity,double buy,double sell){
        this.id = id;
        this.name = name;
        this.quantity =quantity;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell - buy; 
        this.totalProfit = profit * quantity;
    }
}
