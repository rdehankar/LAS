package las.las;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static android.app.ProgressDialog.show;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button login_Button = (Button) findViewById(R.id.login_button);
        login_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                EditText txtUserId = (EditText) findViewById(R.id.txtUserId);
                EditText txtPassword = (EditText) findViewById(R.id.txtPassword);
                if (txtUserId.getText().toString().equals("rahul") && txtPassword.getText().toString().equals("12345")) {
                    txtUserId.setText(null);
                    txtPassword.setText(null);
                    Intent myHome = new Intent(LoginActivity.this, home.class);
                    startActivity(myHome);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid UserName and Password",Toast.LENGTH_LONG).show();
                    txtUserId.setText(null);
                    txtPassword.setText(null);
                }
            }

        });

        Button signUp_Button = (Button)findViewById(R.id.signup_button);
        signUp_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(LoginActivity.this, Signup.class);
                startActivity(myIntent);
            }
        });





}


    public void onClick(View view)
    {

    }

}