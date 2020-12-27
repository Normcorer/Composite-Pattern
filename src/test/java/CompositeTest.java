import org.junit.Test;
import xyz.molzhao.City;
import xyz.molzhao.Composite;

import static org.junit.Assert.assertEquals;

/**
 * 该案例实现一个统计的功能，主要统计整个中国的人口普查情况，需要各地方市统计好了，上报到各个省份，然后在上报给中央主要实现这样一个功能
 */
public class CompositeTest {
    @Test
    public void testCompositeTest() {
        Composite china = new Composite();
        // 新建浙江省容器
        Composite zheJiang = new Composite();
        // 嘉兴市统计完为1W人
        City jiaxing = new City(10000);
        City hangzhou = new City(20000);
        zheJiang.add(jiaxing);
        zheJiang.add(hangzhou);
        china.add(zheJiang);

        City shanghai = new City(30000);
        china.add(shanghai);

        /*
        这边组成了
        -中国
        ---浙江
        -----嘉兴
        -----杭州
        ---上海
        这样的一个数据结构
         */
        assertEquals(60000, china.count());
        assertEquals(30000, shanghai.count());
        assertEquals(30000, zheJiang.count());
        assertEquals(10000, jiaxing.count());
    }
}
