package treinamentos-code-wars;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] split = sentence.split(" ");
        for (int i = 0; split.length >= i; i++) {
          if (split[i].length() > 4) {
              StringBuilder stringBuilder = new StringBuilder(split[i]);
              split[i] = stringBuilder.reverse().toString();
          }
        }
  
        return split.toString();
      }
  }