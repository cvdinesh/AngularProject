#com.netflix.mediaclient/.ui.login.LoginActivity
#!/bin/bash
echo "++++++++++++++++++++++++++++++++++++++++++	"
echo "*******************"
echo "This is to Test the Andriod App"
echo "*******************"
echo "++++++++++++++++++++++++++++++++++++++++++	"
echo "Connecting to Andriod Setup Box"
echo "++++++++++++++++++++++++++++++++++++++++++	"
echo Get the IP address of the Device Connected
	ipAddress=$(adb shell ip addr show wlan0  | grep 'inet ' | cut -d' ' -f6|cut -d/ -f1)
	echo "++++++++++++++++++++++++++++++++++++++++++"
	echo "$ipAddress"
echo "++++++++++++++++++++++++++++++++++++++++++	"
adb connect "$ipAddress"
adb shell sleep 20
adb devices -l
echo "++++++++++++++++++++++++++++++++++++++++++	"
echo Device Name
adb shell getprop ro.product.model 
echo "++++++++++++++++++++++++++++++++++++++++++	"
#echo Clear the App Cache
#adb shell pm clear com.example.admin.travel
adb shell sleep 20
echo Launch the NetFlix App
adb shell monkey -p com.netflix.mediaclient -c android.intent.category.LAUNCHER 1
adb shell sleep 60
echo Close the text editor
adb shell input keyevent 4
adb shell sleep 15
echo enter the username
adb shell input text app@gmail.com
adb shell sleep 20
echo Press tab
adb shell input keyevent 61
adb shell sleep 15
echo enter the password
adb shell input text app$123
adb shell sleep 15
echo Press tab
adb shell input keyevent 61
adb shell sleep 15 
echo Hit Enter
adb shell input keyevent 66
adb shell sleep 20
exit