import java.util.Random;
import java.util.Scanner;

public class ANSIShowcase {
    // Basic ANSI codes
    public static final String RESET = "\033[0m";
    public static final String CLEAR = "\033[2J";
    public static final String HOME = "\033[H";

    // Text styles
    public static final String BOLD = "\033[1m";
    public static final String DIM = "\033[2m";
    public static final String ITALIC = "\033[3m";
    public static final String UNDERLINE = "\033[4m";
    public static final String BLINK = "\033[5m";
    public static final String REVERSE = "\033[7m";
    public static final String STRIKETHROUGH = "\033[9m";

    // Colors
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String MAGENTA = "\033[35m";
    public static final String CYAN = "\033[36m";
    public static final String WHITE = "\033[37m";

    // Background colors
    public static final String BG_RED = "\033[41m";
    public static final String BG_GREEN = "\033[42m";
    public static final String BG_BLUE = "\033[44m";

    // 256 color examples
    public static final String BRIGHT_ORANGE = "\033[38;5;208m";
    public static final String NEON_GREEN = "\033[38;5;46m";
    public static final String HOT_PINK = "\033[38;5;198m";
    public static final String ELECTRIC_BLUE = "\033[38;5;33m";

    // RGB colors (24-bit)
    public static final String RGB_PURPLE = "\033[38;2;128;0;128m";
    public static final String RGB_GOLD = "\033[38;2;255;215;0m";

    // Cursor movement
    public static final String MOVE_UP = "\033[1A";
    public static final String MOVE_DOWN = "\033[1B";
    public static final String MOVE_RIGHT = "\033[1C";
    public static final String MOVE_LEFT = "\033[1D";
    public static final String SAVE_CURSOR = "\033[s";
    public static final String RESTORE_CURSOR = "\033[u";

    public static void main(String[] args) {
        ANSIShowcase demo = new ANSIShowcase();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            demo.showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": demo.progressBar(); break;
                case "2": demo.coloredMatrix(); break;
                case "3": demo.textEffects(); break;
                case "4": demo.animatedBanner(); break;
                case "5": demo.gameBoard(); break;
                case "6": demo.rainbowText(); break;
                case "7": demo.terminalDashboard(); break;
                case "8": demo.fireworks(); break;
                case "0":
                    System.out.println(RESET + "Goodbye!");
                    return;
                default:
                    System.out.println(RED + "Invalid choice!" + RESET);
            }

            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            scanner.close();
        }
    }

    void showMenu() {
        System.out.print(CLEAR + HOME);
        System.out.println(BOLD + CYAN + "╔═══════════════════════════════════╗" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + "        " + BOLD + "ANSI Demo Menu" + RESET + "           " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "╠═══════════════════════════════════╣" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 1. Animated Progress Bar       " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 2. Colored Matrix Effect       " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 3. Text Style Showcase         " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 4. Animated Banner             " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 5. Interactive Game Board      " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 6. Rainbow Text Effect         " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 7. Terminal Dashboard          " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 8. ASCII Fireworks             " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " 0. Exit                        " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "╚═══════════════════════════════════╝" + RESET);
        System.out.print(BOLD + "Choose an option: " + RESET);
    }

    void progressBar() {
        System.out.print(CLEAR + HOME);
        System.out.println(BOLD + "Animated Progress Bar Demo" + RESET + "\n");

        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + BOLD + "Loading: [");

            // Progress bar with gradient colors
            for (int j = 0; j < 50; j++) {
                if (j < i / 2) {
                    if (j < 17) System.out.print(RED + "█");
                    else if (j < 34) System.out.print(YELLOW + "█");
                    else System.out.print(GREEN + "█");
                } else {
                    System.out.print(DIM + "░");
                }
            }

            System.out.print(RESET + "] " + i + "%");

            try { Thread.sleep(50); } catch (InterruptedException e) {}
        }
        System.out.println("\n" + GREEN + BOLD + "Complete!" + RESET);
    }

    void coloredMatrix() {
        System.out.print(CLEAR + HOME);
        Random rand = new Random();
        String[] colors = {GREEN, NEON_GREEN, CYAN, WHITE};

        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 80; col++) {
                String color = colors[rand.nextInt(colors.length)];
                char ch = (char) (rand.nextInt(94) + 33); // Random printable ASCII
                System.out.print(color + ch);
            }
            System.out.println(RESET);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }

    void textEffects() {
        System.out.print(CLEAR + HOME);
        System.out.println(BOLD + UNDERLINE + "Text Style Showcase" + RESET + "\n");

        System.out.println(BOLD + "Bold Text" + RESET);
        System.out.println(ITALIC + "Italic Text" + RESET);
        System.out.println(UNDERLINE + "Underlined Text" + RESET);
        System.out.println(STRIKETHROUGH + "Strikethrough Text" + RESET);
        System.out.println(REVERSE + "Reversed Text" + RESET);
        System.out.println(BLINK + "Blinking Text" + RESET);
        System.out.println(DIM + "Dimmed Text" + RESET);

        System.out.println("\n" + BOLD + "Color Combinations:" + RESET);
        System.out.println(BG_RED + WHITE + BOLD + " Error Message " + RESET);
        System.out.println(BG_GREEN + WHITE + BOLD + " Success Message " + RESET);
        System.out.println(BG_BLUE + YELLOW + BOLD + " Info Message " + RESET);

        System.out.println("\n" + BOLD + "RGB Colors:" + RESET);
        System.out.println(RGB_PURPLE + "Custom Purple" + RESET);
        System.out.println(RGB_GOLD + "Custom Gold" + RESET);
    }

    void animatedBanner() {
        System.out.print(CLEAR + HOME);
        String[] frames = {
            "  ╔══════════════════╗",
            "  ║  ANSI TERMINAL   ║",
            "  ║    SHOWCASE      ║",
            "  ╚══════════════════╝"
        };

        String[] colors = {RED, YELLOW, GREEN, CYAN, BLUE, MAGENTA};

        for (int cycle = 0; cycle < 10; cycle++) {
            System.out.print(HOME);
            String color = colors[cycle % colors.length];
            for (String line : frames) {
                System.out.println(BOLD + color + line + RESET);
            }
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }

    void gameBoard() {
        System.out.print(CLEAR + HOME);
        System.out.println(BOLD + "Interactive Tic-Tac-Toe Game" + RESET + "\n");

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        Scanner gameScanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameActive = true;
        int moves = 0;

        while (gameActive && moves < 9) {
            // Display the board
            displayBoard(board);

            // Get player input
            System.out.println("\n" + BOLD + "Player " +
                (currentPlayer == 'X' ? RED + "X" : BLUE + "O") +
                RESET + BOLD + "'s turn" + RESET);
            System.out.print("Enter row (1-3): ");
            int row = gameScanner.nextInt() - 1;
            System.out.print("Enter column (1-3): ");
            int col = gameScanner.nextInt() - 1;

            // Validate move
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                System.out.println(RED + "Invalid move! Try again." + RESET);
                continue;
            }

            // Make the move
            board[row][col] = currentPlayer;
            moves++;

            // Check for winner
            if (checkWinner(board, currentPlayer)) {
                displayBoard(board);
                System.out.println("\n" + BOLD + GREEN + "🎉 Player " + currentPlayer + " wins! 🎉" + RESET);
                gameActive = false;
            } else if (moves == 9) {
                displayBoard(board);
                System.out.println("\n" + BOLD + YELLOW + "It's a tie! 🤝" + RESET);
                gameActive = false;
            } else {
                // Switch players
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        gameScanner.close();
    }

    void displayBoard(char[][] board) {
        System.out.print(CLEAR + HOME);
        System.out.println(BOLD + "Interactive Tic-Tac-Toe Game" + RESET + "\n");
        System.out.println("    1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print("│ ");
                if (board[i][j] == 'X') {
                    System.out.print(RED + BOLD + "X" + RESET);
                } else if (board[i][j] == 'O') {
                    System.out.print(BLUE + BOLD + "O" + RESET);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("│");
            if (i < 2) System.out.println("  ├───┼───┼───┤");
        }
    }

    boolean checkWinner(char[][] board, char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    void rainbowText() {
        System.out.print(CLEAR + HOME);
        String text = "RAINBOW EFFECT!";
        String[] rainbowColors = {
            "\033[38;5;196m", // Red
            "\033[38;5;208m", // Orange
            "\033[38;5;226m", // Yellow
            "\033[38;5;46m",  // Green
            "\033[38;5;21m",  // Blue
            "\033[38;5;93m",  // Indigo
            "\033[38;5;201m"  // Violet
        };

        for (int wave = 0; wave < 20; wave++) {
            System.out.print("\r");
            for (int i = 0; i < text.length(); i++) {
                int colorIndex = (i + wave) % rainbowColors.length;
                System.out.print(rainbowColors[colorIndex] + BOLD + text.charAt(i));
            }
            System.out.print(RESET);
            try { Thread.sleep(150); } catch (InterruptedException e) {}
        }
        System.out.println();
    }

    void terminalDashboard() {
        System.out.print(CLEAR + HOME);
        System.out.println(BOLD + CYAN + "╔═════════════════════════════════════════════════════════════╗" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + "                    " + BOLD + "SYSTEM DASHBOARD" + RESET + "                    " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "╠═════════════════════════════════════════════════════════════╣" + RESET);

        // CPU Usage
        System.out.print(BOLD + CYAN + "║" + RESET + " CPU: ");
        for (int i = 0; i < 30; i++) {
            if (i < 18) System.out.print(GREEN + "█");
            else if (i < 24) System.out.print(YELLOW + "█");
            else System.out.print(RED + "█");
        }
        System.out.println(RESET + " 60%                    " + BOLD + CYAN + "║" + RESET);

        // Memory Usage
        System.out.print(BOLD + CYAN + "║" + RESET + " RAM: ");
        for (int i = 0; i < 30; i++) {
            if (i < 22) System.out.print(GREEN + "█");
            else System.out.print(DIM + "░");
        }
        System.out.println(RESET + " 73%                    " + BOLD + CYAN + "║" + RESET);

        // Disk Usage
        System.out.print(BOLD + CYAN + "║" + RESET + " HDD: ");
        for (int i = 0; i < 30; i++) {
            if (i < 8) System.out.print(GREEN + "█");
            else System.out.print(DIM + "░");
        }
        System.out.println(RESET + " 27%                    " + BOLD + CYAN + "║" + RESET);

        System.out.println(BOLD + CYAN + "╠═════════════════════════════════════════════════════════════╣" + RESET);
        System.out.println(BOLD + CYAN + "║" + RESET + " Status: " + GREEN + BOLD + "●" + RESET + " Online  " +
                          YELLOW + "⚠" + RESET + " 3 Warnings  " +
                          RED + "✗" + RESET + " 0 Errors            " + BOLD + CYAN + "║" + RESET);
        System.out.println(BOLD + CYAN + "╚═════════════════════════════════════════════════════════════╝" + RESET);
    }

    void fireworks() {
        System.out.print(CLEAR + HOME);
        Random rand = new Random();
        String[] fireworkColors = {RED, YELLOW, GREEN, CYAN, MAGENTA, WHITE};

        for (int explosion = 0; explosion < 15; explosion++) {
            int centerX = rand.nextInt(60) + 10;
            int centerY = rand.nextInt(15) + 5;
            String color = fireworkColors[rand.nextInt(fireworkColors.length)];

            // Draw explosion pattern
            for (int radius = 1; radius <= 5; radius++) {
                System.out.print(SAVE_CURSOR);

                // Draw sparkles in a circle
                for (int angle = 0; angle < 360; angle += 45) {
                    double rad = Math.toRadians(angle);
                    int x = centerX + (int)(Math.cos(rad) * radius);
                    int y = centerY + (int)(Math.sin(rad) * radius);

                    if (x > 0 && x < 80 && y > 0 && y < 24) {
                        System.out.printf("\033[%d;%dH%s*", y, x, color);
                    }
                }

                System.out.print(RESTORE_CURSOR);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }

            // Fade out
            try { Thread.sleep(200); } catch (InterruptedException e) {}
            System.out.print(CLEAR + HOME);
        }

        System.out.println(BOLD + YELLOW + "✨ FIREWORKS COMPLETE! ✨" + RESET);
    }
}