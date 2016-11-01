from time import sleep
from random import randint

def print_tab(t):
	print('____________________________________________________________________________________________________')
	for i in range(len(t)):
		print(["0" if t[i][j] else " " for j in range(len(t[i]))])
	print('____________________________________________________________________________________________________')

def next(t):
	n = len(t)
	res1 = [t[i] + [0] + [0] for i in range(n)] + [[0 for i in range(n+2)]] + [[0 for i in range(n+2)]]
	res2 = [[0] + t[i] + [0] for i in range(n)] + [[0 for i in range(n+2)]] + [[0 for i in range(n+2)]]
	res3 = [[0] + [0] + t[i] for i in range(n)] + [[0 for i in range(n+2)]] + [[0 for i in range(n+2)]]
	res4 = [[0 for i in range(n+2)]] + [t[i] + [0] + [0] for i in range(n)] + [[0 for i in range(n+2)]]
	res5 = [[0 for i in range(n+2)]] + [[0] + [0] + t[i] for i in range(n)] + [[0 for i in range(n+2)]]
	res6 = [[0 for i in range(n+2)]] + [[0 for i in range(n+2)]] + [t[i] + [0] + [0] for i in range(n)]
	res7 = [[0 for i in range(n+2)]] + [[0 for i in range(n+2)]] + [[0] + t[i] + [0] for i in range(n)]
	res8 = [[0 for i in range(n+2)]] + [[0 for i in range(n+2)]] + [[0] + [0] + t[i] for i in range(n)]
	res = [[res1[i][j] + res2[i][j] + res3[i][j] + res4[i][j] + res5[i][j] + res6[i][j] + res7[i][j] + res8[i][j] for j in range(n+2)] for i in range(n+2)]
	res = res[1:-1]
	res = [truc[1:-1] for truc in res]
	lastres = t
	for i in range(n):
		for j in range(n):
			if t[i][j]==0:
				if res[i][j]==3:
					lastres[i][j]=1
			else:
				if res[i][j] in [2,3]:
					lastres[i][j]=1
				else:
					lastres[i][j]=0
	return lastres

def run():
	t = [[randint(0,1) for j in range(20)] for i in range(20)]
	while True:
		print_tab(t)
		t = next(t)
		sleep(0.1)

run()
