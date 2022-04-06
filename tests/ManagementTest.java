import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagementTest {

    @Test
    public void testGetElement(){
        ManagerI ManagementObj = new ManagerImpl();
        ContentI MediafileObj = new ContentImpl();
        ManagementObj.add(MediafileObj);
        Assertions.assertEquals(ManagementObj.getAll().get(0), MediafileObj);
    }

    @Test
    public void testGetElements(){
        ManagerI ManagementObj = new ManagerImpl();
        ContentI MediafileObj1 = new ContentImpl();
        ContentI MediafileObj2 = new ContentImpl();
        ManagementObj.add(MediafileObj1);
        ManagementObj.add(MediafileObj2);
        Assertions.assertEquals(ManagementObj.getAll().get(1), MediafileObj2);
        Assertions.assertEquals(ManagementObj.getAll().get(0), MediafileObj1);
    }

    @Test
    public void testSize(){
        ManagerI ManagementObj = new ManagerImpl();
        ContentI MediafileObj1 = new ContentImpl();
        ContentI MediafileObj2 = new ContentImpl();
        ManagementObj.add(MediafileObj1);
        ManagementObj.add(MediafileObj2);
        Assertions.assertEquals(ManagementObj.getAll().size(), 2);
    }

    @Test
    public void testAccessCounter(){
        ManagerI ManagementObj = new ManagerImpl();
        ContentI MediafileObj1 = new ContentImpl();
        ManagementObj.add(MediafileObj1);
        ManagementObj.updateMedia(ManagementObj.getAll().get(0));
        ManagementObj.updateMedia(ManagementObj.getAll().get(0));
        Assertions.assertEquals(ManagementObj.getAll().get(0).getAccessCounter(), 2);
    }

    @Test
    public void testDeleetElement(){
        ManagerI ManagementObj = new ManagerImpl();
        ContentI MediafileObj1 = new ContentImpl();
        ContentI MediafileObj2 = new ContentImpl();
        ManagementObj.add(MediafileObj1);
        ManagementObj.add(MediafileObj2);
        ManagementObj.deleteMedia(MediafileObj2);
        Assertions.assertEquals(ManagementObj.getAll().size(), 1);
    }


}
