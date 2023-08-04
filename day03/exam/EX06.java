package exam;

public class EX06 {
    public static void main(String[] args) {
        int totalStudents = 40;
        int totalRooms = 10;
        int studentsPerRoom = 4;

        for (int roomNumber = 0; roomNumber < totalRooms; roomNumber++) {
            System.out.println("방번호 " + roomNumber + "번에 배정된 학생들:");

            for (int studentNumber = 1; studentNumber <= studentsPerRoom; studentNumber++) {
                int studentId = (roomNumber * studentsPerRoom) + studentNumber;
                if (studentId <= totalStudents) {
                    System.out.println("학생" + studentId + ", 방번호 " + roomNumber + "번");
                }
            }

            System.out.println();
    }
}}

