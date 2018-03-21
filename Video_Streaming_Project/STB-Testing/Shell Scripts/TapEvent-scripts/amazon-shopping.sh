#in.amazon.mShop.android.shopping, class name is com.amazon.identity.auth.device.AuthPortalUIActivity
#!/bin/bash
echo this is to Test the Andriod App
echo connect to Andriod Setup Box
devicestate=$(adb get-state)
echo Device State
echo "$devicestate"
#if [ "$devicestate" == "device" ]
#then
	deviceName=$(adb shell getprop ro.product.model)	
	echo Device Name 
	echo "$deviceName"
	echo -e "Connected Andriod Device -- $deviceName \n"
	echo Clearing the App Cache
	adb shell pm clear in.amazon.mShop.android.shopping
	adb shell sleep 20
	adb shell screenrecord --verbose sdcard/amazontest.mp4
	echo Launch the Amzon App
	adb shell monkey -p in.amazon.mShop.android.shopping -c android.intent.category.LAUNCHER 1
	adb shell sleep 10
	echo Welcome page 
	adb shell input tap 303 508
	adb shell sleep 10
	adb shell input tap 157 326	
	adb shell sleep 10
	echo enter the username
	adb shell input text 9840735988
	adb shell sleep 10
	echo click Login  
	adb shell input tap 190 406
	#adb shell sleep 20
	adb shell sleep 10
	adb shell input tap 190 216
	echo enter the password
	adb shell input text Amazon2018$
	adb shell sleep 10
	echo Click on Cart
	adb shell input tap 190 405
	adb shell sleep 10
	echo Click on Continue Shopping
	adb shell input tap 567 34
	adb shell sleep 10
	echo Click on My Account
	adb shell input tap 275 968
	adb shell sleep 10
	echo Click on  My Orders
	adb shell input tap 531 187
	adb shell input tap 552 175
	adb shell sleep 10
exit