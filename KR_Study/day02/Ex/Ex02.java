package Ex;

public class Ex02 {
    public static void main(String[] args) {

        /*
        학생 40명이 리조트에 수학여행을 갔습니다.
        리조트로 수학여행을 갔습니다.
         리조트는 방이 10개 있고 방번호는 0~9번까지 있습니다,
        40명의 학생이 각각 번호표를 받아 한 방에 4명씩 배정하여
        다음과 같이 출력하시오(예 : 학생1, 방번호 1번)
        */
         int room_num =0;
         int count=0;
         for (int student_num=1;student_num<=40;student_num++)
         {

             switch(room_num) {
                 case 1:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 2:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 3:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 4:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 5:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 6:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 7:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 8:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;
                 case 9:
                     System.out.println("방번호는 " + room_num +" 학생 번호는 " +student_num);
                     break;

                 default :
                     System.out.println("넌 낙오다 ");
             }
             count++;
              if(count%4==0) {
                  room_num++;
              }
              if(room_num ==10)
              {
                  room_num=1;
              }


         }


    }
}
