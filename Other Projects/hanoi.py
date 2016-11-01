#stacks are implemented as lists here, the top element is at index -1
def push(item,stack):
	stack.append(item)

def isEmpty(stack):
	return stack==[]

# This function uses pole2 to transfer all disks from pole3, which should be 
# in ascending order from top to bottom, to pole1, using the Hanoi Towers rules
def hanoi(pole1,pole2,pole3,disks):
	if isEmpty(pole3):
		return
	else:
		if disks ==2:
			push(pole3.pop(),pole2)
			push(pole3.pop(),pole1)
			push(pole2.pop(),pole1)
		elif disks ==1:
			push(pole3.pop(),pole1)
		else:
			hanoi(pole2,pole1,pole3,disks-1)
			push(pole3.pop(),pole1)
			hanoi(pole1,pole3,pole2,disks-1)

