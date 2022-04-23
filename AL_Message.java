public class Al_Message {
    private  Integer boolNum;
    private String boolName;
    private String boolLocation;
    private String boolHeight;
    private  Integer boolNameNum;

    public Al_Message() {
    }

    public Al_Message(Integer boolNum, String boolName, String boolLocation, String boolHeight, Integer boolNameNum) {
        this.boolNum = boolNum;
        this.boolName = boolName;
        this.boolLocation = boolLocation;
        this.boolHeight = boolHeight;
        this.boolNameNum = boolNameNum;
    }

    public Integer getBoolNum() {
        return boolNum;
    }

    public void setBoolNum(Integer boolNum) {
        this.boolNum = boolNum;
    }

    public String getBoolName() {
        return boolName;
    }

    public void setBoolName(String boolName) {
        this.boolName = boolName;
    }

    public String getBoolLocation() {
        return boolLocation;
    }

    public void setBoolLocation(String boolLocation) {
        this.boolLocation = boolLocation;
    }

    public String getBoolHeight() {
        return boolHeight;
    }

    public void setBoolHeight(String boolHeight) {
        this.boolHeight = boolHeight;
    }

    public Integer getBoolNameNum() {
        return boolNameNum;
    }

    public void setBoolNameNum(Integer boolNameNum) {
        this.boolNameNum = boolNameNum;
    }

    @Override
    public String toString() {
        return
                "球员编号:" + boolNum +
                ";球员名称:" + boolName +
                ";位置:" + boolLocation +
                ";身高:" + boolHeight +
                ";球衣号码:" + boolNameNum
                ;
    }
}
