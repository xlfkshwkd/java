public class Movietest {

	public static void main(String[] args) {
	
		Movie mv = new Movie();
         
  	   mv.mvtitle("Transformer");

  	   System.out.println("답은 "+ mv.vtitle()  );
		mv.mvtitle();
  	 System.out.println("답은 "+ mv.vtitle()  );
	}

}
