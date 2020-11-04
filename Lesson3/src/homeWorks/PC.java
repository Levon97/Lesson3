package homeWorks;

public class PC {
    private double price;
    private String procModel;
    private String vCardModel;
    private String MBoardModel;
    private int PowSuppWatts;
    private int RAM = 8;
    private int ROM = 128;
    private boolean hasHDD;
    private boolean hasSDD = true;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 100.00 || price > 100000.00) {
            System.out.println("Please write reasonable price!");
        }
        this.price = price;

    }

    public String getProcModel() {
        return procModel;
    }

    public void setProcModel(String procModel) {
        this.procModel = procModel;
    }

    public String getVCardModel() {
        return vCardModel;
    }

    public void setVCardModel(String vCardModel) {
        this.vCardModel = vCardModel;
    }

    public String getMBoardModel() {
        return MBoardModel;
    }

    public void setMBoardModel(String MBoardModel) {
        this.MBoardModel = MBoardModel;
    }


    public int getPowSuppWatts() {
        return PowSuppWatts;
    }

    public void setPowSuppWatts(int powSuppWatts) {
        PowSuppWatts = powSuppWatts;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public boolean isHasHDD() {
        return hasHDD;
    }

    public void setHasHDD(boolean hasHDD) {
        this.hasHDD = hasHDD;
    }

    public boolean isHasSDD() {
        return hasSDD;
    }

    public void setHasSDD(boolean hasSDD) {
        this.hasSDD = hasSDD;
    }
}
