package org.example.hw3;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[][] products = {
                {"Яблоки", "Россия", "1.5", "50", "1"},
                {"Апельсины", "Испания", "2.0", "70", "2"},
                {"Бананы", "Эквадор", "1.0", "80", "1"},
                {"Мандарины", "Турция", "1.2", "60", "2"},
                {"Груши", "Франция", "1.8", "40", "1"},
                {"Арбузы", "Украина", "5.0", "20", "2"}
        };

        String desiredSort = "1";
        int minPrice = Integer.MAX_VALUE;
        List<String> cheapestProducts = new ArrayList<>();

        for (String[] product : products) {
            String name = product[0];
            String country = product[1];
            double weight = Double.parseDouble(product[2]);
            int price = Integer.parseInt(product[3]);
            String sort = product[4];

            if (sort.equals(desiredSort) && price < minPrice) {
                minPrice = price;
                cheapestProducts.clear();
                cheapestProducts.add(name);
            } else if (sort.equals(desiredSort) && price == minPrice) {
                cheapestProducts.add(name);
            }
        }

        System.out.println("Наименования товаров сорта " + desiredSort + " и наименьшей ценой " + minPrice + ": " + cheapestProducts);
    }
}

//    В этом примере мы используем двумерный массив products, который содержит информацию о товарах: наименование, страна-производитель, вес, цена и сорт.
//    Затем мы перебираем все записи в массиве с помощью цикла for-each.
//    Для каждой записи мы проверяем, является ли сорт товара заданным, и если это так, то мы сравниваем цену товара с текущей наименьшей ценой. Если цена меньше, мы обновляем значение переменной minPrice и очищаем список cheapestProducts, а затем добавляем наименование товара в список.
//    Если цена равна текущей наименьшей цене, мы просто добавляем наименование товара в список.
//    Наконец, мы выводим список наименований товаров сорта desiredSort и наименьшей ценой в стандартный вывод.