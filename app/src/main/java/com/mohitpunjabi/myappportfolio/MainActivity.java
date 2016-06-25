package com.mohitpunjabi.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when user touches any of the Nanodegree app buttons.
     * Displays a toast with the name of the app.
     *
     * @param view The button that was touched
     */
    public void displayToast(View view) {
        if (view instanceof Button) {
            String toastMessage = String.format(getResources().getString(R.string.default_toast_message),
                    ((Button) view).getText());

            // Hide the previous toast, if any.
            if (toast != null) toast.cancel();

            // Show the toast.
            toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
