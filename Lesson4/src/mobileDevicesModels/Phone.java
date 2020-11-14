package mobileDevicesModels;

public class Phone extends MobileDevice {
    private double screenSize;
    private String screenRes;   //HD,UHD ...

    public Phone() {
        super();
        screenSize = 6.01;
        screenRes = "UHD";

    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize >= 0) {
            this.screenSize = screenSize;
        }
    }

    public String getScreenRes() {
        return screenRes;
    }

    public void setScreenRes(String screenRes) {
        this.screenRes = screenRes;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Screen size - " + screenSize);
        System.out.println("Screen resolution - " + screenRes);
    }
}
