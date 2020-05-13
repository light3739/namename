package by.training.task1.file;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CardTest {
    private static final String NAME_OWNER_TEST = "VASYA";
    private static final BigDecimal START_BALANCE = new BigDecimal(1); //Спасибо)
    private static final BigDecimal DELTA = new BigDecimal(10);

    private Card card;

    @Before
    public void setUp() {
        card = new Card(NAME_OWNER_TEST, START_BALANCE);
    }

    @Test
    public void testAddToBalance() {
        card.addToBalance(DELTA);
        BigDecimal actual = card.getBalance();
        Assert.assertEquals(START_BALANCE.add(DELTA), actual);
    }

    @Test
    public void testWithdrawFromBalance() {
        card.withdrawFromBalance(DELTA);
        BigDecimal actual = card.getBalance();
        Assert.assertEquals(START_BALANCE.subtract(DELTA), actual);
    }

    @Test
    public void testGetBalanceWithExchangeRate() {
        card.getBalanceWithExchangeRate(DELTA);
        BigDecimal actual = card.getBalance();
        Assert.assertEquals(START_BALANCE.multiply(DELTA), actual);
    }

    @Test
    public void testCorrectNameOwner() {
        card = new Card("VASYA");
        String actual = card.getNameOwner();
        Assert.assertEquals(NAME_OWNER_TEST, actual);
    }


}
