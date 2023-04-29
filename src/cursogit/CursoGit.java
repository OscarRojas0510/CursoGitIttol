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
        int arr[] = {12,315,1,213,125,23};
       int suma =0;
       double media;
        for (int i = 0; i < arr.length; i++)
        {
            suma+=arr[i];
        }
        media = ((double)(suma))/((double)(arr.length));
        System.out.println("El promedio es :"+media);
    }
    
}
