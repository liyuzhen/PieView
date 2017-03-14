#PieView
该项目内部主要是一个圆盘方向控制控件，是从之前做过的项目“东莞大堤OA系统”中单独抽取出来的，并进行了简单的重构。

###集成在东莞项目中的控件
![image](https://github.com/liyuzhen/PieView/raw/master/screenshots/first.jpg)

###该项目截图
![image](https://github.com/liyuzhen/PieView/raw/master/screenshots/second.jpg)

###主要用法
```xml
<com.rdc.liyuzhen.pieview.view.PieView
        android:id="@+id/pv"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:padding="10dp"
        app:dividerColor="#FFFFFFFF"
        app:defaultColor="#FF414649"
        app:pressedColor="#FF2F3234"
        app:gapWidth="1dp"
        app:arrowLocation="15dp"
        app:arrowBranchLength="8dp"
        />
```
