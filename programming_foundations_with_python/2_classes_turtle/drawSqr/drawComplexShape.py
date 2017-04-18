import turtle

def drawSquare(size,angle,color) :
	t1=turtle.Turtle()
	t1.pencolor(color)
	t1.right(angle)
	for i in range (4) :
		t1.right(90)
		t1.forward(size)

def combinedShape(sz,colorVal):
	angleList = [x for x in range(360) if x%5==0]
	for i in angleList :
		drawSquare(sz,i,colorVal)

w=turtle.Screen()
w.bgcolor("red")

combinedShape(70,"green")
combinedShape(35,"yellow")

w.exitonclick()

