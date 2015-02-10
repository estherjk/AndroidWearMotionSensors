# Android Wear Motion Sensors

This project demonstrates the use of the accelerometer and gyroscope sensors on an Android Wear device. It displays the raw values for each sensor on its own page. It also performs simple shake and rotation detection using the accelerometer and gyroscope, respectively; when a shake or a rotation is detected, the background color changes to green.

See it in action [here](http://youtu.be/Yxne6YWGbE0) using the Moto 360.

## Code Overview

The Java files of interest are in `wear/src/main/java`:

* [MainActivity.java](https://github.com/drejkim/AndroidWearMotionSensors/blob/master/wear/src/main/java/com/drejkim/androidwearmotionsensors/MainActivity.java)
* [SensorFragmentPagerAdapter.java](https://github.com/drejkim/AndroidWearMotionSensors/blob/master/wear/src/main/java/com/drejkim/androidwearmotionsensors/SensorFragmentPagerAdapter.java)
* [SensorFragment.java](https://github.com/drejkim/AndroidWearMotionSensors/blob/master/wear/src/main/java/com/drejkim/androidwearmotionsensors/SensorFragment.java)

As the name suggests, `MainActivity.java` contains the code for the main activity. The [2D Picker](https://developer.android.com/training/wearables/ui/2d-picker.html) pattern for Android Wear is used to page through the accelerometer and gyroscope fragments. This is accomplished by adding a [GridViewPager](http://developer.android.com/reference/android/support/wearable/view/GridViewPager.html) element to the activity and setting an adapter that provides the pages by extending [FragmentGridPagerAdapter](http://developer.android.com/reference/android/support/wearable/view/FragmentGridPagerAdapter.html) (see `SensorFragmentPagerAdapter.java`). It also contains a [DotsPageIndicator](http://developer.android.com/reference/android/support/wearable/view/DotsPageIndicator.html) to identify which page is active.

`SensorFragment.java` provides the UI behavior for a sensor by displaying the raw data (available through the [standard Android API](http://developer.android.com/guide/topics/sensors/sensors_motion.html)) and performing simple shake / rotation detection. When instantiating a sensor fragment, the `newInstance()` function is used to specify the desired sensor (i.e. accelerometer or gyroscope). See `SensorFragmentPagerAdapter.java` to see how this is accomplished.
