package com.callingwithjitsi;

import com.facebook.react.ReactActivity;
import androidx.annotation.Nullable; // <--- Add this line if not already existing

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "CallingWithJitsi";
  }
}
