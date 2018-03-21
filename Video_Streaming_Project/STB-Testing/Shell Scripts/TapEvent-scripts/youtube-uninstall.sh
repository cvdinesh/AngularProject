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
	echo "uninstall youtube app start"
	adb shell am start -a android.intent.action.VIEW -d http://play.google.com/store/search?q=youtube&c=apps
	adb shell sleep 10
	adb shell input tap 687 195
	adb shell sleep 10
	adb shell input tap 947 693
	adb shell sleep 10
	adb shell input tap 1402.5 566.5
	adb shell sleep 10
	echo "uninstall youtube app end"
exit