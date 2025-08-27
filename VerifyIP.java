import java.util.Scanner;

public class VerifyIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        scanner.close();

        if (validarIP(ip)) {
            System.out.println("ip valido");
        } else {
            System.out.println("ip invalido");
        }
    }

    // Método para validar um endereço IP
    public static boolean validarIP(String ip) {
        String[] segments = ip.split("\\.");

        if (segments.length != 4) {
            return false;
        }

        for (String segment : segments) {
            if (!isValidNumber(segment)) { 
                return false;
            }
        }

        return true;
    }

    // Método auxiliar para verificar se uma string representa um número válido entre 0 e 255
    private static boolean isValidNumber(String str) {
        try {
            int num = Integer.parseInt(str);
            return num >= 0 && num <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}