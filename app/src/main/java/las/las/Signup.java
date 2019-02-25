package las.las;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jarvis on 1/7/2017.
 */

public class Signup extends AppCompatActivity implements View.OnClickListener  {
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);

      Button btn_Back = (Button) findViewById(R.id.back);
      btn_Back.setOnClickListener(this);
            }


    @Override
    public void onClick(View view) {
        Intent  back= new Intent(Signup.this,
                LoginActivity.class);
        startActivity(back);

    }

}
