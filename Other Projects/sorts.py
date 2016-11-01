from random import randint
from time import time

# find the smallest element, put it at the beginning, delete it from the original list, and recurse
def selection_sort(S):
	if not S:
		return []
	else:
		res = S
		smallest = min(S)
		res.remove(smallest)
		return [smallest]+selection_sort(res)

# take each element and insert it in the newly made sorted sublist
def insertion_sort(S):
	if len(S)<=1:
		return S
	else:
		return insert(S[0],insertion_sort(S[1:]))

def insert(e,l):
	for i in range(len(l)):
		if e<l[i]:
			return l[:i]+[e]+l[i:]
	return l + [e]


# search through the list until we find two elements that aren't in order,
# swap them around, and start over
def bubble_sort(S):
	res = S
	is_changed = True
	n = len(S)
	while is_changed:
		is_changed = False
		for i in range(n-1):
			if res[i]>res[i+1]:
				is_changed = True
				res[i], res[i+1] = res[i+1], res[i] 
	return res


# split the list into two smaller lists, sort each smaller list in this fashion
# then merge 
def merge_sort(S):
	n = len(S)
	if n<=1:
		return S
	else:
		left = S[:n/2]
		right = S[n/2:]
		return merge(merge_sort(left),merge_sort(right))

def merge(l1,l2):
	if l1==[] or l2==[]:
		return l1+l2
	else:
		if l1[0]<l2[0]:
			return [l1[0]]+merge(l1[1:],l2)
		else:
			return [l2[0]]+merge(l1,l2[1:])


# take an element at random, called pivot
# build the list of smaller elements, and the list of bigger elements
# sort these lists in the same way, then concatenate them.
def quick_sort(S):
	n = len(S)
	if n <= 1:
		return S
	else:
		pivot = S[randint(0,n-1)]
		smaller = []
		bigger = []
		equal = []
		for i in range(n):
			if S[i]<pivot:
				smaller += [S[i]]
			elif S[i]==pivot:
				equal += [S[i]]
			else:
				bigger += [S[i]]
		return quick_sort(smaller)+equal+quick_sort(bigger)



# testing the sorts, to 4 significant digits
def test():
	test_array = [randint(1,1e6) for i in range(500)]
	t0 = time()
	selection_sort(test_array)
	t = time()-t0
	print "Selection sort: ", format(t, '.4g')
	t0 = time()
	insertion_sort(test_array)
	t = time()-t0
	print "Insertion sort: ", format(t, '.4g')
	t0 = time()
	bubble_sort(test_array)
	t = time()-t0
	print "Bubble sort:    ", format(t, '.4g')
	t0 = time()
	merge_sort(test_array)
	t = time()-t0
	print "Merge sort:     ", format(t, '.4g')
	t0 = time()
	quick_sort(test_array)
	t = time()-t0
	print "Quick sort:     ", format(t, '.4g')

