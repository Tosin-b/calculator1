import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculaotTest {
    @Test
    void coool(){
        calcualtor c = new calcualtor();
        int x = c.add(5,7);
        assertEquals(12,x,0);
    }
}
