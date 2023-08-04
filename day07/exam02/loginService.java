package exam02;

public class loginService {

    private static loginService instance;
    private loginService(){}

    public static loginService getInstance(){
        if (instance ==null){
            instance = new loginService();
        }
        return instance;
    }


}
