package com.jike.filesync;

import net.contentobjects.jnotify.JNotify;
import net.contentobjects.jnotify.JNotifyException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: naruto
 * Date: 13-6-19
 * Time: 上午10:38
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    static List<Server> list = new ArrayList<Server>();
    static String watchPath;

    static {
        Properties properties = new Properties();
        InputStream in = Main.class.getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(in);
            watchPath = properties.getProperty("dir.watch.path");
            String str = properties.getProperty("sync.servers");
            String[] sa1 = str.split(":"), sa2 = sa1[0].split("@");
            String userName = sa2[0], ip = sa2[1];
            Server server = new Server(userName, sa1[1], userName, ip, sa1[2]);
            list.add(server);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static void main(String[] args) throws Exception{
        // watch mask, specify events you care about,
        // or JNotify.FILE_ANY for all events.
        int mask = JNotify.FILE_CREATED;
        // watch subtree?
        boolean watchSubtree = true;
        // add actual watch
        try {
            int watchID = JNotify.addWatch(watchPath, mask, watchSubtree, new FileChangeListener(list));
        } catch (JNotifyException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        while (true){
            Thread.sleep(100000);
        }

    }
}
