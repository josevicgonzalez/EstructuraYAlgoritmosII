
package actividadpracticaeaii;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ActividadPracticaEAII {

 
    public static void main(String[] args) {
        
        int identificador;
        String nombreCompleto;
        
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        
        Map<Integer, String> listadoMapaPersonas = new HashMap<>();
        
            
        Scanner entradaTeclado = new Scanner(System.in);
        
        for (int i=0; i<5; i++){
           System.out.println("Ingrese el ID: (únicamente números enteros) ");
           identificador = entradaTeclado.nextInt();
           entradaTeclado.nextLine();
           
           System.out.println("Ingrse el nombre de la persona: ");
           nombreCompleto = entradaTeclado.nextLine();
            
           listaPersonas.add(new Persona(identificador, nombreCompleto));
           
        
        }   
        
        System.out.println("_________________________________________________");
        System.out.println("A continuación se muestran los datos de las personas en el orden que fueron ingresados");
        
        for (Persona perso:listaPersonas) {
            System.out.println("ID: " + perso.getId() +  " Nombre: " + perso.getNombre());
            listadoMapaPersonas.put(perso.getId(), perso.getNombre());
            System.out.println(listadoMapaPersonas.values());
             
        }
        
        System.out.println("_________________________________________________");
         System.out.println("_________________________________________________");
        System.out.println("A continuación se muestran los datos de las personas ordenados en orden ascendente por medio de su ID");
        
        Collections.sort(listaPersonas);
         for (Persona perso: listaPersonas) {
             System.out.println(perso);
         }
        
        System.out.println("_________________________________________________");
         System.out.println("_________________________________________________");
        System.out.println("A continuación se muestran los datos de las personas ordenados en orden descendente por medio de su ID");
         
         Collections.sort(listaPersonas, Collections.reverseOrder());
          for (Persona perso: listaPersonas) {
             System.out.println(perso);
         }  
            
    }
    
}
