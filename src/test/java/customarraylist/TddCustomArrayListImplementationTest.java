package customarraylist;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TddCustomArrayListImplementationTest {

    @Test
    void implementList(){
        List<String> list =new TddArrayList<>();
    }

    @Test
    void emptyListHasSizeZero(){
         List<String> list =new TddArrayList<>();

         assertThat(list).hasSize(0);
     }

    @Test
    void listWithOneElementHasSizeOne(){
        List<String> list =new TddArrayList<>();
        list.add(RandomStringUtils.random(10));
        assertThat(list).hasSize(1);
    }

}
