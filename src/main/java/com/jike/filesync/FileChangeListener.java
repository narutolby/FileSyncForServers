package com.jike.filesync;

import com.sun.xml.internal.ws.api.message.stream.InputStreamMessage;
import net.contentobjects.jnotify.JNotifyListener;

import java.io.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: naruto
 * Date: 13-6-19
 * Time: 上午10:38
 * To change this template use File | Settings | File Templates.
 */
public class FileChangeListener implements JNotifyListener {
    private List<Server> list;

    public FileChangeListener(List<Server> list) {
        this.list = list;
    }

    @Override
    public void fileCreated(int i, String s, String s1) {
        System.out.println(i + " " + s + " " + s1);
        StringBuilder cmd = new StringBuilder("rsync -av ");
        for (Server ss : list) {
            cmd.append(s).append(File.separator).append(s1).append(" ").append(ss.getUserName() + "@")
                    .append(ss.getIp() + ":").append(ss.getWatchPath());

            try {
                System.out.println(cmd.toString());
                Process process = Runtime.getRuntime().exec(cmd.toString());
                InputStream in = process.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String line = null;
                while((line = br.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }

    @Override
    public void fileDeleted(int i, String s, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(i + " " + s + " " + s1);
    }

    @Override
    public void fileModified(int i, String s, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(i + " " + s + " " + s1);
    }

    @Override
    public void fileRenamed(int i, String s, String s1, String s2) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(i + " " + s + " " + s1);
    }
}
