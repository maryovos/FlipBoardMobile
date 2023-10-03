package utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.io.IOException;

public class AppiumServer {


    public static AppiumDriverLocalService appiumService;


    public static void start() throws IOException {

        // starting Appium server code

        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
                .withAppiumJS(new File("C:\\Users\\1556\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withLogFile(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\logs\\log.txt"))
                .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
                .usingPort(4723);

        appiumService = AppiumDriverLocalService.buildService(builder);

        if (appiumService.isRunning()) {
            System.out.println("Appium sudah run");
        } else {
            appiumService.start();
        }

    }

   public static void stop(){

       appiumService.stop();

   }
}
