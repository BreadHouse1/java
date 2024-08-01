package Edu;

import java.util.Scanner;

public class BaseBall {
    public static void main(String[] args) {
        String Player1Input = "";
        String Player2Input = "";
        int counter = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 유저 입니다.");
        System.out.println(",를 사용해 0~9까지의 숫자를 4개 입력해주세요.");
        Player1Input = sc.nextLine();

        String[] Player1InputSave = Player1Input.trim().split(",");

//        System.out.println("형식에 맞지 않습니다.");



//        Pattern pattern = Pattern.compile("[0-9]");
//        Matcher matcher = pattern.matcher(Player1InputSave[i]);

        System.out.println("형식에 맞지 않습니다.");
        System.out.println(",를 사용해 0~9까지의 숫자를 4개 입력해주세요.");


        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }

        System.out.println("두번째 유저 입니다.");
        System.out.println(",를 사용해 0~9까지의 숫자를 4개 입력해주세요.");
        Player2Input = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }

        String[] Player2InputSave = Player2Input.trim().split(",");

        for (int i = 0; i < 8; i++) {
            StringBuilder Text = new StringBuilder();  // 각 라운드마다 새로운 Text 생성

            if (counter == 1) {
                System.out.println("첫번째 유저가 맞출 차례입니다.");
                System.out.println(",를 사용해 0~9사이 숫자 4개를 입력해주세요");
                String Player1 = sc.nextLine();
                String[] Player1Check = Player1.trim().split(",");

                for(int j = 0; j < Player2InputSave.length; j++) {
                    boolean found = false;
                    for(int k = 0; k < Player1Check.length; k++) {
                        if(Player2InputSave[k].equals(Player1Check[j])) {
                            if(j == k) {
                                Text.append("strike ");
                            } else {
                                Text.append("ball ");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        Text.append("out ");
                    }
                }
                if (Text.toString().contains("strike strike strike strike")) {
                    System.out.println(Text.toString());
                    System.out.println("첫번째 유저가 승리했습니다!");
                    System.exit(0); // 프로그램 종료
                }
                System.out.println(Text.toString());
                Text  = null;
                counter = 0;
            }

            if (counter == 0) {
                Text = new StringBuilder();
                System.out.println("두번째 유저가 맞출 차례입니다.");
                System.out.println(",를 사용해 0~9사이 숫자 4개를 입력해주세요");
                String Player2 = sc.nextLine();
                String[] Player2Check = Player2.trim().split(",");

                for(int o = 0; o < Player1InputSave.length; o++) {
                    boolean found2 = false;
                    for(int p = 0; p < Player2Check.length; p++) {
                        if(Player1InputSave[p].equals(Player2Check[o])) {
                            if(o == p) {
                                Text.append("strike ");
                            } else {
                                Text.append("ball ");
                            }
                            found2 = true;
                            break;
                        }
                    }
                    if (!found2) {
                        Text.append("out ");
                    }
                }
                if (Text.toString().contains("strike strike strike strike")) {
                    System.out.println(Text.toString());
                    System.out.println("두번째 유저가 승리했습니다!");
                    System.exit(0); // 프로그램 종료
                }
                System.out.println(Text.toString());
                Text  = null;
                counter = 1;
            }
        }
    }
}
