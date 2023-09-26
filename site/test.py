while True:
    n = int(input())
    if n == 0:
        break
    re = 0
    while n > 2:
        k = n // 3
        r = n % 3
        re += k
        n = k + r
    if n == 2:
        re += 1
    print(re)

print("aaaa")
