package az.atlacademy.module01.lesson18;

import java.util.*;

public class CollectionApiApp {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(integers.size());
        integers.add(1);
        integers.add(2);
        System.out.println(integers.size());
        System.out.println(integers.get(0));
//        System.out.println(integers.get(3));

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(24, "Elvin", 70));
        people.add(new Person(22, "Abc", 98.91));
        people.add(new Person(20, "Ali", 85));
        Collections.sort(people);
        System.out.println(people);
        Collections.sort(people, (o1, o2) -> Integer.compare(o2.getAge(), o1.getAge()));
        System.out.println(people);
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o2.getGrade(), o1.getGrade());
            }
        });
        System.out.println(people.toString());
        Collections.sort(people, (o1, o2) -> CharSequence.compare(o1.getName(), o2.getName()));
        System.out.println(people.toString());

        List<String> strings = new LinkedList<>();
        strings.add("E");
        strings.add("l");
        strings.add("v");
        strings.add("i");
        strings.add("n");
        System.out.println(strings);

        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(203);
        nums.add(-5);
        nums.add(-2);
        nums.add(-2);
        nums.add(-2);
        System.out.println(nums);

        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(203);
        linkedHashSet.add(-5);
        linkedHashSet.add(-2);
        linkedHashSet.add(-2);
        linkedHashSet.add(-2);
        System.out.println(linkedHashSet);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Elvin");
        map.put(1, "Elvin3");
        map.put(2, "Elvin2");
        map.put(3, "Elvin");
        map.put(3, "Elvin3");
        System.out.println(map);

    }

}
