import urllib

def readText():
	quotes = open("movie_quotes.txt")
	contents=quotes.read()
	quotes.close()
	checkProfanity(contents)

def checkProfanity(_text) :
	connection = urllib.urlopen("http://www.wdyl.com/profanity?q="+_text)	
	output = connection.read()
	conection.close()
	if "true" in output :
		print("Profanity ALert !")
	elif "false" in output :
		print("NO curse words")
	else :
		print("could not scan document")


readText()


