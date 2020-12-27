import org.junit.Test;
import xyz.molzhao.City;
import xyz.molzhao.Composite;

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
        System.out.println("中国总人数为：" + china.count());
        System.out.println("上海总人数为：" + shanghai.count());
        System.out.println("浙江总人数为：" + zheJiang.count());
        System.out.println("嘉兴总人数为：" + jiaxing.count());
    }
}
