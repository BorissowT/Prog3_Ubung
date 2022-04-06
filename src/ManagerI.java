import java.util.List;

public interface ManagerI {
    void add(ContentI item);
    List<ContentI> getAll();
    void updateMedia(ContentI item);
    void deleteMedia(ContentI item);
}
