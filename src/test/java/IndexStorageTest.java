import org.junit.Before;
import org.junit.Test;
import ru.vtb.konkin.homework5.IndexStorage;

import static org.junit.Assert.assertEquals;

public class IndexStorageTest {
    private final int SIZE = 10;
    private IndexStorage indexStorage;

    @Before
    public void setUp() {
        indexStorage = new IndexStorage(SIZE);
    }

    @Test
    public void shouldReturnIndexForEvenAndNegativeIndexForOdd() {
        assertEquals("Should return index for even", indexStorage.get(2), 2);
        assertEquals("Should return negative index for odd", indexStorage.get(1), -1);
    }
    
    @Test 
    public void shouldReturnSize() {
        assertEquals("Should return size", indexStorage.size(), SIZE);
    }
    
    @Test 
    public void shouldReturnReverseArrayWithNegativeOdds() {
        assertEquals("Should return reverse array with negative odds", indexStorage.reverse()[0], -9);
    }
}
