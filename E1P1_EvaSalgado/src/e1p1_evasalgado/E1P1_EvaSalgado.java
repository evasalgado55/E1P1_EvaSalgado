
package e1p1_evasalgado;
import java.util.Scanner; 
/**
 *
 * @author Eva Salgado
 */
public class E1P1_EvaSalgado {
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
      int opcion = 0;  
      char resp = 's';
      while(opcion!=4&&resp =='s'||resp=='S'){
      System.out.println("\n1. Numero Valido\n2. Reordenado de cadenas\n3. Trigonometria\n4. Salida");
      System.out.println("Ingrese una opción: "); 
      opcion = leer.nextInt(); 
      
      switch (opcion){
          case 1: //Se debe ingresar un numero el cual será validado. Este será evaluado en si incluye alguna de estas características: 
//                    1. 0 o 1 signo "-" al principio de la ecuación
//                    2. 0 o 1 punto ‘.’ al principio, en medio o al final del número.
//                    3. 0 o más números antes del punto (si tiene punto).
//                    4. 0 o más números después del punto (si tiene punto).
             
              System.out.println("Ingrese el numero que desea validar: ");
              String num = leer.next().toLowerCase(); 
              numero_valido(num);
              
            break; 
          
          case 2: 
              
              System.out.println("Ingrese la cadena que desea redondear: ");
              String word = leer.next();  
              redondear_cadenas(word);
              
              
              break; 
          case 3: 
              System.out.println("Ingrese el angulo que quiera calcular: ");
              double angulo = leer.nextInt(); 
              System.out.println("Ingrese la precision deseada: ");
              int precision = leer.nextInt(); 
              trigonometria(angulo,precision);
              break; 
          case 4: 
              opcion = 4; 
              resp = 'n';
              break; 
          
          
          
      } 
      System.out.println("Desea ingresar otra opcion?[s/n]: ");
      resp = leer.next().charAt(0);
      }
    }
    public static void numero_valido(String num){
        int numnum; 
        boolean valid = true;
        String acum = " ";
        for(int i=0; i<num.length(); i++){
                  char numer = num.charAt(i);
                  char car = num.charAt(i);
                  numnum = numer; 
              
                if (numnum<=58&&numnum>47||numnum==45||numnum==250){
                    valid = true ; 
                   System.out.println("Es un numero valido ");
                   break; 
                   
              } else { 
                    System.out.println("No es un numero valido");
                    valid = false;
                    break; 
                   
                } 
                
                        
        } 
    }
    public static void redondear_cadenas(String word){
        
        
        int numnum = 0;
        int numletmin = 0;
        int numletmayus = 0;
        String acum1 = " "; 
        String acum2 = " "; 
                
        String acum3 = " "; 
        String acum4 = " "; 
        
        
        for(int i=0;i<word.length();i++){
            char lettermin = word.charAt(i);
            char lettermayus = word.charAt(i);
            char num = word.charAt(i);
            char car = word.charAt(i);
            
             
           
            numnum = num; 
            numletmin = lettermin; 
            numletmayus = lettermayus; 
                   
            if(numletmin<123&&numletmin>96){
                acum1 = acum1 + lettermin; 
            }else if(numletmayus<91&&numletmayus>64) {
                acum2 = acum2 + lettermayus; 
            } else if (numnum<58&&numnum>47){
                acum3 = acum3 + num; 
               
            } else {
                acum4 = acum4 + car; 
            }
                    
            
             
       } System.out.println(acum3+acum1+acum2+acum4); 
       
        
    }
    public static void trigonometria (double grado, int precision ){
       if (grado<=0 && grado >=180 ){
           double mult = grado * 3.14159265359; 
           double z = mult / 180;
           
           double sin = z * (-1)/ 2 * -1 + 1 ; 
           
        System.out.println("sin("+z+") = "+ sin);
      } else {
           System.out.println("Su grado debe ser un angulo");
       } 
    }
}
