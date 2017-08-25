# FileEncode
判断文件的字符格式

cpdetector一个可以自动检测文本编码格式的项目

detector按照“谁最先返回非空的探测结果，就以该结果为准”的原则返回探测到的 字符集编码。
使用需要用到三个第三方JAR包：antlr.jar、chardet.jar和cpdetector.jar
cpDetector是基于统计学原理的，不保证完全正确。
