import org.junit.Test;
import static org.junit.Assert.*;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceJunitTest {
    @Test
      public void shouldCashbackServiceAdd100(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expect = 100;

        assertEquals(expect,actual);
    }
    @Test
    public void shouldCashbackServiceAdd1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expect = 1000;

        assertEquals(expect,actual);
    }
    @Test
    public void shouldCashbackServicemore1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1900);
        int expect = 100;

        assertEquals(expect,actual);
    }
    @Test
    public void shouldCashbackServiceAdd0(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expect = 0;

        assertEquals(actual,expect);
    }

}
