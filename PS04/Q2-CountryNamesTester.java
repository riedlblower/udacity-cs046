
public class CountryNameTester
{
   public static void main(String[] args)
   {
       CountryNames tester = new CountryNames();
       System.out.println(tester.getCompleteName("Pays-Bas"));
       System.out.println("Expected: les Pays-Bas");
       System.out.println(tester.getCompleteName("Argentine"));
       System.out.println("Expected: l'Argentine");
       System.out.println(tester.getCompleteName("Kosovo"));
       System.out.println("Expected: le Kosovo");
       System.out.println(tester.getCompleteName("Barbade"));
       System.out.println("Expected: la Barbade");
       System.out.println(tester.getCompleteName("Cambodge"));
       System.out.println("Expected: la Cambodge");
       System.out.println(tester.getCompleteName("Etats-Unis"));
       System.out.println("Expected: les Etats-Unis");
   }
}
