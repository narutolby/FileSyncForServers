#########################################################################
# File Name: start.sh
# Author: narutolby
# mail: willianlby@yahoo.cn
# Created Time: 2013年06月19日 星期三 17时07分25秒
#########################################################################
#!/bin/bash
$JAVA_HOME/bin/java -Dfile.encoding=UTF-8 -classpath $JAVA_HOME/jre/lib/resources.jar:$JAVA_HOME/jre/lib/jsse.jar:$JAVA_HOME/jre/lib/jce.jar:$JAVA_HOME/jre/lib/plugin.jar:$JAVA_HOME/jre/lib/charsets.jar:$JAVA_HOME/jre/lib/deploy.jar:$JAVA_HOME/jre/lib/management-agent.jar:$JAVA_HOME/jre/lib/rt.jar:$JAVA_HOME/jre/lib/javaws.jar:$JAVA_HOME/jre/lib/ext/sunjce_provider.jar:$JAVA_HOME/jre/lib/ext/localedata.jar:$JAVA_HOME/jre/lib/ext/dnsns.jar:$JAVA_HOME/jre/lib/ext/sunpkcs11.jar:./:./jnotify/jnotify-notify-0.93.jar -Djava.library.path=./jnotify com.jike.filesync.Main
