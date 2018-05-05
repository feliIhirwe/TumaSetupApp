package activities_all;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.ifelicien.xmls.R;

import ActivityListerner.switchActivityListerner;

/**
 * Created by ifelicien on 5/5/2018.
 */

public class addResto extends AppCompatActivity {

    Button addRestoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_restaurant_layout);
        addRestoBtn= findViewById(R.id.addRestoBtn);
        addRestoBtn.setOnClickListener(new switchActivityListerner(getApplicationContext(), showCreateOptions.class));
    }
}
