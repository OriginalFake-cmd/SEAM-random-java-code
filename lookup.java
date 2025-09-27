// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String input = "Duck";
        if (lookUp(input)){
            jOptionPane.showMessageDialog(null,"Valid");
        }
        else{
            jOptionPane.showMessageDialog(null,"Invalid");
        }
    }
}
public static boolean lookUp(String input) {
    String table[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",};
    boolean valid = false;
    for{int i =0; i < table.length; i++}{
        if(input.equals(table[i])){
            valid = true;
        }
    }
    return valid;
}
