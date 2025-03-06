import java.util.ArrayList;

public class MyNLP {
  //instance variables
  
  private ArrayList<String> input;
  private ArrayList<String> output;

  //no argument constructor
  public MyNLP() {
    input = new ArrayList<String>();
  }

  //parameterized constructor
  public MyNLP(String input) {
    this.input = toW(input);
    output = translate(this.input);
  }

  /*
  * gets input variable
  * @return input variable
  */
  public ArrayList<String> getInput() {
    return input;
  }

  /*
  * gets output variable
  * @return output variable
  */
  public ArrayList<String> getOutput() {
    return output;
  }

  /*
  * Gets a sentence string and gets each word
  * @param input string
  * @return ArrayList with each word in string
  */
  public ArrayList<String> toW(String input) {
    ArrayList<String> temp = new ArrayList<String>();
    
    int s = input.indexOf(" ");
    while(s == 0) {
      input = input.substring(1);
      s = input.indexOf(" ");
    }
    
    while(s != -1) {
      String first = input.substring(0, s);
      temp.add(first);
      input = input.substring(s+1);
      s = input.indexOf(" ");
      
      while(s == 0) {
        input = input.substring(1);
         s = input.indexOf(" ");
      }
      
    }
    temp.add(input.substring(0));
    return(temp);
  }
  
  /*
  * translates the given array of words
  * If starts with vowel - add "yay"
  * If not, take word - first letter and add it to the end, then add "ay"
  * It also checks for punctation
  * @param Input of ArrayList of Strings
  * @return New ArrayList with translated words
  */
  public ArrayList<String> translate(ArrayList<String> temp) {
    ArrayList<String> out = new ArrayList<String>();

    String[] vowels = {"a", "e", "i", "o", "u"};
    
    for(int i = 0; i < temp.size(); i++) {
      String word = temp.get(i);
      String let = temp.get(i).substring(0, 1);
      boolean v = false;
      
      for(int j = 0; j < vowels.length; j++) {
        if(let.toLowerCase().equals(vowels[j])) {
          v = true;
        }
      }

      if(v == true) {
        if(pcheck(word) == true) {
          out.add(word.toLowerCase() + "yay" + word.substring(word.length()-1));
        } else {
          out.add(word.toLowerCase() + "yay");
        }
        
      } else {
        
        if(pcheck(word) == true) {
          String t = word.substring(1, word.length()-1);
          t += let.toLowerCase();
          t += "ay";
          t += word.substring(word.length()-1);
          out.add(t);
          
        } else {
          String t = word.substring(1);
          t += let.toLowerCase();
          t += "ay";
          out.add(t);
        }
        
      }
    }
    return out;
  }

  /*
  * Checks for punctuation at the end of a word
  * @param word to be checked
  * @return true if has punctation, false if not
  */
  public boolean pcheck(String w) {
    String[] temp = {";", ",", ".", "?", "!"};

    for(int i = 0; i < temp.length; i++) {
      if(w.substring(w.length()-1).equals(temp[i])) {
        return true;
      }
    }
    return false;
  }
  
  /*
  * Gets before and after to be returned to Scanner
  * @return String with Before and After words
  */
  public String output() {
    String in = "";
    String ou = "";
    for(String i : getInput()) {
      in += i + " ";
    }

    for(String j : getOutput()) {
      ou += j + " ";
    }
    return "Before: " + in + "\nAfter: " + ou;
  }

  /*
  * Prints the demo
  * @param Demo ArrayList of strings
  * @return String with the translated demo with the original text in ()
  */
  public String pdemo(ArrayList<String> dlist) {
    ArrayList<String> demo = dlist;
    
    ArrayList<String> one = toW(demo.get(0));
    ArrayList<String> two = toW(demo.get(1));
    
    ArrayList<String> newone = translate(one);
    ArrayList<String> newtwo = translate(two);

    String o = "";
    String t = "";
    for(int i = 0; i < newone.size(); i++) {
      o += newone.get(i) + " ";
    }

    for(int j = 0; j < newtwo.size(); j++) {
      t += newtwo.get(j) + " ";
    }
    return o + "(" + demo.get(0) + ")" + "\n" + t + "(" + demo.get(1) + ")";
  }
  
}