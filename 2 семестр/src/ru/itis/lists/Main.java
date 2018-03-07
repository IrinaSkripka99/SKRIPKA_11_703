package ru.itis.lists;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("кто то");
        list.add("Ильяс");
        list.add("Влад 195");
        list.add("Андрей");
        list.add("Камиля");
        list.add("Даша");
        list.addToBegin("ууу");
        System.out.println(list.contains("Ильяс"));
        System.out.println(list.contains("Скрипка"));
        list.remove("Ильяс");
        System.out.println(list.indexOf("Андрей"));
        System.out.println(list.get(4));
        list.add(25);
        list.add("Оля");
        list.add("Здрасте");
        list.add(14);
        list.add(4);
        list.showList();
        list.reverse();
        System.out.println();
        System.out.println(list.size());


        int i=0;
    }
}
