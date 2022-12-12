//Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и 
// выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class sem_5_dz_2 {
    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();
        LinkedList<String> firstName = new LinkedList<>();
        HashMap<String, Integer> count_name = new HashMap<>();
        name.add("Иван Петров");
        name.add("Иван Иванов");
        name.add("Сергей Сегреев");
        name.add("Григорий Рудков");
        name.add("Сергей Лепс");
        name.add("Иван Пугачев");
        name.add("Григорий Чумаков");
        name.add("Кирилл Степанов");

        for (int i = 0; i < name.size(); i++) {
            String[] slp = name.get(i).split(" ");
            for (int j = 0; j < slp.length; j += 2) {

                firstName.add(slp[j]);
            }
        }

        for (int i = 0; i < firstName.size(); i++) {
            int nums;
            if (count_name.containsKey(firstName.get(i))) {
                nums = count_name.get(firstName.get(i));
                count_name.put(firstName.get(i), nums + 1);
            } else {
                count_name.put(firstName.get(i), 1);
            }

        }

        System.out.println(count_name);

        Map<String, Integer> sortedMap = count_name.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedMap.entrySet().forEach(System.out::println);

    }
}
