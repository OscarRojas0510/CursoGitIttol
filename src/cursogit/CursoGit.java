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
       double arr[] = {12.1,315.4,100,213,125,238,9.1};
       double suma =0;
       double media;
       Carro obj = new Carro(4, "Rojo", "Mercedez", "no c");
        System.out.println(obj.getModelo());
        for (int i = 0; i < arr.length; i++)
        {
            suma+=arr[i];
            System.out.println(j);
        }
        media = suma/((double)(arr.length));
        System.out.println("El promedio es :"+media);
    }
    
}
