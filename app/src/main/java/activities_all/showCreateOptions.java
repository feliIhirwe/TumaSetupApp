package activities_all;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.ifelicien.xmls.R;

import ActivityListerner.switchActivityListerner;

/**
 * Created by ifelicien on 5/5/2018.
 */


public class showCreateOptions extends AppCompatActivity {

    Button addRestoBtn, addTypeBtn, addDishBtn, doneBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adding_layout);

        addRestoBtn= findViewById(R.id.add_restaurant_button);
        addTypeBtn= findViewById(R.id.add_type_button);
        addDishBtn= findViewById(R.id.add_dish_button);
        addRestoBtn.setOnClickListener(new switchActivityListerner(getApplicationContext(), addResto.class));
        addTypeBtn.setOnClickListener(new switchActivityListerner(getApplicationContext(), addType.class));
        addDishBtn.setOnClickListener(new switchActivityListerner(getApplicationContext(), addDish.class));

    }
}
