import android.content.Context;
import android.content.pm.ApplicationInfo;

import com.example.ellehacks.Database;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

/**
 * Created by ANUPYA on 2018-02-03.
 */

/*
public class DatabaseTest {
    @Test
    public void getEmployeeTest() throws Exception {
//        Context mockContext = new MockContext() {
//            @Override
//            public ApplicationInfo getApplicationInfo() {
//                return super.getApplicationInfo();
//            }
//        };
        Context mockContext = mock(Context.class);

        ApplicationInfo mockAppInfo = mock(ApplicationInfo.class);
        mockAppInfo.dataDir="/Users/anupya/AndroidStudioProjects/ellehacks/app/src/main/assets";

        Mockito.when(mockContext.getApplicationInfo()).thenReturn(mockAppInfo);

        Database testDB = new Database(mockContext);
        testDB.getEmployees();
    }

}

*/