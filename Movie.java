public class Movie 
{
	private String title, director, actors;
	
	void mvtitle(String b) {  // ������ 
		title = b;
		director="sim";
		 int actors=5;
		}
	void mvtitle() {  // ������ 
		title = "NULL";
		director="NULL";
		 int actors=5;
		}
	String vtitle() 
	{		// ������
        return  title;
	}
	
}