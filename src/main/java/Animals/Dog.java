package Animals;


import java.text.DateFormat;
import java.util.Date;

public class Dog extends Animal
{
    private Date lastWalk;
    private boolean needsWalk;

    public Date GetLastWalk()
    {
        return lastWalk;
    }

    public void SetDate(Date lastWalk)
    {
        this.lastWalk = lastWalk;
    }

    public Boolean GetNeedsWalk()
    {
        boolean needsWalk = false;
        Date date = new Date();


        int diffInDays = (int)( (date.getTime() - this.lastWalk.getTime()) / (1000 * 60 * 60 * 24) );

        if(diffInDays > 0)
        {
            needsWalk = true;
        }

        return needsWalk;

    }

    public Dog(String name, Gender gender)
    {
        super(name, gender);
        Date date = new Date();
        this.lastWalk = date;
    }

    public String ToString()
    {
        return String.format(super.ToString() + ", last walk: " + this.lastWalk.getTime(), "dd/MM/yyyy");
    }
}
