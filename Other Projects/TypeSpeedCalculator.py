from time import time 

class _Getch:
    def __init__(self):
        try:
			self.impl = _GetchUnix()
        except ImportError:
        	self.impl = _GetchWindows()

    def __call__(self): return self.impl()


class _GetchUnix:
    def __init__(self):
        import tty, sys

    def __call__(self):
        import sys, tty, termios
        fd = sys.stdin.fileno()
        old_settings = termios.tcgetattr(fd)
        try:
            tty.setraw(sys.stdin.fileno())
            ch = sys.stdin.read(1)
        finally:
            termios.tcsetattr(fd, termios.TCSADRAIN, old_settings)
        return ch


class _GetchWindows:
	def __init__(self):
		import msvcrt

	def __call__(self):
		import msvcrt
		return msvcrt.getch()

getch = _Getch()

print("Press 'Return' to start")

while ord(getch.impl())!=13: # waiting for the user to press return
	pass

print("Typing Speed Calculator has started. Start typing ! Hit Enter when you're done.")

t = time()
sentence = raw_input()
t = time() - t
sentence = ((sentence.translate(None,'\"\',.:;?!/\\-_#~=+&()[]{}@')).decode("utf-8")).split()
words = len(sentence)
chars = sum(map(len,sentence))
wpm = 60*words/t
cpm = 60*chars/t

print("Your speed is %.2f words per minute, and %.2f characters per minute." % (wpm, cpm))
