#Algorithm case study

def naive(a,b):
	x=a
	y=b;z=0
	while x>0:
		z=z+y
		x=x-1
	return z

print naive(3,4)
print naive(3,120)
