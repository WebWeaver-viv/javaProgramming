import java.sql.*;
import java.util.Scanner;

public class LibraryManager {
    private static final String DB_URL = "jdbc:sqlite:library.db";

    public static void main(String[] args) {
        createTable();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n📚 Library Manager");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1 -> addBook(scanner);
                case 2 -> listBooks();
                case 3 -> deleteBook(scanner);
                case 4 -> {
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void createTable() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            String sql = """
                    CREATE TABLE IF NOT EXISTS books (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        title TEXT NOT NULL,
                        author TEXT NOT NULL,
                        year INTEGER
                    );
                    """;
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
    }

    private static void addBook(Scanner scanner) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            String sql = "INSERT INTO books (title, author, year) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, title);
                pstmt.setString(2, author);
                pstmt.setInt(3, year);
                pstmt.executeUpdate();
                System.out.println("✅ Book added successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }

    private static void listBooks() {
        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            System.out.println("\n📘 Book List:");
            while (rs.next()) {
                System.out.printf("ID: %d | Title: %s | Author: %s | Year: %d%n",
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("year"));
            }
        } catch (SQLException e) {
            System.out.println("Error listing books: " + e.getMessage());
        }
    }

    private static void deleteBook(Scanner scanner) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            System.out.print("Enter Book ID to delete: ");
            int id = scanner.nextInt();

            String sql = "DELETE FROM books WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, id);
                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("🗑️ Book deleted.");
                } else {
                    System.out.println("⚠️ Book ID not found.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error deleting book: " + e.getMessage());
        }
    }
}
