import java.util.Random;

public class BagComplexityTest {

    public static LinkedBag<Integer> bag = new LinkedBag<>();

    public static void main(String[] args){

        int[] n = new int[]{10,100,1000,10000,100000};

        final Object[][] table = new String[7][];
        table[0] = new String[] {"LinkedBag Size", "Total Time To Add","Avg Time to Add","Total Time To Remove","Avg Time To Remove"};

        table[1] = new String[] {"10", String.valueOf(timeTakenToAdd(n[0])),String.valueOf(calculateAverageTime(timeTakenToAdd(n[0]),n[0])),
                String.valueOf(timeTakenToRemove(n[0])),String.valueOf(calculateAverageTime(timeTakenToRemove(n[0]),n[0]))};

        table[2] = new String[] {"100", String.valueOf(timeTakenToAdd(n[1])),String.valueOf(calculateAverageTime(timeTakenToAdd(n[1]),n[1])),
                String.valueOf(timeTakenToRemove(n[1])),String.valueOf(calculateAverageTime(timeTakenToRemove(n[1]),n[1]))};

        table[3] = new String[] {"1000", String.valueOf(timeTakenToAdd(n[2])),String.valueOf(calculateAverageTime(timeTakenToAdd(n[2]),n[2])),
                String.valueOf(timeTakenToRemove(n[2])),String.valueOf(calculateAverageTime(timeTakenToRemove(n[2]),n[2]))};

        table[4] = new String[] {"10000", String.valueOf(timeTakenToAdd(n[3])),String.valueOf(calculateAverageTime(timeTakenToAdd(n[3]),n[3])),
                String.valueOf(timeTakenToRemove(n[3])),String.valueOf(calculateAverageTime(timeTakenToRemove(n[3]),n[3]))};;

        table[5] = new String[] {"100000", String.valueOf(timeTakenToAdd(n[4])),String.valueOf(calculateAverageTime(timeTakenToAdd(n[4]),n[4])),
                String.valueOf(timeTakenToRemove(n[4])),String.valueOf(calculateAverageTime(timeTakenToRemove(n[4]),n[4]))};


        for(final Object[] row : table){
            System.out.format("%-25s%-25s%-25s%-25s%-25s%n",row);
        }



    }


    public static long timeTakenToRemove(int sizeOfBag){
        long startTime, endTime;
        startTime = System.nanoTime();
        removeIntegersFromBag(sizeOfBag);
        endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static void removeIntegersFromBag(int sizeOfBag){
        for (int i=0; i < sizeOfBag; i++){
            bag.remove(getRandomInteger(sizeOfBag));
        }
    }


    public static long timeTakenToAdd(int sizeOfBag) {
        long startTime, endTime;
        startTime = System.nanoTime();
        addIntegersToBag(sizeOfBag);
        endTime = System.nanoTime();

        return endTime - startTime;

    }

    public static void addIntegersToBag(int sizeOfBag){
        for (int i=0; i < sizeOfBag; i++){
            bag.addNewEntry(getRandomInteger(sizeOfBag));
        }
    }

    public static int getRandomInteger(int sizeOfBag){
        Random random = new Random();
        return random.nextInt(sizeOfBag * 10);
    }

    public static int calculateAverageTime(long totalTimeTaken, int sizeOfBag){
        return (int)(totalTimeTaken / sizeOfBag);
    }



}
