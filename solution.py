def count_set_bits(n):
    n += 1
    count = 0
    for bit in range(32):
        div = n // (1 << (bit + 1))
        rem = n % (1 << (bit + 1))
        count += div * (1 << bit)
        count += min(max(rem - (1 << bit), 0), (1 << bit))
    return count