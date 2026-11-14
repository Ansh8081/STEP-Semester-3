package session11.assignment;
public class LibraryBookShelf {
    static void shelf(int[] books){
        for(int i=1;i<books.length;i++){
            System.out.print("After placing "+books[i]+": [");
            for(int j=0;j<i;j++){
                if(books[j]>books[i]){
                    books[i]+=books[j];
                    books[j]=books[i]-books[j];
                    books[i]-=books[j];
                }
            }
            for(int q:books)
                System.out.print(q+", ");
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        int[] books = {30, 10, 40, 20};
        shelf(books);
    }
}
