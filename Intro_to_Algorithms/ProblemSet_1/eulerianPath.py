# Find Eulerian Tour
#
# Write a function that takes in a graph
# represented as a list of tuples
# and return a list of nodes that
# you would follow on an Eulerian Tour
#
# For example, if the input graph was
# [(1, 2), (2, 3), (3, 1)]
# A possible Eulerian tour would be [1, 2, 3, 1]
import random


def find_eulerian_tour(graph):
    # your code here
	path =[]
	start = graph[0][0]
	end = graph[0][1]
	path.append(start)
	path.append(end)
	graph.remove(graph[0])

	while len(graph)>1:
		test =[pair for pair in graph if pair[1]==start or pair[0]==start]
		if len(test)==1:
			graph.remove(test[0])    	
		print "path = ",path
		print "length of graph = ",len(graph)
		print "end index = ",end, "  graph= ", graph
		options = [pair for pair in graph if pair[1]==end or pair[0]==end]
		print "options = ",options

		pair = random.sample(options,1)
		print "pair = ",pair
		print "---------------------------------------"
		graph.remove(pair[0])
		if pair[0][0]==end:
			end=pair[0][1]
			path.append(end)
		elif pair[0][1]==end:
			end=pair[0][0]
			path.append(end)
		#print len(graph)
		path.append(start)
	return path

# test cases

case1 = [(3,1),(2,3),(1,2)]
case2 = [(1,2),(3,4),(4,1),(2,3)]
case3 = [(1,2),(3,2),(1,3),(6,5),(3,6),(4,5),(3,4)]
case4 = [(0, 1), (1, 5), (1, 7), (4, 5),(4, 8), (1, 6), (3, 7), (5, 9),(2, 4), (0, 4), (2, 5), (3, 6), (8, 9)]
case5 =[(8, 16), (8, 18), (16, 17), (18, 19),(3, 17), (13, 17), (5, 13),(3, 4), (0, 18), (3, 14), (11, 14),
	(1, 8), (1, 9), (4, 12), (2, 19),(1, 10), (7, 9), (13, 15),(6, 12), (0, 1), (2, 11), (3, 18), (5, 6), (7, 15), (8, 13), (10, 17)]

print find_eulerian_tour(case1)
print find_eulerian_tour(case2)
print find_eulerian_tour(case3)
print find_eulerian_tour(case4) 
print find_eulerian_tour(case5)
