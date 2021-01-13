import org.testng.Assert;
import org.testng.annotations.Test;

public class HexagonTest {

    @Test
    public void testSquare(){
        Hexagon h = new Hexagon(5);
//        assert h.squareHex() == 12.99038105676658;
        Assert.assertEquals(h.squareHex(), 12.99038105676658);
    }



}
