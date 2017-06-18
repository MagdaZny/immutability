import java.util.ArrayList;

public class BankClient {

    private  ArrayList<Integer> transactions;


    public ArrayList<Integer> getTransactions() {

        ArrayList<Integer> copyTrnasactions = new ArrayList<Integer>(transactions);
        return copyTrnasactions;
    }

    public BankClient() {
        transactions = new ArrayList();
    }

    public int actualMoney() {
        int sum = 0;
        for (int i = 0; i < transactions.size(); i++) {
            sum += transactions.get(i);
        }
        return sum;
    }

    public void addTransaction(int i) {
        transactions.add(i);
    }

    public static void main(String[] arg){

        BankClient bankClient = new BankClient();
        bankClient.addTransaction(500);
        bankClient.addTransaction(850);
        bankClient.addTransaction(-200);
        BankClientPresenter bankClientPresenter = new BankClientPresenter();
        bankClientPresenter.printTransactions(bankClient);
    }
}
