import java.util.*;

public class HW3{

    public static void main(String[] args){
        System.out.println("Задача 1");
        ArrayList<Integer> list_to_sort = new ArrayList<>();
        for (int i=0;i<30;i++) {
            list_to_sort.add(new Random().nextInt(25));
        }
        System.out.println("Первоначальный массив = " + list_to_sort);

        list_to_sort.sort(Comparator.reverseOrder());
        System.out.println("Сортированный массив = " + list_to_sort);

        System.out.println("Задача 2");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i=0;i<30;i++) {
            list2.add(new Random().nextInt(25));
        }
        System.out.println(list2);
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if (n % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("Массив без четных чисел " + list2);

        System.out.println("Задача 3");
        int min = list2.get(0);
        int max = min;
        double arifm_mean = .0;
        int sum = 0;
        System.out.println(list2);
        for (int n: list2) {
            sum = sum + n;
            if (n > max) max =n;
            if (n<min) min =n;
        }
        arifm_mean = (double)sum / list2.size();
        System.out.println("Меньшее= " + min + ", Большее = " + max);
        System.out.println("Среднее арифметическое = " +  arifm_mean);

        System.out.println("Задача 4");
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list_intersection = new ArrayList<Integer>(list2);
        for (int i=0;i<5;i++) {
            list3.add(new Random().nextInt(25));
        }
        System.out.println("Первый массив = " + list2);
        System.out.println("Второй массив = " + list3);
        list_intersection.retainAll(list3);
        list2.removeAll(list_intersection);
        list3.removeAll(list_intersection);
        list2.addAll(list3);
        System.out.println("Объединение мессивов без пересечений " + list2);

//        Задача 5 и 6
        long begin =  System.currentTimeMillis();
        for (int i=0;i<10000;i++) {
            list2.add(0, 0);
        }
        long end =  System.currentTimeMillis();

        LinkedList<Integer> linked_array = new LinkedList<>();
        linked_array.add(1);
        long begin_linked =  System.currentTimeMillis();
        for (int i=0;i<10000;i++) {
            linked_array.add(0,0);
        }
        long end_linked =  System.currentTimeMillis();

        System.out.println("Задача 7");
        System.out.println("Пункт 5 - " + (end-begin) + " миллисекунд");
        System.out.println("Пункт 6 - " + (end_linked-begin_linked) + " Миллисекунд");
    }
}