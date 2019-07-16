package com.tdu.client;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2019-07-16-14:45
 * @date ${Date} -14:45
 */
public class TemplatesTest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);

        String[] arr = new String[]{"tom","jerry"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list= new  ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }


    }


    public void method(){
        ArrayList list= new  ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        if (list == null) {
            System.out.println("1");
        }

        if (list != null) {
            System.out.println("2");
        }

        if (list == null) {
            System.out.println("3");
        }

        if (list != null) {
            System.out.println("4");
        }


    }
}
