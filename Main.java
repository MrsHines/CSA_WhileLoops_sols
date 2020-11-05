// Complete the following methods for your while loop problems

public class Main
{

  // This method should return the number of digits in num
  public static int digitCounter(int num)
  {
    int count = 0;
    while (num > 0)
    {
      num = num/10;
      count++;
    }

    return count;
  }
  // This method should return the sum of the digits of num
  public static int digitSum(int num)
  {
    int sum = 0;
    while (num > 0)
    {
      sum = sum + num % 10;
      num = num / 10;
    }
    return sum;
  }

  //This method should return the average of the digits of num (work smarter not harder for full credit)
  public static double digitAvg(int num)
  {
    return (double)Main.digitSum(num)/Main.digitCounter(num);
  }

  //This method should return an integer that is the reverse of num 
  public static int reverseNum(int num)
  {
    int rev = 0;
    int digits = Main.digitCounter(num);

    while(num > 0)
    {
      rev = rev + (num % 10)*(int)Math.pow(10,digits--);
      num = num / 10;
    }

    return rev;
    
  }

  // This method should return a String that is a list of all of the divisors of a number (excluding 1 and itself) separated by a space

  public static String divisors(int num)
  {
    int divisor = 2;
    String answer = "";
    while (divisor < num)
    {
      if (num % divisor == 0)
      {
        answer = answer + divisor + " ";
      }
      divisor++;
    }
    return answer;
  } 

  public static void main(String[] args)
  {
    System.out.println(Main.digitCounter(100));
    System.out.println(Main.digitSum(1234));

    System.out.println(Main.digitAvg(100));
    System.out.println(Main.digitAvg(1234));
    System.out.println(Main.digitAvg(3));
  }

}
