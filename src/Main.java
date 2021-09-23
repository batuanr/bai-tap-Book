public class Main {
    public static void main(String[] args) {
        Book book1 = new ProgrammingBook(1,"name1",
                150, "TG1", "PHP", "net");

        Book book2 = new ProgrammingBook(2,"name2",
                250, "TG2", "java", "not.js");

        Book book3 = new ProgrammingBook(3,"name3",
                100, "TG3", "java", "ok");

        Book book4 = new ProgrammingBook(4,"name4",
                270, "TG4", "python", "net.java");

        Book book5 = new ProgrammingBook(5,"name5",
                350, "TG5", "java", "angular");

        Book book6 = new FictionBook(6, "name6",
                110, "TG6", "vien tuong" );

        Book book7 = new FictionBook(7, "name7",
                210, "TG7", "vien tuong" );

        Book book8 = new FictionBook(8, "name8",
                310, "TG8", "vien tuong" );

        Book book9 = new FictionBook(9, "name9",
                410, "TG9", "vien tuong" );

        Book book10 = new FictionBook(10, "name10",
                510, "TG10", "vien tuong" );
        Book listBook[] = {
                book1, book2, book3, book4, book5,
                book6, book7, book8, book9, book10
        };
        System.out.println(getTotal(listBook));
        System.out.println(getBookJava(listBook));
    }
    public static int getTotal(Book[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].getPrice();
        }
        return total;
    }
    public static int getBookJava(Book[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof ProgrammingBook) {
               if (((ProgrammingBook) arr[i]).getLanguage().equals("java")) {
                   count++;
               }
            }
        }
        return count;
    }
}
