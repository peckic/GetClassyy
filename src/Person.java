
import java.util.Calendar;


public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    //generate constructor
    public Person(String IDNum, String firstName, String lastName, String title, int YOB)
    {
        this.ID = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    //generate getters
    public String getIDNum()
    {return ID;}

    public String getFirstName()
    {return firstName;}

    public String getLastName()
    {return lastName;}

    public String getTitle()
    {return title;}

    public int getYOB()
    {return YOB;}

    //generate setters
    public void setIDNum(String IDNum)
    {this.ID = IDNum;}

    public void setFirstName(String firstName)
    {this.firstName = firstName;}

    public void setLastName(String lastName)
    {this.lastName = lastName;}

    public void setTitle(String title)
    {this.title = title;}

    public void setYOB(int YOB)
    {this.YOB = YOB;}

    //generate tostring
    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - YOB;
    }

    public int getAgeSpecific(int year) {
        return year - YOB;
    }

    public String toCSV() {
        return ID + "," + firstName + "," + lastName + "," +  title + "," + YOB;
    }


}
