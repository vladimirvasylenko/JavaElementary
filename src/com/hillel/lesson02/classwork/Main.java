package com.hillel.lesson02.classwork;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        System.out.println(list.isEmpty());
//        list.add("element");
//        list.add("element1");
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());
//        System.out.println(list.contains("element"));
//        System.out.println(list.contains("element"));
//        System.out.println(list.remove("element"));
//        System.out.println(list.remove(3));
//        System.out.println(list.size());
//        System.out.println(list);

//        LinkedList linkedList = new LinkedList();
//        linkedList.add("element");
//        linkedList.add("element");
//        System.out.println(linkedList);
//        System.out.println(linkedList.isEmpty());
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.contains("element"));
//        System.out.println(list.contains("element"));
//        System.out.println(linkedList.remove("element"));
//        System.out.println(linkedList.remove(0));
//        System.out.println(linkedList.size());
//        System.out.println(linkedList);

//        Set set = new HashSet(linkedList);
//        System.out.println(set);
//
//        set.add("sdfsdff");
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        System.out.println(set.remove("sdfsdff"));

        Map map = new HashMap();
        map.put("key", "asdasd");
        map.put(1, "sadasd");
        map.put(1, "sada");

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get(1));
        System.out.println(map.get("key"));
        System.out.println(map.entrySet());
        System.out.println(map.remove("key"));
        System.out.println(map.remove("key"));
        System.out.println(map.remove("key", "asdasd"));

    }
}
