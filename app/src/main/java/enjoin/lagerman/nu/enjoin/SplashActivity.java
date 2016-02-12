package enjoin.lagerman.nu.enjoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    ImageButton imageButtonBr, imageButtonSp, imageButtonUK;
    String selectedLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        imageButtonBr = (ImageButton) findViewById(R.id.flag_brasil);
        imageButtonBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(SplashActivity.this,
                        "ImageButtonBr is clicked!", Toast.LENGTH_SHORT).show();
                selectedLang = "Br";
                startActivity(xxxxxxxx);
            }
        });

        imageButtonSp = (ImageButton) findViewById(R.id.flag_spain);
        imageButtonSp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(SplashActivity.this,
                        "ImageButtonSp is clicked!", Toast.LENGTH_SHORT).show();
                selectedLang = "Sp";
                startActivity(xxxxxxxx);
            }
        });

        imageButtonUK = (ImageButton) findViewById(R.id.flag_uk);
        imageButtonUK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(SplashActivity.this,
                        "ImageButtonBr is clicked!", Toast.LENGTH_SHORT).show();
                selectedLang = "UK";
                startActivity(xxxxxxxx);
            }
        });
    }
}
