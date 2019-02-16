

public class Authority {
    private int expectedInt;

    public Authority(int expectedInt){
        this.expectedInt = expectedInt;
    }

    public boolean happyAuthority(int receivedInt){
        if (this.expectedInt == receivedInt){
            return true;
        } else {
            return false;
        }
    }

    public int getExpectedInt() {
        return expectedInt;
    }

    public void setExpectedInt(int expectedInt) {
        this.expectedInt = expectedInt;
    }
}
