package Animals;

public class Cat extends Animal
{
    public String badHabits;



    public String GetBadHabits()
    {
        return badHabits;
    }

    public void SetBadHabits(String badHabits)
    {
        this.badHabits = badHabits;
    }



    public Cat(String name, Gender gender, String badHabits)
    {
        super(name, gender);
        this.badHabits = badHabits;
    }

    public String ToString()
    {
        return super.ToString() +
            ", bad habits: " + badHabits.toLowerCase();
    }
}
