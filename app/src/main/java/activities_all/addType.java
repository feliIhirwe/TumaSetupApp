package activities_all;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.ifelicien.xmls.R;

import ActivityListerner.switchActivityListerner;

/**
 * Created by ifelicien on 5/5/2018.
 */

public class addType extends AppCompatActivity {

    Button addType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_type_layout);

        addType= findViewById(R.id.add_type_button);
        addType.setOnClickListener( new switchActivityListerner(getApplicationContext(),showCreateOptions.class));

    }
}
