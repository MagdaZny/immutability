import org.junit.Assert;
import org.junit.Test;

public class BankClientPresenterTest {

@Test
    public void compareBankTransactionsAfterEvokingPresenter(){
    BankClient bankClient = new BankClient();
    BankClientPresenter bankClientPresenter = new BankClientPresenter();
    bankClient.addTransaction(30);
    bankClient.addTransaction(40);
    bankClientPresenter.printTransactions(bankClient);
    Assert.assertEquals(70, bankClient.actualMoney());


}
}
