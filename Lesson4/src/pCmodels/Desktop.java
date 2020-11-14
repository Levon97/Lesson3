package pCmodels;

public class Desktop extends PC {
    private String monitorModel;
    private double monitorPrice;

    public Desktop() {
        super();
        monitorModel = "LG";
        monitorPrice = 120;
    }

    public String getMonitorModel() {
        return monitorModel;
    }

    public void setMonitorModel(String monitorModel) {
        this.monitorModel = monitorModel;
    }

    public double getMonitorPrice() {
        return monitorPrice;
    }

    public void setMonitorPrice(double monitorPrice) {
        if (monitorPrice >= 0) {
            this.monitorPrice = monitorPrice;
        }
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Monitor model - " + monitorModel);
        System.out.println("Monitor price - " + monitorPrice);
    }
}
