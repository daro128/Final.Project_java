package data1;
public class printData{
    public static void main(String[] args){
        insertData data = new insertData();
        for (makeItem it : data.item) {
            System.out.println(it.id + " " + it.name + " " + it.quantity + " " + it.buy + " " + it.sell + " " + it.profit + " " + it.totalProfit);
        }

    }
}