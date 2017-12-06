package estadistica;

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
