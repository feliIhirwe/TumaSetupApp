package ActivityListerner;

import android.content.Context;
import android.content.Intent;
import android.view.View;

    /**
     * Created by ifelicien on 5/5/2018.
     */

    public class switchActivityListerner implements View.OnClickListener
    {
        private Context context;
        private Class myclass;

        public switchActivityListerner(Context c, Class activity)
        {
            context=c;
            myclass=activity;
        }
        @Override
        public void onClick(View view)
        {
            Intent i = new Intent(context, myclass);
            context.startActivity(i);
        }
    }


