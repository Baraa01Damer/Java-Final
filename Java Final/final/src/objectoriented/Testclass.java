package objectoriented;

public class Testclass {

    public static void main(String[] args) {
        String s = "";
        int i = 0;

        clsLion oLion1 = new clsLion("Feline", 600, "golden tan", "Simba");
        clsLion oLion2 = new clsLion("Feline", 550, "golden tan", "Mufasa");

        clsLion[] lionArray = new clsLion[] {oLion1, oLion2};


        for (i = 0; i < lionArray.length; i++)
        {
            s = lionArray[i].toString();
            System.out.println(s);

            s = lionArray[i].animalFood();
            System.out.println(s);

            s = lionArray[i].animalSound();
            System.out.println(s);

            System.out.println("\n");
        }

    }

}