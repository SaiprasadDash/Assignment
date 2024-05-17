import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ob = new StringBuilder();

        while (true) {
            System.out.println("***Menu*** \n 1) Add a substring at a specified position \n " +
                    "2) Remove a range of characters from the string.\n" +
                    "3) Modify a character at a specified index.\n" +
                    "4) Concatenate another string at the end.\n" +
                    "5) Exit");
            int ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.print("Insert string and Index: ");
                    ob.insert(sc.nextInt(), sc.next());
                    System.out.println("After insert:" + ob);
                    break;
                case 2:
                    System.out.print("Delete from Index1 to Index2: ");
                    ob.delete(sc.nextInt(), sc.nextInt());
                    System.out.println("After delete:" + ob);
                    break;
                case 3:
                    System.out.print("Enter index and character: ");
                    ob.setCharAt(sc.nextInt(), sc.next().charAt(0));
                    System.out.println("After modify:" + ob);
                    break;
                case 4:
                    System.out.print("Add string: ");
                    ob.append(sc.next());
                    System.out.println("After append:" + ob);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
