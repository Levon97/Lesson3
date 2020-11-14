package mobileDevicesModels;

public class SmartWatch extends MobileDevice {
    private boolean heartRateSensor;
    private double strapLength;

    public SmartWatch() {
        super();
        strapLength = 30;
    }

    public boolean isHeartRateSensor() {
        return heartRateSensor;
    }

    public void setHeartRateSensor(boolean heartRateSensor) {
        this.heartRateSensor = heartRateSensor;
    }

    public double getStrapLength() {
        return strapLength;
    }

    public void setStrapLength(double strapLength) {
        if (strapLength >= 0) {
            this.strapLength = strapLength;
        }
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Has heart rate sensor ? - " + heartRateSensor);
        System.out.println("Strap length - " + strapLength);
    }
}
