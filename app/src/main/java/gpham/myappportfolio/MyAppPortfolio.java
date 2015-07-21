package gpham.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MyAppPortfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
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
    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = null ;
        int verticalCoordinate = 0;
        int[] location = new int[2];
        switch (view.getId()) {
            case R.id.spotifyAppBtn:
                text = "This button will launch my Spotify Streamer app!";
                break;
            case R.id.footballAppBtn:
                text = "This button will launch my Football Scores app!";

                break;
            case R.id.libraryAppBtn:
                text = "This button will launch my Library app!";
                break;
            case R.id.buildItBiggerAppBtn:
                text = "This button wil launch my Build It Bigger app!";
                break;
            case R.id.xyzAppBtn:
                text = "This button will launch my XYZ Reader app!";
                break;
            case R.id.myAppBtn:
                text = "This button will launch my Capstone app!";
                break;
        }

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        view.getLocationOnScreen(location);
        verticalCoordinate = location[1]+15;
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, verticalCoordinate);

    }
}
