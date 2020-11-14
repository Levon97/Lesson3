package tester;

import mobileDevicesModels.Phone;
import mobileDevicesModels.SmartWatch;
import pCmodels.Desktop;
import pCmodels.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop toshiba = new Laptop();
        toshiba.setBuildInCam(true);
        toshiba.setScreenSize(17.5);
        toshiba.setModel("Toshiba gp");
        toshiba.setPrice(2000);
        toshiba.setProcModel("AMD Ryzen 3");
        toshiba.setvCard("RTX 3070");
        toshiba.getInfo();

        Desktop customBuild = new Desktop();
        customBuild.setMonitorModel("Samsung 2K");
        customBuild.setMonitorPrice(400);
        customBuild.setPrice(1500);
        customBuild.setProcModel("AMD Ryzen 9");
        customBuild.setvCard("RTX 3070");
        customBuild.setrAM(64);
        customBuild.setrOM(2048);
        customBuild.getInfo();

        Phone onePlus5t = new Phone();
        onePlus5t.setScreenRes("Full HD");
        onePlus5t.setScreenSize(6.01);
        onePlus5t.setBatteryCap(3400);
        onePlus5t.setModel("Oneplus 5T");
        onePlus5t.setPrice(450.00);
        onePlus5t.getInfo();

        SmartWatch appleWatch = new SmartWatch();
        appleWatch.setHeartRateSensor(true);
        appleWatch.setStrapLength(40);
        appleWatch.setBatteryCap(400);
        appleWatch.setPrice(350);
        appleWatch.setModel("Apple Watch 4");
        appleWatch.getInfo();



    }


}
