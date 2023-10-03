package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import utilities.AppiumServer;

import java.io.IOException;

public class BaseTest {


    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("AWAL MULAI");
        AppiumServer.start();
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("AKHIR SELESAI");
        AppiumServer.stop();
    }


}
