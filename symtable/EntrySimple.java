package symtable;


public class EntrySimple extends EntryTable {
    public EntrySimple(String n) {
        name = n;
    }

    public String dscJava()
     {
        if (name.equals("int")) {
            return "I";
        } else {
            return "Ljava/lang/String;";  
        }
    }
}
