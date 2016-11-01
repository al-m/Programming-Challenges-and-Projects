def memoize(f):
    cache = {}
    def aux(a,b,c):
        if not (a,b,c) in cache:
            cache[(a,b,c)]=f(a,b,c)
        return cache[(a,b,c)]
    return aux

@memoize
def new_fib(t1, t2, n):
    if n==0: return t1
    if n==1: return t2
    return new_fib(t1, t2, n-2)+new_fib(t1, t2, n-1)**2

t1, t2, n = map(int, raw_input().split(" "))

print(new_fib(t1,t2, n-1))
