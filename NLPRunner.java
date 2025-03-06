import java.util.Scanner;

public class NLPRunner {
  public static void main(String[] args) {

    MyNLP bob = new MyNLP();

    Scanner in = new Scanner(System.in);
    
    System.out.println(bob.pdemo(FileReader.toStringList("demo.txt")));
    String us = in.nextLine();

    MyNLP x = new MyNLP(us);
    System.out.println(x.output());
    
    in.close();
  }
}