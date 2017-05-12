#Algorithm case study

def naive(a,b):
	x=a
	y=b;z=0
	while x>0:
		z=z+y
		x=x-1
	return z

def time(a):
	#finds number of steps required for multiplication
	return 2*a+3

print "ans= ",naive(3,4)," steps= ",time(3)
print "ans= ",naive(3,120)," steps= ",time(3)
