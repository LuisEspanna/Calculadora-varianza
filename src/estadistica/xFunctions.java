package estadistica;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

/**
 *
 * @author Luis Espanna
 */


public class xFunctions
{
    public static double average(double[] arr)
    {
        double s=0.0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        return s/arr.length;
    }
    
    public static double variance(double[] arr)
    {
        double average = average(arr);
        double sum = 0.0;
        for(int i=0;i<arr.length;i++)
        {
            sum += Math.pow(arr[i]-average,2);
        }
        return sum/arr.length;
    }
    
    public static double covariance(double[] arrX,double[] arrY)
    {
        double sumX = sumArray(arrX);
        double sumY = sumArray(arrY);
        double sumXY = 0.0;
        double averageX = sumX/arrX.length;
        double averageY = sumY/arrY.length;
        for(int i=0;i<arrX.length;i++)
        {
            sumXY = arrX[i]*arrY[i];
        }
        return (sumXY/arrX.length)-(averageX*averageY);  
    }
    
    
    public static double[] quadratic_regression(double [] arrX,double[] arrY)
    {
        double averageX = average(arrX);
        double averageY = average(arrY);
        double sumX2 = 0.0; //Sumatoria de los X elevados a la 2
        double sumX4 = 0.0; //Sumatoria de los X elevados a la 4
        double sumX2Y = 0.0; //Sumatoria de los X al cuadrado por Y
        double sumXY = 0.0; //Sumatoria de los X por Y
        double averageX2; //Promedio de los X elevados al cuadrado
        double averageX4; //Promedio de los X elevados a la 4
        double averageX2Y; //Promedio de los X al cuadrado por Y
        double a,b,c;
        
        for(int i=0;i<arrX.length;i++)
        {
            sumX2+=Math.pow(arrX[i],2);
        }
        averageX2 = sumX2/arrX.length;                
        
        for(int i=0;i<arrX.length;i++)
        {
            sumX4+=Math.pow(arrX[i],4);
        }
        averageX4 = sumX4/arrX.length;
        
        for(int i=0;i<arrX.length;i++)
        {
            sumXY += arrX[i]*arrY[i];
            sumX2Y += Math.pow(arrX[i],2) * arrY[i] ;
        }
        averageX2Y = sumX2Y/arrX.length;
        
        // Ahora biene lo bueno :v
        
        c = ( averageX2Y - ( averageX2*averageY ) ) / ( averageX4 - Math.pow(averageX2, 2) );
        a = averageY - c*averageX2;
        b = sumXY / sumX2;
        
        //Devolvemos el resultado en un arreglo
        double[] result = {a,b,c};
        return result;
    }
    
    public static double sumArray(double[] arr)
    {
        double s = 0.0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
        }
        return s;
    }
    
}
