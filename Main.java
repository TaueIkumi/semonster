public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER GAME");
    System.out.println("Show draw monsters!");
    Monster[] monsters = new Monster[5];
    for (int i = 0; i < monsters.length; i++) {
      monsters[i] = new Monster();
      System.out.println(monsters[i]);
    }

  }
}
