def maxXor( l,  r):
    res = 0
    for i in range(l,r+1):
        for j in range(l,i):
            res = max(res,i^j)
    return res

    

_l = int(raw_input());


_r = int(raw_input());

res = maxXor(_l, _r);
print(res)


