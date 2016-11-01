# my implementation of singly linked lists
class Slili:
	
	def __init__(self, val = None, next = None):
		self.val = val
		self.next = next

	def setval(self, value):
		self.val = value

	def add(self,node):
		self.next = node

	def delete(self):
		next = self.next
		if next:
			self.val = next.val
			self.next = next.next
			

# my implementation of doubly linked lists
class Dlili:

	def __init__(self):
		self.val = None
		self.next = None
		self.prev = None

	def setval(self, value):
		self.val = value
	
	def add(self,next):
		self.next = next
		self.next.prev = self

	def delete(self):
		next = self.next
		if next:
			self.val = next.val
			self.next = next.next
