/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica;

/**
 *
 * @author Phantom
 */
public class xTests
{
    public static void main(String[] args)
    {
        double[] a = {85.93,29.49,14.60,51.55,97.94,65.44,65.01,87.41,79.86,
            91.54,14.86,74.55,21.20,31.48,91.79,82.24,74.75,45.88,39.29,60.04}; 
        double x = xFunctions.variance(a);
        System.out.println(""+x);
    }
}
