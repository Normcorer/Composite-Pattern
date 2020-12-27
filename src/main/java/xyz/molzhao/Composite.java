package xyz.molzhao;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器：容器对象，定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除(remove)等
 */
public class Composite implements ICounter {
    private List<ICounter> container = new ArrayList<>();

    public boolean add(ICounter counter) {
        return container.add(counter);
    }

    public boolean remove(ICounter counter) {
        return container.remove(counter);
    }

    public List<ICounter> getChild() {
        return container;
    }

    @Override
    public int count() {
        return container.stream().mapToInt(ICounter::count).sum();
    }
}
