del /s /q net\sf\jdec\*.class
rem javac -Xstdout logus.txt -Xmaxerrs 3000 -Xmaxwarns 3000 -Xlint net\sf\jdec\ui\main\UILauncher.java
javac -Xstdout logus.txt -Xlint:deprecation net\sf\jdec\ui\main\UILauncher.java
java net.sf.jdec.ui.main.UILauncher > run.log
