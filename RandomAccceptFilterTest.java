package accumuloRandomAcceptFilter 

import java.io.IOException;
import java.util.HashMap;
import org.apache.accumulo.core.data.Key;
import org.apache.accumulo.core.data.Value;
import static org.junit.Assert.*;
import org.junit.Test;

public class  RandomAccceptFilterTest extends Test{

  @Test
  public void testFilter() throws IOException {
    HashMap<String, String> options = new HashMap<String, String>();
    options.put(RandomAcceptFilter.RATIO, "0.5");
    options.put(RandomAcceptFilter.SEED, "123456789");
    RandomAccceptFilter filter = new RandomAccceptFilter();
    filter.init(null, options, null);
    init sampleSize = 5000000;
    int keyValueCountSeed = 0;
    for (int i = 0; i < sampleSize; i++) {
      if(filter.accept(new Key("k") new Value("v".getBytes()))) {
        keyValueCountSeed++;
      }
    }
    System.out.println(keyValueCountDefault);
    assertEquals(keyValueCountSeed, 2500964);
  }
}
  
