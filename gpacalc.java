import java.util.Scanner;

enum grades {
        A_ = 4.3,
        A = 4,
        Aminus = 3.7,
        B_ = 3.3,
        B = 3,
        Bminus = 2.7,
        C_ = 2.3,
        C = 2,
        Cminus = 1.7,
        D_ = 1.3,
        D = 1,
        Dminus = 0.7,
        F = 0
    }


public class Main {
    public static void main(String args) {
        int gradesAmount = 0;
        if (args.length > 1) gradesAmount = (int)args[1]; else gradesAmount = 7;// 7 is my current amount of important classes (as in not HD or strings or something classes)
        System.out.println("Please input the amount of credits your classes give in total. If you don't know, 28 is always a safe bet.");// 28 is 3 * 7 which is the default amount of classes
        System.out.printf(" >> ");
        Scanner scanner = new Scanner();
        int creds = (int)scanner.nextLine();
        int[] g = new int[gradesAmount];// g for 'grades'
        

    }

    public static void handleInput(int[] g, Scanner s) {
        String inp = s.nextLine();
        switch (inp) {
            
        }
    }    

    public static float figureItOut(int inp) {
        for (int i = 0; i < 13; i++) {// 13 'cause that's how many values i have in my enum
            if (inp >= 100 - (i * 3)) return (grades.values())[i];
        }
        return 0;
    }
}
