package xyz.molzhao;

/**
 * 叶子节点: 叶子节点。叶子节点没有子节点。
 */
public class City implements ICounter {

    private Integer sum;

    public City(Integer sum) {
        this.sum = sum;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public int count() {
        return sum;
    }
}
