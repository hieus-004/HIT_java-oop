package buoi4.btvn;

public class main {
    public static void main(String[] args) {
        Books[] Book = new Books[5];

        for (int i = 0; i < 5; i++){
            Book[i] = new Books();
        }

        for (int i = 0; i < 5; i++){
            Book[i].display(); 
        }
    }
}
