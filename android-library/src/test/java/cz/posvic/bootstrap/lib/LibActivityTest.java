package cz.posvic.bootstrap.lib;

import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class LibActivityTest {

	private LibActivity activity;

	@Before
	public void setUp() throws Exception {
		activity = Robolectric.buildActivity(LibActivity.class).create().start().resume().get();
	}

	@Test
	public void activityShouldNotBeNull() {
		assertNotNull(activity);
	}

	@Test
	public void layoutShouldContainTextView() {
		TextView tv = (TextView) activity.findViewById(R.id.textView);
		assertNotNull(tv);
		assertThat(tv.getText().toString(), equalTo("Debug"));
	}
}