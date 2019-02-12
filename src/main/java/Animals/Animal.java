package Animals;

import java.util.Date;

public class Animal
{
    private String name;
    private Gender gender;
    private Reserver reservedBy;

    public String GetName()
    {
        return name;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public Gender GetGender()
    {
        return gender;
    }

    public void SetGender(Gender gender)
    {
        this.gender = gender;
    }

    public Reserver GetReserver()
    {
        return reservedBy;
    }

    public void SetReserver(Reserver reserver)
    {
        this.reservedBy = reserver;
    }

    public Animal(String name, Gender gender)
    {
        this.name = name;
        this.gender = gender;
    }

    public Boolean Reserve(String reservedBy)
    {
        if (this.reservedBy == null)
        {
            Date date = new Date();
            this.reservedBy = new Reserver(reservedBy, date);
            return true;
        }
        return false;
    }

    public String ToString()
    {
        String reserved = "not reserved";
        if (this.reservedBy != null)
        {
            reserved = "reserved by " + this.reservedBy.GetName();
        }

        return this.name + this.gender + reserved;
    }
}
