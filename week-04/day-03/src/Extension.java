import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  public int add(int a, int b) {
    int sum = 0;
    sum = a + b;
    return sum;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > a && b > c) {
      return b;
    }
    return c;
  }

  public int median(List<Integer> pool) {
    Collections.sort(pool);
    int mid = pool.size() / 2;
    double result = ((double) pool.get(mid - 1) + (double) pool.get(mid)) / 2;
    if (pool.size() % 2 != 0) {
      return pool.get(mid);
    } else {
      return (int) result;
    }
  }

  public boolean isVowel(char c) {
    if (Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c)) {
      return true;
    }
    return false;
  }

  public String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
        System.out.println(teve);
      }
    }
    return teve;
  }
}

