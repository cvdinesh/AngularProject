#in.amazon.mShop.android.shopping, class name is com.amazon.identity.auth.device.AuthPortalUIActivity
#!/bin/bash
echo this is to Test the Andriod App
echo connect to Andriod Setup Box
devicestate=$(adb get-state)
echo Device State
echo "$devicestate"
if [ "$devicestate" == "device" ]
then
	deviceName=$(adb shell getprop ro.product.model)	
	echo Device Name 
	echo "$deviceName"
	echo Andriod Device is connected
	echo Clearing the App Cache
	adb shell pm clear in.amazon.mShop.android.shopping
	adb shell sleep 20
	echo Launch the Amzon App
	adb shell monkey -p in.amazon.mShop.android.shopping -c android.intent.category.LAUNCHER 1
	adb shell sleep 20
	echo Welcome page 
	adb shell input keyevent 66	
	adb shell sleep 20
	adb shell input keyevent 61
	adb shell input keyevent 61
	adb shell input keyevent 61
	#adb shell sleep 10
	echo enter the username
	adb shell input text 9840735988
	#adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	echo click Login for username
	adb shell input keyevent 66
	#adb shell sleep 20
	adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	echo enter the password
	adb shell input text Amazon2018$
	adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell input keyevent 61
	adb shell sleep 10
	echo Click Login
	adb shell input keyevent 66
	adb shell sleep 20
	echo Press tab
	adb shell input keyevent 61
	adb shell sleep 15
	echo Press tab
	adb shell input keyevent 61
	adb shell sleep 15
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell sleep 10
	adb shell input keyevent 61
	adb shell sleep 15
	echo Click on My Account
	adb shell input keyevent 66
	adb shell sleep 10
	adb shell input keyevent 61
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell sleep 10
	adb shell input keyevent 61
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell sleep 10
	adb shell input keyevent 66		
	adb shell sleep 10
else
	echo Wait for a moment to get connected
	adb connect 192.168.1.3
	adb shell sleep 10
	#adb logcat > C:\Users\LalithaDinesh\Desktop\ADB-Amazon.txt
	adb devices -l
	deviceName=$(adb shell getprop ro.product.model)	
	echo Device Name 
	echo "$deviceName"
	echo Andriod Device is connected
	echo Clear the App Cache
	adb shell pm clear in.amazon.mShop.android.shopping
	adb shell sleep 20
	echo Launch the Amzon App
	adb shell monkey -p in.amazon.mShop.android.shopping -c android.intent.category.LAUNCHER 1
	adb shell sleep 20
	echo Welcome page 
	adb shell input keyevent 66	
	adb shell sleep 20
	adb shell input keyevent 61
	adb shell input keyevent 61
	adb shell input keyevent 61
	#adb shell sleep 10
	echo enter the username
	adb shell input text 9840735988
	#adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	adb shell input keyevent 66
	#adb shell sleep 20
	adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	echo enter the password
	adb shell input text Amazon2018$
	adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell input keyevent 61
	adb shell sleep 10
	echo Click Login
	adb shell input keyevent 66
	adb shell sleep 20
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell input keyevent 61
	adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell input touchscreen tap  64 867
	adb shell sleep 10
	echo Click on My Account
	adb shell input keyevent 66
	adb shell sleep 10
	adb shell input keyevent 61
	echo Press tab
	adb shell input keyevent 61
	adb shell sleep 10
	echo Press tab
	adb shell input keyevent 61
	echo Press tab
	adb shell sleep 10
	adb shell input keyevent 61
	echo Press tab
	adb shell input keyevent 66		
	adb shell sleep 10
fi
