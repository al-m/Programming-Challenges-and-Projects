# some simple recursive functions

# calculate the factorial of an integer number
def factorial(n):
	#i choose this convention for negative numbers
	if n<0:
		return (-1)**n*factorial(-n)
	if n==0 or n==1:
		return 1
	else:
		return n*factorial(n-1)

# collatz conjecture : calculate total number of steps to reach 1
def collatz(n):
	if n<=0:
		return -1
	if n==1:
		return 0
	else:
		if n%2:
			return 2 + collatz((3*n+1)/2)
		else:
			return 1 + collatz(n/2)

# compute all the permutations of a given string s
def permutations(s):
	if len(s)<=1 :
		return s
	else:
		return merge_char_into_stringarray(s[0],permutations(s[1:]))

def merge_char_into_stringarray(c, l):
	if len(l)==1:
		return merge_char_into_string(c,l[0])
	else:
		return merge_char_into_string(c,l[0]) + merge_char_into_stringarray(c,l[1:])

def merge_char_into_string(c,s):
	n = len(s)
	return [s[:i]+c+s[i:] for i in range(n+1)]


# compute all subsets of a set, passed in as a list
def subsets(a):
	if len(a)==0:
		return [[]]
	if len(a)==1:
		return [a, []]
	else:
		return [[a[0]]]+merge_element_into_set(a[0],subsets(a[1:]))

def merge_element_into_set(e,S):
	res = []
	for s in S:
		if s:
			res += [[e]+s]
	return res + S
