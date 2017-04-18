
class Parent() :
	def __init__(self,last_name,eye_color) :
		print("parent constructor called")
		self.last_name = last_name
		self.eye_color = eye_color

	def shw_info(self):
		print("Last Name -> "+self.last_name)
		print("Eye color -> "+self.eye_color)

class Child(Parent):
	def __init__(self,last_name,eye_color,number_of_toys):
		print("child constructor called")
		Parent.__init__(self,last_name,eye_color)
		self.number_of_toys = number_of_toys

	def shw_all_info(self):
		Parent.shw_info(self)
		print("Number of Toys -> "+str(self.number_of_toys))

#billy_cirus= Parent("Cyrus","Brown")
#billy_cirus.shw_info()
#print billy_cirus.last_name

miley_cirus = Child("Cyrus","Blue",5)
miley_cirus.shw_all_info()
#print miley_cirus.last_name
#print miley_cirus.number_of_toys