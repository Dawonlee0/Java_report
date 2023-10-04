package jv_02;

class Student {
    long studentID;
    String name;
    String major;
    long phoneNumber;

    // 입력 받은 전화번호를 형식에 맞게 변환해주는 메서드
    String getFormattedPhoneNumber() {
        String strNum = Long.toString(phoneNumber);
        return "010-" + strNum.substring(0, 4) + "-" + strNum.substring(4);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            students[i].studentID = sc.nextLong();
            students[i].name = sc.next();
            students[i].major = sc.next();
            students[i].phoneNumber = sc.nextLong();
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 학생: " + students[i].studentID + " " + students[i].name + " " + students[i].major + " " + students[i].getFormattedPhoneNumber());
        }
        sc.close();
    }
}
