package _11_파일입출력;

import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> credentials = new HashMap<>();

        try {
            // db.txt 파일 읽기
            BufferedReader br = new BufferedReader(new FileReader("db.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.trim().split(" ");
                if (parts.length == 2) {
                    // ID와 비밀번호 쌍을 해시맵 저장
                    credentials.put(parts[0], parts[1]);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");
            String id = scanner.next().trim();

            if (!credentials.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String password = scanner.next().trim();

            if (credentials.get(id).equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
