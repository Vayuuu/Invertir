package invertir;
/**
 * @Val
 */
import static java.awt.Color.yellow;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class datos {
    Ventana obj = new Ventana();
    String cadena;
    Pattern pa;
    Matcher mat;
    
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
   
   public boolean validar(String cadena){
       boolean var;
       pa = Pattern.compile("[A-Za-z,' ']{1,50}");
       mat = pa.matcher(cadena);
      
       if(mat.matches()){
           var=true;
       }else{
           var=false;
       }
       return var;      
   } 
    

   public String cifrado(String cadena){
        
       
        String [] array=cadena.split(" ");
        String invertido="";
        for(int i=array.length-1;i>=0; i--){
                 invertido=invertido+" "+array[i];    
        }
     return invertido;       
    }   
}  
