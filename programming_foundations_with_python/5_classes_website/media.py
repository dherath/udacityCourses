import webbrowser

class Movie() :
	""" This class provides a way to store a movie related information"""

	VALID_RATINGS = ["G","PG","PG-13","R"]

	def __init__(self,movie_title,movie_story,movie_poster,movie_trailer): #self->instance being created
		self.title = movie_title
		self.storyline = movie_story
		self.poster_image_url = movie_poster
		self.trailer_youtube_url = movie_trailer

	def show_trailer(self) :
		webbrowser.open(self.trailer_youtube_url)	

