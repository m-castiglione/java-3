package concurrency;

public class Main {
   
    public static void main(String[] args) {
         //run all of your threads from this main class.
        Thread reasoning = new Reasoning();
        reasoning.run();

        Thread team = new Thread(new TeamTC1());
        team.run();
    }
}