import java.util.List;

public interface ManagerI {
    void add(ContentI item);
    List<ContentI> getAll();
    void mediaUpdate(ContentI item);
}
