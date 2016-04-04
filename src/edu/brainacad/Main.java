package edu.brainacad;

import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.io.File;

/**
 * Created by m18 on 25.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\m18\\Desktop\\Новая папка");
        String[] list = file.list();

        for (String a : list) {
            System.out.println(a);


        }
    }
}