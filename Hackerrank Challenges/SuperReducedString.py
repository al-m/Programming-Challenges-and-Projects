s = raw_input()
s2=[]
for i in s:
    if s2==[]: 
        s2.append(i)
        continue
    a = s2.pop()
    if not i==a:
        s2.append(a)
        s2.append(i)
    
s = "".join(s2)
    
if s == "": print('Empty String')
else: print(s)
