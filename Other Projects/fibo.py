import math as m

def fibo(n):
# we define the Fibonacci sequence as [1,1,2,3,...]
	phi1 = (1+m.sqrt(5))/2
	phi2 = (1-m.sqrt(5))/2
	a = 1/m.sqrt(5)
	res = int(a*(phi1**(n+1)-phi2**(n+1)))
	return res
