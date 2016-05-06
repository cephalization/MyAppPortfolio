package com.portfolio.tony.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author Anthony Powell 5/6/16
 */
public class AppLinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_links);

        // Setup all of the buttons click events
        // Only creates Toasts so far using the Toaster method
        Toaster(R.id.project1, R.string.p1toast);
        Toaster(R.id.project2, R.string.p2toast);
        Toaster(R.id.project3, R.string.p3toast);
        Toaster(R.id.project4, R.string.p4toast);
        Toaster(R.id.project5, R.string.p5toast);
        Toaster(R.id.project6, R.string.p6toast);
    }

    /**
     * Create SHORT toasts for Objects of the Button type
     *
     * @param id   - the id of the button from R.id
     * @param text - the text for the toast from R.string
     */
    private void Toaster(int id, int text) {
        Button project = (Button) findViewById(id);
        final int string = text;
        if (project != null) {
            project.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), string, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
