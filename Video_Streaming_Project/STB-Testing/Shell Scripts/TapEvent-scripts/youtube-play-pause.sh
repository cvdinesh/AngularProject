#!/bin/bash
echo test you tube screen recording
#adb shell pm clear 
adb shell am start -a "android.intent.action.VIEW" -d "https://www.youtube.com/watch?v=JMU0KE-7FVI" 
adb shell sleep 10
#adb shell screenrecord --verbose sdcard/amazontest.mp4
adb shell input keyevent KEYCODE_MEDIA_PLAY_PAUSE
adb shell input keyevent KEYCODE_MEDIA_FOCUS
adb shell input keyevent KEYCODE_MEDIA_PLAY_PAUSE
adb shell sleep 10
adb shell input keyevent KEYCODE_MEDIA_NEXT
adb shell sleep 10
adb shell input keyevent KEYCODE_MEDIA_PLAY_PAUSE
adb shell sleep 10
adb shell input keyevent KEYCODE_MEDIA_NEXT
