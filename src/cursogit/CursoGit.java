/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursogit;

/**
 *
 * @author oscar
 */
public class CursoGit
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int j = 0;
       double arr[] = {14,3215.4,1,213,125,23,0.1};
       double suma =0;
       double media;
       Animal obj2 = new Animal("jirafa", "jirafa", 150.4, (byte)19);
        System.out.println(obj2.getEspecie());
        for (int i = 0; i < arr.length; i++)
        {
            suma+=arr[i];
            System.out.println(j);
            j++;
        }
        media = suma/((double)(arr.length));
        System.out.println("El promedio es :"+media);
    }
    
}
