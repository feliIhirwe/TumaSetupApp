package activities_all;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.ifelicien.xmls.R;

import ActivityListerner.switchActivityListerner;

/**
 * Created by ifelicien on 5/5/2018.
 */


public class ShowCreateOrEdit extends AppCompatActivity {

    Button createBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createBtn= findViewById(R.id.createResButton);
        createBtn.setOnClickListener(new switchActivityListerner(getApplicationContext(), showCreateOptions.class));

    }
}
