package utils;

public class Converte {
    
    public static int textToValue(String txt) {
        String num = "0";
        String digitos = "0123456789";
        
        for (int i=0; i<txt.length(); i++) 
            if (digitos.indexOf(txt.charAt(i))>=0)
                num = num + txt.charAt(i);
        
        int val = 0;
        try {
            val = Integer.parseInt(num);
        } catch (RuntimeException e) {
            val = 0;
        }
        
        return val;
    }
}
