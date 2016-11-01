def lonelyinteger(a):
    if len(a)==1: return a[0]
    a.sort()
    i = 0
    while i<len(a)-2:
        if a[i]==a[i+1]:
            i+=2
            continue
        return a[i]
    return a[i]
if __name__ == '__main__':
    a = input()
    b = map(int, raw_input().strip().split(" "))
    print lonelyinteger(b)
