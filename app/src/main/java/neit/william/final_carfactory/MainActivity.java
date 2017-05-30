package neit.william.final_carfactory;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtCarName;
    private EditText txtCarType;
    private String txtDrv;
    private TextView lblDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }

        });





        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

        Spinner spncyl = (Spinner) findViewById(R.id.spnCyls);
        String txtCyl = spncyl.getSelectedItem().toString();

        Spinner spntire = (Spinner) findViewById(R.id.spnTires);
        String txtTire = spntire.getSelectedItem().toString();

        Spinner spnWheel = (Spinner) findViewById(R.id.spnWheels);
        String txtWheel = spnWheel.getSelectedItem().toString();

        Spinner spndoor = (Spinner) findViewById(R.id.spnDoors);
        String txtDoor = spndoor.getSelectedItem().toString();

        Spinner spndr = (Spinner) findViewById(R.id.spnDrive);
        String txtDrive = spndr.getSelectedItem().toString();

                lblDisplay = (TextView) findViewById(R.id.lblDisplay);

        String carName = txtCarName.getText().toString();
        String carType = txtCarType.getText().toString();


                CarFactory rcr = new CarFactory();

                rcr.setCarName(carName);
                rcr.setCarType(carType);
                rcr.setDrivetrain(txtDrive);
                rcr.setNumOfCylinders(Integer.parseInt(txtCyl));
                rcr.setTireType(txtTire);
                rcr.setWheelSize(Integer.parseInt(txtWheel));
                rcr.setNumOfDoors(Integer.parseInt(txtDoor));

                rcr.createNewCar(rcr.getCarType(), rcr.getNumOfDoors(), rcr.getTireType(), rcr.getNumOfCylinders(), rcr.getWheelSize(), rcr.getDrivetrain(), rcr.getCarName());

                lblDisplay.setText(rcr.builtCar);




            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
