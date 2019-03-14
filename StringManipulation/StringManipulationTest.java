public class StringManipulationTest{
    public static void main (String[] args){
        StringManipulation manipulation = new StringManipulation();
        String str = manipulation.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 
    }
}