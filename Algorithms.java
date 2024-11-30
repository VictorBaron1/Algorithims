import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;

public class Algorithms 
{
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int two = two();
        int great = great();
        int greatest = greatest();
        int least = least();
        int sum =sum();
        int average = average();
        int mode = mode();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(two);
        System.out.println(great);
        System.out.println(greatest);
        System.out.println(least);
        System.out.println(sum);
        System.out.println(average);
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 1)
                odds++;
        }
        return odds;
    }
    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }
    public static int two() throws FileNotFoundException{
        s = new Scanner(f);
        int two = 0;
        while (s.hasNext()) {
            if (s.nextInt() >= 10 && s.nextInt() <= 99)
                two++;
        }
        return two;
    }
    public static int great() throws FileNotFoundException{
        s = new Scanner(f);
        int great = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                great++;
        }
        return great;
    }
    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext()) {
            if (s.nextInt() > greatest)
            {
                greatest = s.nextInt();
            }
        }
        return greatest;
    }
    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 0;
        while (s.hasNext()) {
            if (s.nextInt() < least)
            {
                least = s.nextInt();
            }
        }
        return least;
    }
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) 
        {
            sum+=s.nextInt();
        }
        return sum;
    }
    public static int average() throws FileNotFoundException{
        s = new Scanner(f);
        int average = 0;
        int sum = 0;
        int total = 0;
        while (s.hasNext()) 
        {
            sum+=s.nextInt();
            total ++;
        }
        average = sum/total;
        return average;
    }
    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        int mode = 0;
        int value = 0;
        int counter[] = new int[1000]; 
        while (s.hasNext()) 
        {
            counter[s.nextInt()]+=1;
        }
        for (int i = 0; i<1000; i++)
        {
            if (counter[i] > value)
            {
                mode = i;
                value = counter[i];
            }
        }
        return mode;
    }
}