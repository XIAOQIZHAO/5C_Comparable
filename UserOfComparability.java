/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        System.out.println( System.lineSeparator()
                          + "Date comparisons");
	
        // Date vs. itself
        Date d0 = new Date( 2019, 4, 4);
        reportRelationship( "Date vs. itself", d0, d0, "0");

        // Date vs. one year after
        reportRelationship( "Date vs. one year after"
			    , d0, new Date( 2020, 4, 4), "negative int");

        // Date vs. a month before
        reportRelationship( "Date vs. a month before", d0
			    , new Date( 2019, 3, 4), "positive int");

        // 2002, 2, 1 vs. 2002, 1, 31
        reportRelationship( "2002, 2, 1 vs. 2002, 1, 31",
			    new Date( 2002, 2, 1)
			    , new Date( 2002, 1, 31), "positive int");
        System.out.println( "---- end of Date comparisons ----");

	// System.out.println( System.lineSeparator()
        //                   + "Dog comparisons");

        // //incomparable dogs
        // reportRelationship( "incomparable dogs",
	// 		    new IncomparableDog()
	// 		    , new IncomparableDog(), "incomparable");
	// //error: incompatible types: IncomparableDog cannot be converted to Comparable
	// 		    new IncomparableDog()
        // System.out.println( "---- end of Dog comparisons ----");

	// System.out.println( System.lineSeparator()
        //                   + "Point and Date comparisons");

        // // (3, 4) vs. 2019-4-4
        // reportRelationship( "(3, 4) vs. 2019-4-4",
	// 		    new Point(3, 4)
	// 		    , new Date(2019, 4, 4), "incomparable");
        // System.out.println( "---- end of Point-Date comparisons ----");
	// //Exception in thread "main" java.lang.ClassCastException: Date cannot be cast to Point

	
    }


    /**
      run one test
     */
    private static void reportRelationship 
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}
