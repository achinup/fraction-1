package fractiontest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fraction {
    @Test
    public void isThisThingOn() throws Exception {

//        new Hookup();
//  FractionT sum=new FractionT(0).plus(new FractionT(3));
//  assertEquals(0,sum.intValue());


//        Assert.fail("not yet complited");
    }

    @Test
    public  void nonZero() throws  Exception{
        FractionT sum=new FractionT(3).plus(new FractionT(0));
//        System.out.println(sum.i);
        assertEquals(3,sum.intValue());
    }

    @Test
    public  void nonnegetiveInt() throws Exception{
        final FractionT sum=new FractionT(3).add(new FractionT(9));
        assertEquals(12,sum.intValue());

    }
    @Test
    public  void negitiveinputandnegitiveoutput() throws  Exception{
        final FractionT sum=new FractionT(-3).add(new FractionT(-5));
        assertEquals(-8,sum.intValue());
    }



    @Test
    public void numanddeno() throws  Exception{
        final FractionT sum=new FractionT(-9,3).addfract(new FractionT(-1,-2));
        assertEquals(-15,sum.intValue());
        assertEquals(6,sum.denovalue());
    }

    @Test
    public void FinalTestCaseForAll() throws Exception {
        assertEquals(new FractionT(-15,6),new FractionT(-9,3).addfract(new FractionT(-1,-2)));
    }
}
