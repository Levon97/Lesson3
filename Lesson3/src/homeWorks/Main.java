package homeWorks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        PC gamingPC = new PC();
        gamingPC.setPrice(3000);
        gamingPC.setHasSDD(true);
        gamingPC.setRAM(32);
        gamingPC.setProcModel("i7 10900k ");
        gamingPC.setVCardModel("RTX 3080");
        gamingPC.setMBoardModel("ROG MAXIMUS");
        gamingPC.setPowSuppWatts(1000);
        //Testing geters.
        System.out.println(gamingPC.getPrice() + "$");
        System.out.println(gamingPC.getMBoardModel());
        System.out.println("****************************");

        PC regPC = new PC();
        regPC.setPrice(500);
        regPC.setHasSDD(false);
        regPC.setHasHDD(true);
        regPC.setROM(512);
        regPC.setRAM(8);
        regPC.setProcModel("i5");
        regPC.setVCardModel("GTX 1030");
        regPC.setMBoardModel("Some cheap single-channel DDR4 Gygabyte ");
        regPC.setPowSuppWatts(400);

        System.out.println(regPC.getPrice());
        System.out.println(regPC.getPowSuppWatts());
        System.out.println(regPC.getProcModel());
        System.out.println(regPC.getVCardModel());
        System.out.println("****************************");

        PC testPC = new PC();
        testPC.setPrice(1000000000);
        //Bubble sort function in use.
        int[] arr = {3,44,5,6,76,78,9,79,34,6,45,5,6,7,56,5,847};
        BubbleSort.arrayBubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
