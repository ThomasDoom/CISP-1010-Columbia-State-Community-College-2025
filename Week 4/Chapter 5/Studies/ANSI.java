public class ANSI {
    public static void main(String[] args) {
        System.out.printf("\033[%d;%dm%s\033[0m%s", 2, 1, "hello");
        System.out.printf("\033[2;37;41m%s\033[0m%n", "Hello world!");
        System.out.printf("\033[A\r\033[K\033[1;32mopened \033[1;4;34m%s\033[0;1;32m in your browser.\033[0m\n" + //
                        "", "Opera");
        System.out.printf("\033[38;2;255;255;0mH\033[0;1;3;35me\033[95ml\033[42ml\033[0;41mo\033[0m");
    }
}
