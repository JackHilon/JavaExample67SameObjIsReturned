
package javaexample67sameobjisreturned;


public class JavaExample67SameObjIsReturned {

   
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Abcdef");
        
        System.out.println(str);
        
        ChangeAndReturnSameObj(str).append("XXXX");
        
        System.out.println(str);
        
    }
    
    private static StringBuilder ChangeAndReturnSameObj(StringBuilder sb)
    {
        sb.append("1234");
        return sb;
    }
    
}
