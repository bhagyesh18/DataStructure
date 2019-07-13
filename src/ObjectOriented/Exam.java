package ObjectOriented;
import java.util.ArrayList;
import java.util.List;


//https://dzone.com/articles/working-with-hashcode-and-equals-in-java

public class Exam {

	static class Point {

		private double x, y;

		Point(double x, double y) {
			this.x = x;
			this.y = y;
		}

		// Try to remove and use default equals.

		@Override
		public boolean equals(Object obj) {
			Point p1 = (Point) obj;
			if (obj == null)
				return false;
			if (!(obj instanceof Point))
				return false;
			if (obj == this)
				return true;

			if (this.x == p1.x && this.y == p1.y) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
	}

	public static void main(final String[] args) {
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(1, 2));
		pointList.add(new Point(3, 4));
		System.out.println(pointList.size());
		// remove the second Point
		System.out.println(new Point(3, 4).equals(new Point(3, 4)));
		System.out.println(new Point(3, 4).hashCode() + "    " + new Point(3, 4).hashCode());
		pointList.remove(new Point(3, 4));
		System.out.println(pointList.size());
		System.out.println(pointList.contains(new Point(3, 4)));
		// Not removed!
	}
}
