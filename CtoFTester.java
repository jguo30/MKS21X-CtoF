/* These functions should have eithers ints or doubles as the parameters.
The parameters themselves should be what we are converting, so either Farenheit or Celsius.

The functions should return the doubles that are the converted temperatures.

*/
public class CtoFTester{

  public static double celsiusToFahrenheit(int celsius){
    return (celsius * 9.0 / 5.0) + 32.0;
  }
  //public static double fahrenheitToCelsius(int farenheit){

  //}

  public static void main(String[] args){
      System.out.println(celsiusToFahrenheit(0));
      System.out.println(celsiusToFahrenheit(50));
  }
}
