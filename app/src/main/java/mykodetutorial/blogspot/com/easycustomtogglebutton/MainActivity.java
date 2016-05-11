package mykodetutorial.blogspot.com.easycustomtogglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setResource("activity_main","layout"));
    }

    /* mengganti id menjadi string */
    public int setResource(String nama, String tipe){
        return getBaseContext().getResources().getIdentifier(nama,tipe,getBaseContext().getPackageName());
    }
}
