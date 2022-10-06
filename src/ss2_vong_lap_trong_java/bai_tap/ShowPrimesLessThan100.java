package ss2_vong_lap_trong_java.bai_tap;

public class ShowPrimesLessThan100 {
    public static void main(String[] args) {
        int count = 0;
        int prime = 2;
        while (count < 100) {
            boolean check = true;
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check && prime < 100) {
                count++;
                System.out.println(prime);
            }
            prime++;

        }
    }
}
