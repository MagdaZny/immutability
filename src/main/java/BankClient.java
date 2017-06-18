import java.util.ArrayList;

public class BankClient {

    private ArrayList<Integer> transactions;

    public BankClient(){

        transactions = new ArrayList();
    }

    public int actualMoney(){

        int sum=0;

        for (int i = 0; i<=transactions.size(); i++){
            sum=+ transactions.get(i);
        }
        return sum;
    }

    public void addTransaction(int i) {

        transactions.add(i);
    }
}
