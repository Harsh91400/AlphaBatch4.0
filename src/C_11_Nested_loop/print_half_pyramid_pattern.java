package C_11_Nested_loop;

public class print_half_pyramid_pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i+ " ");
        }
    }
}
