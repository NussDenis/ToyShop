import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    ToyShop toyShop = new ToyShop();

    toyShop.addToy(new Toy(1, "Вертолёт", 0.3));
    toyShop.addToy(new Toy(2, "Кораблик", 0.1));
    toyShop.addToy(new Toy(3, "Конструктор", 0.2));
    toyShop.addToy(new Toy(4, "Юла", 0.3));
    toyShop.addToy(new Toy(5, "Машинка", 0.2));


    try {
      FileWriter writer = new FileWriter("ToyShop.txt");

      int counter = 0;
      int maxToys = 15;
      while (counter < maxToys) {
        Toy toy = toyShop.getRandomToy();

        if (toy != null) {
          counter++;
          writer.write(counter + ". " + "Выбрана игрушка: " + toy.getName() + " (Шанс выпадения" + " " + toy.getChance() +  "%" + ")\n");
        }
      }

      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}