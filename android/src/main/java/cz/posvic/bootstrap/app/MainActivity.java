package cz.posvic.bootstrap.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import cz.posvic.bootstrap.lib.LibActivity;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast.makeText(MainActivity.this, "Menu item clicked", Toast.LENGTH_SHORT).show();
			return true;
		}

		if (id == R.id.action_run) {
			startActivity(new Intent(getApplicationContext(), LibActivity.class));
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
