package nestedforloop;
public class nestedforloop {

    public static void main(String[] args) {
        String[][] arrayDemo = { {"d", "l", "r", "o", "w"}, {"o", "l", "l", "e", "H"} };
        
        int row = 0;
        int column = 0;
        
        String word = "";
        
        for (row = arrayDemo.length - 1; row >= 0; row --)
        {
            for(column = arrayDemo[row].length - 1; column >= 0; column--)
            {
                word += arrayDemo[row][column];
            }
            word += " ";
        }
        System.out.println(word);
    }

}