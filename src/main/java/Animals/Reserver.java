package Animals;
import java.util.Date;

public class Reserver
{
    private String name;
    private Date reservedAt;

    public String GetName()
    {
        return name;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public Date GetDate()
    {
        return reservedAt;
    }

    public void SetDate(Date reservedAt)
    {
        this.reservedAt = reservedAt;
    }

    public Reserver(String name, Date reservedAt)
    {
        this.name = name;
        this.reservedAt = reservedAt;
    }
}
