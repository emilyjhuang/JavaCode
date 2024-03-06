import java.util.Scanner;

public class Library {
        private String name;
        private int foundationYear;
        private int numberOfBooks;
        private Book[] books;

        public Library(String name, int numberOfBooks, int foundationYear) {
            this.name = name;
            this.foundationYear = foundationYear;
            this.numberOfBooks = numberOfBooks;
            setLibraryBooks(numberOfBooks);
        }

        private void setLibraryBooks(int numberOfBooks) {
            books = new Book[numberOfBooks];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.println("Enter information for book " + (i+1) + ":");
                System.out.print("Name: ");
                String name = input.nextLine();
                System.out.print("Publication Year: ");
                int publicationYear = input.nextInt();
                System.out.print("Number of Authors: ");
                int numberOfAuthors = input.nextInt();
                input.nextLine(); // consume newline character
                Book book = new Book(name, publicationYear, numberOfAuthors);
                book.setMyAuthors(numberOfAuthors);
                books[i] = book;
            }
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFoundationYear() {
            return foundationYear;
        }

        public void setFoundationYear(int foundationYear) {
            this.foundationYear = foundationYear;
        }

        public int getNumberOfBooks() {
            return numberOfBooks;
        }

        public void setNumberOfBooks(int numberOfBooks) {
            this.numberOfBooks = numberOfBooks;
        }

        public Book[] getBooks() {
            return books;
        }

        public void setBooks(Book[] books) {
            this.books = books;
        }
    }

class Book {
        private String name;
        private int publicationYear;
        private int numberOfAuthors;
        private String[] authorList;

        public Book(String name, int publicationYear, int numberOfAuthors) {
            this.name = name;
            this.publicationYear = publicationYear;
            this.numberOfAuthors = numberOfAuthors;
            setMyAuthors(numberOfAuthors);
        }

        public void setMyAuthors(int numberOfAuthors) {
            authorList = new String[numberOfAuthors];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numberOfAuthors; i++) {
                System.out.print("Author " + (i+1) + ": ");
                String author = input.nextLine();
                authorList[i] = author;
            }
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPublicationYear() {
            return publicationYear;
        }

        public void setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
        }

        public int getNumberOfAuthors() {
            return numberOfAuthors;
        }

        public void setNumberOfAuthors(int numberOfAuthors) {
            this.numberOfAuthors = numberOfAuthors;
        }

        public String[] getAuthorList() {
            return authorList;
        }

        public void setAuthorList(String[] authorList) {
            this.authorList = authorList;
        }
    }