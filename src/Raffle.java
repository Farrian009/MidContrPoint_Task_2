import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Raffle {
    List<Toy> toys = new ArrayList<>();

    private PriorityQueue<Toy> toyQueue = new PriorityQueue<>(toys);

    public void addToy(String toyDes) {
        String [] toyToArr = toyDes.split(" ");
        toys.add(new Toy(Integer.parseInt(toyToArr[0]), toyToArr[1], Integer.parseInt(toyToArr[2])));
    }

    int[] toyID = new int[3];
    String[] toyName = new String[3];
    int[] toyFreq = new int[3];

    public void fillArr(){
        for (int i = 0; i < toys.size(); i++){
            Toy toy = toys.get(i);
            toyID[i] = toy.getToyID();
            toyName[i] = toy.getName();
            toyFreq[i] = toy.getFrequency();
        }
    }


    public void getToy(int times, String pathway){
        try (FileWriter file = new FileWriter(pathway)) {
            fillArr();
            int[] randomChoice;
            int sum = 0;
            for (int fr : toyFreq) {
                sum += fr;
            }
            randomChoice = new int[sum];
            int cursor = 0;

            for (int i = 0; i < toyFreq.length; i++){
                for (int j = 0; j < toyFreq[i]; j++){
                    randomChoice[cursor++] = toyID[i];
                }
            }

            for (int i = 0; i < times; i++) {
                int rand = (int) (Math.random() * (randomChoice.length - 1));

                file.write("Attempt " + (i +1) + ": Toy ID: " + randomChoice[rand] + "; Toy name: " + toyName[randomChoice[rand] - 1] + "\n");
                file.write("\n");
            }


        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }





    }

}
