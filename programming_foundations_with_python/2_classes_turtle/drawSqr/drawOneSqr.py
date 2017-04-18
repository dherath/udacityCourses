import turtle

def square ():
	w= turtle.Screen()
	w.bgcolor("red")

	turt1= turtle.Turtle()

	#initialPos= turt1.position()
	#print("Initial Position = " + initialPos[0] + initialPos[1])

	for i in range(4) :
		turt1.right(90)
		turt1.forward(100)

	# doesnt stop 	
	#while(turt1.position() != initialPos):
	#	turt1.right(90)
	#	turt1.forward(100)

	#print("Final POsition = " + turt1.position())

	w.exitonclick()

square()