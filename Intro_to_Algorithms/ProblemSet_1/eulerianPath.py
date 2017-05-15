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

def find_eulerian_tour(graph):
    # your code here
    path =[]
    initial= graph[0]
    start = initial[0]
    end = initial[1]
    path.append(start)
    path.append(end)
    graph.remove(initial)
    while start !=end :
    	for pair in graph :
			if pair[0]==end:
				end=pair[1]
				path.append(end)
				graph.remove(pair)
			elif pair[1]==end:
				end=pair[0]
				path.append(end) 	
				graph.remove(pair)
    return path

# test cases

case1 = [(3,1),(2,3),(1,2)]
case2 = [(1,2),(3,4),(4,1),(2,3)]
case3 = [(1,2),(3,2),(1,3),(6,5),(3,6),(4,5),(3,4)]

print find_eulerian_tour(case1)
print find_eulerian_tour(case2)
print find_eulerian_tour(case3)




