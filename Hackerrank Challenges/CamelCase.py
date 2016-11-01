import sys


s = raw_input().strip()
count = 1
for i in s:
    n = ord(i)
    count += ((n>=65) and (n<=90))
    
print(count)
