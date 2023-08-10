package exam02;

public class Login {
    public void login(String userID,String userPW)/* throws UserPWInconncent,
            UserIDInconntent*/
    {
            //호출한쪽에서 예외처리를할수있도록 전가시킴
        try{
        // id user01 pw 123456
            if (!userID.equals("user01")){
            throw new UserIDInconntent("가입된 아이디가 아닙니다.");
            }
            if (!userPW.equals("123456")){
                throw new UserPWInconncent("비번이 일치하지않습니다.");
            }

        }catch(UserIDInconntent | UserPWInconncent e){
            e.printStackTrace();
        }
    }
}
