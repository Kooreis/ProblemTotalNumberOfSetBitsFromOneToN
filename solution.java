Here is a Java console application that calculates the total number of set bits in all numbers from 1 to N.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int totalSetBits = 0;
        for (int i = 1; i <= n; i++) {
            totalSetBits += countSetBits(i);
        }
        System.out.println("Total set bits from 1 to " + n + " is " + totalSetBits);
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
```

This program first prompts the user to enter a number. It then calculates the total number of set bits in all numbers from 1 to the entered number. The `countSetBits` method is used to count the number of set bits in a single number. It does this by repeatedly shifting the number to the right and adding the least significant bit to the count. The total number of set bits is then printed to the console.