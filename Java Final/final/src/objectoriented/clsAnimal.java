package objectoriented;

abstract class clsAnimal {
    protected String animalType = "";
    protected int animallbs = 0;

    public clsAnimal(String type, int lbs)
    {
        this.animalType = type;
        this.animallbs = lbs;
    }

    public String getType()
    {
        return this.animalType;
    }

    public int getlbs()
    {
        return this.animallbs;
    }

    public void setlbs(int newlbs)
    {
        this.animallbs = newlbs;
    }

    public String animalNoise()
    {
        String s = "Generic animal noise";

        return s;
    }

    public abstract String animalFood();

    public String toString()
    {
        String s = "The " + this.animalType + " weighs " + this.animallbs + " lbs.";
        return s;
    }

}