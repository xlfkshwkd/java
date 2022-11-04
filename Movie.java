public class Movie 
{
	private String title, director, actors;
	
	void mvtitle(String b) {  // 설정자 
		title = b;
		director="sim";
		 int actors=5;
		}
	void mvtitle() {  // 설정자 
		title = "NULL";
		director="NULL";
		 int actors=5;
		}
	String vtitle() 
	{		// 접근자
        return  title;
	}
	
}