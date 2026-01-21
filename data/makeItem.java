public class makeItem{
    int id;
    String name;
    int quantity;
    double buy;
    double sell;
    double profit; 
    double totalProfit;

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