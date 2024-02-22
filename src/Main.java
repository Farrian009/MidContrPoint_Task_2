import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Raffle raf = new Raffle();

        raf.addToy("1 Lego 2");
        raf.addToy("2 Robot 2");
        raf.addToy("3 Doll 6");

        raf.getToy(10, "results.txt");


        }

    }
