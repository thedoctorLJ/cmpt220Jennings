// Revise the program so it finds two points in a three-dimensional space nearest to each other
public class Problem8_7 {

	public static void main(String[] args) {
		// Initialize array with points
				double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},                      
					{2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},                          
					{5.5, 4, -0.5}};

				// p1 and p2 are the indices in the points' array
				int p1 = 0, p2 = 1, p3 = 3; // Initial two points
				double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2],
					points[p2][0], points[p2][p1], points[p3][p2]); // Initialize shortest Distance

				// Calculate distance for every two points
				for (int i = 0; i < points.length; i++) {
					for (int j = i + 1; j < points.length; j++) {
						double distance = distance(points[i][0], points[i][1], points[i][2],
							points[j][0], points[j][1], points[j][2]); // Find distance

						if (shortestDistance > distance) {
							p1 = i; // Update p1
							p2 = j; // Update p2
							shortestDistance = distance; // Update shortestDistance
						}
					}
				}

				// Display result
				System.out.println("The closest two points are " +
					"(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
						points[p2][0] + ", " + points[p2][1] + ")"); // JA: You forgot to print the z coordinate
			}

			// Calculate the distance between two points (x1, y1) and (x2, y2) 
			public static double distance(
				double x1, double y1, double z1, double x2, double y2, double z2) {
				return Math.sqrt(Math.pow(x2 - x1, 2) +  
					Math.pow(y2 - y1, 2) + Math.pow(y2 - y1, 2)); // JA: last term is z2 - z1
			}

	}
