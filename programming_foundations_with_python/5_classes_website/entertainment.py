import fresh_tomatoes
import media

toy_story = media.Movie("Toy story",
						"Talking Walking Toys",
						"https://upload.wikimedia.org/wikipedia/en/1/13/Toy_Story.jpg",
						"https://www.youtube.com/watch?v=vwyZH85NQC4")
avatar = media.Movie("Avatar",
					 "Aliens",
					 "http://upload.wikimedia.org/wikipedia/id/b/b0/Avatar-Teaser-Poster.jpg",
					 "https://www.youtube.com/watch?v=5PSNL1qE6VY")

transformers = media.Movie("Transformers",
							"Alien Robots",
							"https://upload.wikimedia.org/wikipedia/en/6/66/Transformers07.jpg",
							"https://www.youtube.com/watch?v=ejxQOv53lXs")

hobbit = media.Movie("Hobbit",
	"prequel to Lord of the Rings",
	"https://upload.wikimedia.org/wikipedia/en/b/b3/The_Hobbit-_An_Unexpected_Journey.jpeg",
	"https://www.youtube.com/watch?v=ZEOM13UyZ0A")

percy_jackson = media.Movie("Percy Jackson",
	"Olympian legends + real world",
	"https://upload.wikimedia.org/wikipedia/en/e/eb/Percy_Jackson_%26_the_Olympians_The_Lightning_Thief_poster.jpg",
	"https://www.youtube.com/watch?v=xko1Mx5w4tg")

fantastic_beasts = media.Movie("Fantastic Beasts and Where to Find Them",
	"Prequel to 1st wizarding war in harry potter series",
	"https://upload.wikimedia.org/wikipedia/en/5/5e/Fantastic_Beasts_and_Where_to_Find_Them_poster.png",
	"https://www.youtube.com/watch?v=ViuDsy7yb8M")

movies = [toy_story,avatar,transformers,hobbit,percy_jackson,fantastic_beasts]
fresh_tomatoes.open_movies_page(movies)