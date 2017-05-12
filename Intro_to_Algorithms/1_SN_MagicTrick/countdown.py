import math

def time(n):
	steps = 3 + 2*math.ciel(n/5)
    return steps

def countdown(x):
    y = 0
    while x > 0:
        x = x - 5
        y = y + 1
    print y

print countdown(50)