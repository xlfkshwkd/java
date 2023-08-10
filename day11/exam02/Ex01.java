package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Login servie=new Login();
        try {
            servie.login("user02", "12345");
            //메서드 내부ㅡ에서 예외처리가 완료
            //아이디 비밀번호가 다를떄 후속처리를 이코드에서는 불가
        }catch (UserIDInconntent e){
            System.out.println(e.getMessage());
        }
        catch (UserPWInconncent e){
            System.out.println(e.getMessage());
        }



    }
}
