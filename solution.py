Here is a Python console application that calculates the total number of set bits in all numbers from 1 to N.

```python
def count_set_bits(n):
    n += 1
    count = 0
    for bit in range(32):
        div = n // (1 << (bit + 1))
        rem = n % (1 << (bit + 1))
        count += div * (1 << bit)
        count += min(max(rem - (1 << bit), 0), (1 << bit))
    return count

if __name__ == "__main__":
    n = int(input("Enter a number: "))
    print("Total set bits: ", count_set_bits(n))
```

You can run this console application, it will ask you to enter a number and then it will print the total number of set bits in all numbers from 1 to the entered number.