public class Main {
    public static void main(String[] args) {

        ArrayBag<String> bagOfNames = new ArrayBag<String>(5);

        System.out.println("Adding Adrian..." + bagOfNames.addNewEntry("Adrian"));
        System.out.println("Adding Mary..." + bagOfNames.addNewEntry("Mary"));
        System.out.println("Adding Zoe..." + bagOfNames.addNewEntry("Zoe"));

        Object[] arrayOfNames = bagOfNames.toArray();
        for (Object name : arrayOfNames) {
            System.out.println(name + " ... ");
            System.out.println();
        }

        System.out.println("Adding John..." + bagOfNames.addNewEntry("John"));
        System.out.println("Adding Alex..." + bagOfNames.addNewEntry("Alex"));
        System.out.println("Adding Fie..." + bagOfNames.addNewEntry("Fie"));

        Object[] arrayOfNames2 = bagOfNames.toArray();
        for (Object name : arrayOfNames2) {
            System.out.println(name + " ... ");
            System.out.println();
        }



    }


}