
public class Location {
	
		// Data fields
		public int row;
		public int column;
		public double maxValue;
		
		public Location (int row, int column, double maxValue) {
			this.row = row;
			this.column = column;
			this.maxValue = maxValue;
		}
		public static Location locateLargest(double[][] a) {
			
			int row = 0;
			int column = 0;
			double maxValue = a[row][column];
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) { // JA
					if (maxValue < a[i][j]) { // I honestly do not understand why this doesn't work
						maxValue = a[i][j];
						row = i;
						column = j;
					}
				}
			}
			
			return new Location(row,column,maxValue);
		}

	}
