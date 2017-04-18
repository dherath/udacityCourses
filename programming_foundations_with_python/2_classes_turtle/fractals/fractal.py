import turtle
import math

def triangle(t,size,color):
	t.pencolor(color)
	t.fillcolor(color)
	t.ht()
	t.fill(True)
	t.right(60)
	for i in range(3):
		t.forward(size)
		t.right(120)
	t.fill(False)

def multiTriangle(_size,_pos,_col) :
	(x1,y1) = _pos
	(x2,y2) = ((x1-_size*math.sin(math.pi/6)),(y1-_size*math.cos(math.pi/6)))
	(x3,y3)	= ((x1+_size*math.sin(math.pi/6)),(y1-_size*math.cos(math.pi/6)))
	for i in range(3):
		t= turtle.Turtle()
		t.pencolor(_col)
		if i==0 : t.setposition((x1,y1))
		elif i==1 : t.setposition((x2,y2))
		else : t.setposition((x3,y3))
		triangle(t,_size,_col)

w=turtle.Screen()
w.bgcolor("white")

multiTriangle(100,(0,0),"red")






# this part is wrong------- > use  afor loop for better resutls		

#def fractal(_size,_pos):
#	if _size < 100 :
#		break
#	else :
#		_size = _size/2
#		(x1,y1) = _pos
#		(x2,y2) = ((x1-_size*math.sin(math.pi/6)),(y1-_size*math.cos(math.pi/6)))
#		(x3,y3)	= ((x1+_size*math.sin(math.pi/6)),(y1-_size*math.sin(math.pi/6)))
#		return multiTriangle(_size,(x1,y1),"green"),multiTriangle(_size,(x1,y1),"green"),multiTriangle(_size,(x1,y1),"green")









w.exitonclick()

