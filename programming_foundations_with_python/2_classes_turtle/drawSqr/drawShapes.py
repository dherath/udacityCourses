import turtle

def drawSqr() :
	t1= turtle.Turtle()
	t1.pencolor("yellow")
	for i in range(4) :
		t1.forward(100)
		t1.right(90)

def drawCirc():
	t2 = turtle.Turtle()
	t2.pencolor("white")
	t2.circle(100)

def drawTriangle():
	t3= turtle.Turtle()
	t3.pencolor("green")
	t3.left(60)
	for i in range(3):
		t3.forward(100)
		t3.right(120)

w= turtle.Screen()
w.bgcolor("red")

drawSqr()
drawCirc()
drawTriangle()

w.exitonclick()