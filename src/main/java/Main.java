import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*
    ArrayList

Skriv en metode, der modtager 2 parametre: en arrayliste og en streng.

Metoden skal gøre følgende:

· Indsætte strengen i arraylisten, hvis den ikke findes i listen i forvejen. Ellers gøres ingenting med streng og arrayliste.

· returnere værdien true, hvis strengen er blevet indsat i arraylisten. Ellers false.

· Inddrag fejlhåndtering i din løsning, således at null værdier undgås i arraylisten

· Hold listen sorteret.
     */
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        String str = "pølse";
        insertString(stringArrayList, str);
    }
    public static Boolean insertString(ArrayList<String> arrlist, String str) throws IllegalArgumentException {
        Boolean retBool = false;
        Boolean arrlistContainsStr = arrlist.contains(str);
        if (!arrlistContainsStr && str != null) {
            arrlist.add(str);
            //sorterer arrliste alfabetisk
            Collections.sort(arrlist);
            //hashlist så kan man være sikker på at to ens strings ikke bliver smidt ind
            retBool = true;
        } else if (arrlistContainsStr) {
            System.out.println("str findes allerede i arraylisten");
            retBool=false;
        } else {
            throw new IllegalArgumentException("str er tom");
        }
        return retBool;
    }
}
