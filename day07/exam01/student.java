package exam01;

public class student {

   private int id;
   private String name;

   private String subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printThis()
    {
        System.out.println(this+", 주소 : "+System.identityHashCode(this));
        this.name="학생임";
        System.out.println(name); //this 생략
    //   System.out.println(this.name);
       getSubject(); //this.getSubject
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
