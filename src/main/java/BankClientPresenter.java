import java.util.ArrayList;

public class BankClientPresenter {

    public void printTransactions(BankClient bankClient) {

//    ArrayList<Integer> transactionsInDolars =

        ArrayList<Integer> transactionsInDollars = bankClient.getTransactions();

        for (int i = 0; i < transactionsInDollars.size(); i++) {
            transactionsInDollars.set(i, transactionsInDollars.get(i)*4);
        }
        System.out.println(transactionsInDollars);
    }
}
