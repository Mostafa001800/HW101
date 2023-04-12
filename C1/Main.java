package C1;

public class Main {
    public static void main(String[] args) {
        Pair pair =new Pair("SS","AA");
        Pair pair3 =new Pair("SS","AA");
        Pair pair2 =new Pair("BB","BB");
        Pair pair4 =new Pair("CC",11);
        Map map= new Map();
        map.addList(pair);
        map.addList(pair2);
        map.addList(pair3);
        System.out.println(map.toString());
        System.out.println("0000000000000000000000000");
        map.search("SS");
        Map map2= new Map();
        map2.addList(pair);
        map2.addList(pair3);
        map2.addList(pair2);
        map2.addList(pair4);
        System.out.println(map.equals(map2.getList()));
        map.assign(map2);
        System.out.println(map.toString());
        System.out.println("//////////////////////////////////");
        System.out.println(map2.toString());

    }
}
