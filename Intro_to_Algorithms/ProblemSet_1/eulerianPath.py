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
    			path.append(pair[1])
    			end =pair[1]
    			graph.remove(pair)
    return path

print find_eulerian_tour([(3,1),(2,3),(1,2)])



