import org.junit.Assert;
import org.junit.Test;

public class BankTest {

@Test
public void bankClient(){

    BankClient bankClient = new BankClient();
    bankClient.addTransaction(1);
    Assert.assertEquals(1, bankClient.actualMoney());
}



}
