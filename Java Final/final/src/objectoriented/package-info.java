package objectoriented;

public class clsLion extends clsAnimal implements animalInterface{

    private String animalColor = "";
    private String animalName = "";


    public clsLion(String type, int weight, String color, String name)
    {
        super(type, weight);

        this.animalColor = color;
        this.animalName = name;
    }


    public String getColor()
    {
        return this.animalColor;
    }

    public String getName()
    {
        return this.animalName;
    }

    public void setName(String newName)
    {
        this.animalName = newName;
    }



    public String animalSound()
    {
        String s = "Roar!";
        return s;
    }

    public String animalFood()
    {
        String s = "Lions are carnivores...";
        return s;
    }

    @Override
    public String toString()
    {
        String s = "The " + this.animalColor + " " + this.animalType + " is named " + this.animalName + ", and weighs " + this.animalWeight + " lbs.";
        return s;
    }


}