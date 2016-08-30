package beast9.com.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int lugar = 0;

    Button kiosco, balandra, tecolote, tec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kiosco = (Button)findViewById(R.id.btnKiosco);
        balandra = (Button)findViewById(R.id.btnBalandra);
        tecolote = (Button) findViewById(R.id.btnTecolote);
        tec = (Button) findViewById(R.id.btnTec);
    }

    public void irKiosco(View v)
    {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("lugar", 1);
        startActivity(intent);
    }
    public void irBalandra(View v)
    {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("lugar", 2);
        startActivity(intent);
    }
    public void irTecolote(View v)
    {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("lugar", 3);
        startActivity(intent);
    }
    public void irTec(View v)
    {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("lugar", 4);
        startActivity(intent);
    }
}
