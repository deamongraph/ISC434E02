/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ISC434E02.MyTime;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deamon3
 */
public class Time {

    MyTime t = new MyTime();

    @Test
    public void earlierTest1(){

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        //agregando valorest
        t1.add(1);
        t1.add(2);
        t2.add(2);
        t2.add(1);
        Assert.assertEquals(true, t.earlier(t2, t1));

    }
    
     @Test
    public void earlierTest2(){

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        //agregando valorest
        t1.add(2);
        t1.add(1);
        t2.add(1);
        t2.add(2);
        Assert.assertEquals(true, t.earlier(t2, t1));

    }
     @Test
    public void earlierTest3(){

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        //agregando valorest
        t1.add(1);
        t1.add(1);
        t2.add(1);
        t2.add(2);
        Assert.assertEquals(true, t.earlier(t2, t1));

    }
    
     @Test
    public void earlierTest4(){

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        //agregando valorest
        t1.add(1);
        t1.add(2);
        t2.add(1);
        t2.add(1);
        Assert.assertEquals(true, t.earlier(t2, t1));

    }
     @Test
    public void earlierTest5(){

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        //agregando valorest
        t1.add(1);
        t1.add(1);
        t2.add(1);
        t2.add(1);
        Assert.assertEquals(true, t.earlier(t2, t1));

    }

    public void nextSecondTest1() {

        ArrayList<Integer> t1 = new ArrayList<>();

        //agregando valorest
        t1.add(8);
        t1.add(30);
        t1.add(20);

        Assert.assertEquals(true, t.nextSecond(t1));

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
