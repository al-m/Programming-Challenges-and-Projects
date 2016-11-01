def ispower(n):
    return (n&(n-1))==0

def largestsmallerpower(n):
    x = n
    y = n&(n-1)
    while y:
        x=y
        y = x&(x-1)
    return x

def next(n):
    if ispower(n): return n>>1
    return n-largestsmallerpower(n)

T = input()
for i in range(T):
    n = input()
    if n==1: print("Richard"); continue
    win = 0
    while n>1:
        n = next(n)
        win ^= 1
    print("Richard"*(1-win) + "Louise"*win)
