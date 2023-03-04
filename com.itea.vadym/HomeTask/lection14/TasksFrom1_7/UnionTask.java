package HomeTask.lection14.TasksFrom1_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
5. Напишіть методи union(Set<?>... set) та intersect(Set<?> ... set),
   що реалізують операції об'єднання та перетину множин.
   Протестуйте роботу цих методів на попередньо заповнених множинах.
 */

public class UnionTask {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(4, 5, 6, 7));

        Set<Integer> unionTest = union(set1, set2, set3);
        System.out.println("Union " + unionTest);

        Set<Integer> intersectTest = intersect(set1, set2, set3);
        System.out.println("Intersect " + intersectTest);
    }

    private static Set <Integer> union(Set<Integer>... set){
        Set <Integer> unionResult = new HashSet<>();
        for (Set <Integer> i : set) {
            unionResult.addAll(i);
        }
        return unionResult;
    }

    private static Set <Integer> intersect(Set<Integer> ... set){
        Set <Integer> intersectResult = new HashSet<>(set[0]);
        for (Set <Integer> i : set) {
            intersectResult.retainAll(i);
        }
        return intersectResult;
    }
}
