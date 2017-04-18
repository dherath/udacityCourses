import turtle
import math

def Uptriangle(location,size,color):
	t=turtle.Turtle()
	#------------- movement to location-------------
	t.penup()
	t.setposition(location)
	t.pendown()
	#-----------------------------------------------
	t.pencolor(color)
	t.ht()
	t.fillcolor(color)

	stepsUp = (size*math.cos(math.pi/6))/2

	t.fill(True)
	t.left(90)
	t.forward(stepsUp)
	t.right(150)
	for i in range(3) :
		t.forward(size)
		t.right(120)
	t.fill(False)	

def Dwntriangle(location,size,color):
	t= turtle.Turtle()
	#------------- movement to location-------------
	t.penup()
	t.setposition(location)
	t.pendown()
	#-----------------------------------------------

	t.pencolor(color)
	t.fillcolor(color)
	t.ht()

	stepsUp = (size*math.cos(math.pi/6))/2

	t.fill(True)
	t.left(90)	
	t.forward(stepsUp)
	t.right(90)
	t.forward(size/2)
	for i in range(2) :
		t.right(120)
		t.forward(size)
	t.right(120)
	t.forward(size/2)
	t.fill(False)



w=turtle.Screen()
w.bgcolor("white")


# initial conditions -------------------
length = 400
x = 0
y = 0
distance = (length * math.cos(math.pi/6))/4
Uptriangle((x,y),length,"red")
Dwntriangle((x,y-distance),length/2,"yellow")

x=x;
y= y-distance
temp = 
for j in range(3) :
	if j == 0 : 
		dx = x 
		dy = y + distance*(2/3)
	elif j== 1 : 
		dx = x + distance*(1/2)
		dy = y - distance*(1/3)
	else : 
		dx = x - distance*(1/2)
		dy = y - distance*(1/3)
	Dwntriangle((dx,dy),length/4,"yellow")


w.exitonclick()

