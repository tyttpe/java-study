# Java的继承

## Java的重写（override）

通常是父子类之间继承父类方法时需要重写，而且这个方法得参数和返回值都不能改变

## Java的重载（overload）

重载是在一个类中，名相同但是参数不同的方法，当然返回值可以不同

## super

super有三种使用方式：

* 调用父类的构造方法
* 调用父类的成员方法
* 调用父类的非private属性（protected属性只能被继承了父类的子类调用）

<font color="red">想要使用Lambda表达式需要使用<kbd>jdk8</kbd>以上版本</font>