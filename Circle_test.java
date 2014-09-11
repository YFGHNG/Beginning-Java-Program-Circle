class Circle_test {
    public static void main(String [ ] args) {

		Circle c = new Circle( );

        double a;
        for (int i = 0; i <= 10; i++) {
            c.setR(i);
            a = c.area( );
			
			System.out.printf("\nArea of a circle with radius %d is = %f\n", i, c.area() );
        }
    }
}
