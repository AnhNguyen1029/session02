package ra.demo1;

public class Utill {
    public String[] convertStringToArray (String nyc) throws Exception {
        String[] array = nyc.split(",");
        if (!nyc.contains(",")){
            throw new Exception("phải có , mới hợp lệ");
        }
        //String ny = "Hoa,Huong,Dao";
        return array;
    }
}
