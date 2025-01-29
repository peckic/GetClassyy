public class objInputTest
{

    public static void main(String[] args)
    {

        SafeInputObj theClass = new SafeInputObj();

        String tester = theClass.getNonZeroLenString("please enter a word: ");
        int tester1 = theClass.getRangedInt("please enter a number between 1 and 10",1,10);
        int tester2 = theClass.getInt("please enter a number");
        double tester3 = theClass.getRangedDouble("please enter a double between 1 and 10",1,10);
        double tester4 = theClass.getDouble("please enter a double");
        boolean tester5 = theClass.getYNConfirm("enter y/n");



    }
}
