# A tree is a list containing:
# A node (a numerical value)
# A left subtree, which may be empty
# A right subtree, which may be empty

def insert(value, tree):
	if tree==[]:
		tree.append(value)
		tree.append([])
		tree.append([])
	else:
		if value<tree[0]:
			insert(value,tree[1])
		else:
			insert(value,tree[2])


def insert_unique(value, tree):
	if tree==[]:
			tree.append(value)
			tree.append([])
			tree.append([])
	else:
		if value<tree[0]:
			insert_unique(value,tree[1])
		elif value>tree[0]:
			insert_unique(value,tree[2])


def print_tree(tree, n=0):
	if tree==[]:
		pass
	#	print(n*"\t" + 'NIL')
	else:
		print_tree(tree[1],n+1)
		print(n*"\t"+str(tree[0]))
		print_tree(tree[2],n+1)

def binsearch(x,a,start=None,end=None):
	if start==None: start = 0
	if end == None: end = len(a)-1
	if x<a[start] or x>a[end]: return -1
	if x==a[start]: return start
	if x==a[end]: return end
	new = start + (end-start)/2
	test = a[new]
	if x==test:	
		return new
	if x>test: 
		return binsearch(x,a,new,end)
	else:
		return binsearch(x,a,start,new)

[binsearch(i,range(10)) for i in range(10)]

