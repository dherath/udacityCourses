import turtle

def drawSquare(size,angle,color) :
	t1=turtle.Turtle()
	t1.ht()
	t1.pencolor(color)
	t1.right(angle)
	for i in range (4) :
		t1.forward(size)
		if i%2==0 : t1.right(60)
		else : t1.right(120)


def combinedShape(sz,colorVal):
	angleList = [x for x in range(360) if x%5==0]
	for i in angleList :
		drawSquare(sz,i,colorVal)

w=turtle.Screen()
w.bgcolor("white")

combinedShape(80,"pink")

t2= turtle.Turtle()
t2.right(90)
t2.shape("turtle")
t2.pencolor("pink")
t2.color("pink")
t2.forward(180)

w.exitonclick()

