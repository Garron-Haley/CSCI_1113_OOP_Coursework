package book;

public class book {

	public static void main(String[] args) {
		double foot = 1;
		double meter = 20;
		System.out.println("Feet"+"    Meters"+"       Meters"+"   Feet");
		while (foot < 11) {
			System.out.printf("%3.1f", foot);
			System.out.printf("%8.3f", footToMeter(foot));
			System.out.printf("%11.1f", meter);
			System.out.printf("%10.3f", meterToFoot(meter));
			System.out.println();
			foot++;
			meter = meter + 5;
		}
	}
		public static double footToMeter(double foot) {
			double meter = foot * .305;
			return meter;
			 
		}
		public static double meterToFoot(double meter) {
			double foot = 3.279 * meter;
			return foot;
		}
	}


