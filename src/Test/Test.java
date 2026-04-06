package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 52; i++) {
            if(i < 26){
                list.add((char)(i+97));
            }else{
                list.add((char)(i + 65 -26));
            }
        }

        while (true) {
            System.out.println("请输入单个英文字母，输入exit时退出");
            String letter = sc.nextLine();
            if(letter.equalsIgnoreCase("exit")){
                System.out.println("程序已退出");
                break;
            }
            if(letter.length() != 1){
                System.out.println("输入有误，请输入单个英文字母");
            }
            char c = letter.charAt(0);
            if(!((c >= 'a' && c <= 'z')||(c > 'A' && c < 'Z'))){
                System.out.println("输入有误，请输入单个英文字母");
            }
            for (int i = 0; i < list.size(); i++) {
                if(c == list.get(i)){
                    System.out.println("字母" + c + "在字母表中的位置为" + (i + 1));
                }
            }
        }
    }
}
