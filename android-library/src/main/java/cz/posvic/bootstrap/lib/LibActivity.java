package cz.posvic.bootstrap.lib;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class LibActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lib);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast.makeText(LibActivity.this, "Lib menu item clicked", Toast.LENGTH_SHORT).show();
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
