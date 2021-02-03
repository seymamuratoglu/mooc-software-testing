package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy str;
    @BeforeEach
    public void initialize() {
        this.str = new GHappy();
    }



    @Test
    public void startWithGandNotHappy(){

        Assertions.assertFalse(str.gHappy("g"));
    }

    @Test
    public void startWithGandHappy(){
        Assertions.assertTrue(str.gHappy("gg"));
    }

    @Test
    public void endWithGandNotHappy(){

        Assertions.assertFalse(str.gHappy("gggggeyrg"));

}


    @Test
    public void endWithGandHappy(){
        Assertions.assertTrue(str.gHappy("eyggrgg"));
    }


    @Test
    public void middleGandNotHappy(){
        Assertions.assertFalse(str.gHappy("ggergytgr"));

    }



    @Test
    public void middleGandHappy(){
        Assertions.assertTrue(str.gHappy("ggeyrggmggskgglwgg"));

    }




}
