package pCmodels;

public class Laptop extends PC {
    private String model;
    private boolean buildInCam;
    private double screenSize;

    public Laptop() {
        super();
        model = "Toshiba";
        screenSize = 21.5;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() != 0) {
            this.model = model;
        }
    }

    public boolean isBuildInCam() {
        return buildInCam;
    }

    public void setBuildInCam(boolean buildInCam) {
        this.buildInCam = buildInCam;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize >= 0) {
            this.screenSize = screenSize;
        }
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("That laptop have webcam - " + buildInCam);
        System.out.println("Laptop screen size is - " + screenSize);

    }
}
