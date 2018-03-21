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
	echo Andriod Device is connected
	echo "++++++++++++++++++++++++++++++"
	echo "Install youtube app start"
	echo "++++++++++++++++++++++++++++++"
	echo Search youtube in google playstore
	adb shell am start -a android.intent.action.VIEW -d http://play.google.com/store/search?q=youtube&c=apps	
	adb shell sleep 10
	echo click on Youtube App
	adb shell input tap 839 200
	adb shell sleep 10
	echo click on Install
	adb shell input tap 1260 791
	adb shell sleep 10
	echo click on Accept
	adb shell input tap 1119 759
	adb shell sleep 30
	echo "++++++++++++++++++++++++++++++"
	echo "Install youtube app finish"
	echo "++++++++++++++++++++++++++++++"
	echo click on open
	adb shell input tap 1152 400
	adb shell sleep 25
