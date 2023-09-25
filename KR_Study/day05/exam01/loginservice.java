package exam01;

public class loginservice {
    private loginservice(){}
    private static loginservice instance;


    public static loginservice getInstance(){
        if(instance == null) {
            instance = new loginservice();
        }
        return instance;
    }
    //싱글톤 필요할때만 꺼내씀
    

}
