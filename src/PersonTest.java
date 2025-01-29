public class PersonTest
{
    public static void main(String[] args)
    {
        Person sally = new Person("0000001","Sally","Williams","Mrs.",2006);

        System.out.println(sally);
        System.out.println(sally.getFirstName());
        System.out.println(sally.toString());
        sally.setLastName("Smith");
        System.out.println(sally);
        System.out.println();

        System.out.println(sally.fullName());
        System.out.println(sally.formalName());
        System.out.println(sally.getAge());
        System.out.println(sally.getAgeSpecific(2012));
        System.out.println(sally.toCSV());
        System.out.println(sally.toJSON());
        System.out.println(sally.toXML());
    }
}
