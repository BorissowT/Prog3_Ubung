public class ContentImpl implements ContentI {

    long accessCounter = 0;

    @Override
    public void increaseAccessCounter(){
        this.accessCounter++;
    }

    @Override
    public long getAccessCounter() {
        return accessCounter;
    }

}
