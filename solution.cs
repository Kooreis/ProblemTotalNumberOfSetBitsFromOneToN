Here is a simple console application in C# that calculates the total number of set bits in all numbers from 1 to N.

```C#
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter a number: ");
        int n = Convert.ToInt32(Console.ReadLine());
        int bitCount = 0;

        for (int i = 1; i <= n; i++)
        {
            bitCount += CountBits(i);
        }

        Console.WriteLine("Total set bits: " + bitCount);
    }

    static int CountBits(int number)
    {
        int count = 0;
        while (number > 0)
        {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
}
```

This program works by iterating over all numbers from 1 to N and for each number, it counts the number of set bits. The `CountBits` function works by repeatedly checking the least significant bit of the number and then right shifting the number until the number becomes 0. The total count of set bits is then printed to the console.