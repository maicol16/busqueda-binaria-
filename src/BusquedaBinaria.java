import java.util.Scanner;
 
class BinarySearch 
{
  public static void main(String args[])
  {
    int c, izquierda, derecha, mitad, n, search, array[];
 
           Scanner in = new Scanner(System.in);
               System.out.println("Introduzca el número de elementos");
                   n = in.nextInt(); 
                        array = new int[n];
 
               System.out.println("Escriba" + n + "enteros");
 
 
                  for (c = 0; c < n; c++)
                    array[c] = in.nextInt();
 
                System.out.println("Introducir valor para encontrar");
                   search = in.nextInt();
 
            izquierda  = 0;
                derecha   = n - 1;
                mitad= (izquierda + derecha)/2;
 
             while( izquierda <= derecha )
    {
               if ( array[mitad] < search )
                    izquierda = mitad + 1;    
            else if ( array[mitad] == search ) 
      {
                System.out.println(search + "valor encontrado en la posision " + (mitad + 1) + ".");
                break;
      }
                    else
                        derecha = mitad - 1;
 
                mitad = (izquierda + derecha)/2;
   }
  }
}

                    
      
  





