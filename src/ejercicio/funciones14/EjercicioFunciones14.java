/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.funciones14;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class EjercicioFunciones14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0, y=0, z=0,res1=0, res2=0, aux=0; ;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("Ingrese le valor de x : ");
        x = ingreso.nextInt();
        System.out.print("Ingrese le valor de y : ");
        y = ingreso.nextInt();
        System.out.print("Ingrese le valor de z : ");
        z = ingreso.nextInt();       
        if(z%2!=0) 
        {            
            z=z+1;
            aux=1;
        }
        int[] array= new int[z];
        int[] array2= new int[z];
        for(int k=0;k<z;k=k+2)
        {          
                array[k]=x;
                array2[k]=y;
                array[k+1]=y;
                array2[k+1]=x;
                res1=array[k];
                res2=array2[k];
                if(aux==0)
                {                  
                   res1=array[k+1];
                   res2=array2[k+1]; 
                }
                x++;
                y++;                           
        }
        
        System.out.println(res1+""+res2+" ");          
    }
    
}
