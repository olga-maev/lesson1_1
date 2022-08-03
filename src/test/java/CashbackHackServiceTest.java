import org.testng.Assert;
import org.testng.annotations.*;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    void shouldCashbackServiceAdd100(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expect = 100;

        Assert.assertEquals(actual,expect);
    }
    @Test
    void shouldCashbackServiceAdd1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expect = 1000;

        Assert.assertEquals(actual,expect);
    }
    @Test
    void shouldCashbackServicemore1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1900);
        int expect = 100;

        Assert.assertEquals(actual,expect);
    }
    @Test
    void shouldCashbackServiceAdd0(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expect = 0;

        Assert.assertEquals(actual,expect);
    }

}
