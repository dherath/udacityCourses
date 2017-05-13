# russian peasents algorithm

def  russian(a,b):
	x=a;y=b
	z=0
	while x>0:
		if x%2 ==1 : z =z+y
		y=y<<1
		x=x>>1
	return z

# recursive algorithm

def rec_russian(a,b):
	if a==0: return 0
	elif a%2 ==0 : return 2*rec_russian(a/2,b)
	else  : return b+2*rec_russian((a-1)/2,b)

print "russian(22,11) = ",russian(22,11)
print "recursive russian(22,11) = ",rec_russian(22,11)
