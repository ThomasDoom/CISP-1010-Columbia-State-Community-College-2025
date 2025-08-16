import java.util.Scanner;

public class ServerResponse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int code = keyboard.nextInt();
        boolean error = false;

        String result = ""; 
        switch (code) {
            case 200 -> result = "OK";
            case 400 -> result = "Bad Request";
            case 401 -> result = "Unauthorized";
            case 403 -> result = "Forbidden";
            case 404 -> result = "Not Found";
            default -> error = true;
        };

        if (!error) {
            System.out.print(result);
        }

        keyboard.close();
    }
}
