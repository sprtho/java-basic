package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("BigData.data=" + bigData.data);

        System.out.println("bigdata.data.value : " + bigData.data.value);
    }
}
