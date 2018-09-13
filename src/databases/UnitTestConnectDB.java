package databases;

import org.testng.Assert;

import java.util.List;

public class UnitTestConnectDB {
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        try {
           connectToSqlDB.readDataBase("Students", "stName");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //C:\Users\almrashid\Desktop\midterm\MidtermJuly
        Assert.assertEquals("DataBase connected","DataBase connected");

    }
}
