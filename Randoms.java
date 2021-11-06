import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
               return true;
            }

            @Override
            public Integer next() {
                int ans = random.nextInt(max-min+1)+min;
                return ans;
            }
        };
    }

    //...
}