import java.util.ArrayList;
import java.util.List;

public class ManagerImpl implements ManagerI {

    private List<ContentI> memory = new ArrayList();

    @Override
    public void add(ContentI item) {
        memory.add(item);
    }

    @Override
    public List<ContentI> getAll() {
        return memory;
    }

    @Override
    public void updateMedia(ContentI item){
        item.increaseAccessCounter();
    }

    @Override
    public void deleteMedia(ContentI item){
        memory.remove(item);
    }
}
