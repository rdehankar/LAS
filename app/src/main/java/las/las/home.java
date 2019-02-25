package las.las;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.list;


/**
 * Created by Jarvis on 1/7/2017.
 */

public class home extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listview1;
    FloatingActionButton fab_menu, fab_add, fab_edit;
    Animation FabOpen,FabClose,FabRclockwise,FabRAnticlockswise;
    boolean isOpen;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

      listview1 = (ListView) findViewById(R.id.labourListView);
      listview1.setOnItemClickListener(this);

      final FloatingActionButton fab_menu = (FloatingActionButton) findViewById(R.id.fab_menu);
      fab_menu.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

                        }
      });

      /*Button btn_Test = (Button) findViewById(R.id.btn_test);
      btn_Test.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent login_Intend= new Intent(home.this,
                      LoginActivity.class);
              startActivity(login_Intend);

          }
      }); */

  }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),((TextView)view).getText(),Toast.LENGTH_SHORT).show();

    }

}
