/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ISC434E02.MyStringUtility;
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
public class StringUtility {

    MyStringUtility s = new MyStringUtility();

    @Test
    public void concatTest1() {

        ArrayList<String> bag = new ArrayList<>();
        bag.add("1");
        String sep = "perro";
        Assert.assertEquals("1perro2perro", s.concat(bag, sep));

    }
}
