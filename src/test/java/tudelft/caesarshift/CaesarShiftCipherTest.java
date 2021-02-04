package tudelft.caesarshift;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher ly;
    @BeforeEach
    public void initialize() {
        this.ly = new CaesarShiftCipher();
    }

    @Test
    public void withSpaceAndZ() {

        String result = ly.CaesarShiftCiphers("zerk zeden", 4);
        Assertions.assertEquals("divo dihir",result);
    }

    @Test
    public void withSpaceAndA() {

        String result = ly.CaesarShiftCiphers("aa merhaba derken", -4);
        Assertions.assertEquals("ww iandwxw zangaj",result);
    }


    @Test
    public void withoutSpaceAndZ() {

        String result = ly.CaesarShiftCiphers("herkesaazzherkes", -14);
        Assertions.assertEquals("tqdwqemmlltqdwqe",result);
    }

    @Test
    public void withoutSpaceAndA() {

        String result = ly.CaesarShiftCiphers("asdfasdf", 25);
        Assertions.assertEquals("zrcezrce",result);
    }


}
