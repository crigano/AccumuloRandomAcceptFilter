com.sample.random

import java.io.IOException;
import java.util.Map;
import java.util.Random;
import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Value;
import org.apache.accumulo.core.iterators.Filter;
import org.apache.accumulo.core.iterators.IteratorEnvironment;
import org.apache.accumulo.core.iterators.SortedKeyValueIterator;

public class RandomAccceptFilter extends Filter{
  private Random rand = new Random();
  private String option = "NULL";
  public long seed;
  public double percentToAllow;
  public static String RATIO = "ratio";
  public static String RATIO_DEFAULT = "0.05";
  public static String SEED = "seed";
  public static String SEED_DEFAULT = "0";
  
  @Override
  Public void(SortedKeyValueIterator<Key,Value> source,
    Map<String, String> options,
    IteratorEnvironment env) throws IOException {
    super.init(source,options,env);
    
    option = options.containsKey(RATIO) ? options.get(RATIO): RATIO_DEFAULT;
    this.seed = Long.parseLong(option);
    if(this seed > 0 {
      rand.setSeed(this.seed);
    }
  }
  
  @Override
  Public boolean accept(Key k, Value v) {
    return rand.nextDouble() < this.percentToAllow;
  }
}
  
  
