import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {
/*
public static Boolean insertString(ArrayList<String> arrlist, String str) {
 */
Main main;
    ArrayList<String> stringArrayList;
    String str;
    @Before
    public void setUp() throws Exception {
        main = new Main();
        stringArrayList = new ArrayList<String>();
         str = "pølse";
        String str2 = "alyson";
        String str3 = "";
        String str4 = "pølse";
        stringArrayList.add(str);
        stringArrayList.add(str2);
    }

    @Test
    public void insertStringTest() {
        boolean retval = Main.insertString(stringArrayList,str);
        assertFalse(retval);
        //testen skal være bestået når den rigtige string er tilføjet arraylisten.
        //arraylisten er alfabetisk ordnet.
        //hvis en string allerede findes i arraylisten skal den ikke smides ind.
        //hvis en string er tom skal den ikke smides ind.
    }
}