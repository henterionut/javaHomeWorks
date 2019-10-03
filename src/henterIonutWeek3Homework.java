import java.util.*;

public class henterIonutWeek3Homework {

    public static void main(String[] args) {
        homeWork1EX4();
        homeWork1EX5();
        homeWork1EX6();
        homeWork1EX7();
//Week2:
        homeWork2EX1();
        homeWork2EX2();
        homeWork2EX3();
        homeWork2EX4();
    }

    public static void homeWork1EX4() {
        ///////// EX 4

        boolean isElectric = true;
        int wheels = 4;
        char model = 'S';
        double power = 500.50;
        long blabla = 245412384;
        String brand = "Tesla";
        String[] colors = {"Black", "White", "Gray", "Blue", "Red"};
        System.out.println("Boolean:" + isElectric + "\nChar:" + model + "\nInteger:" + wheels + "\nDouble:" + power + "\nLong:" + blabla + "\nString:" + brand + "\nArray:" + Arrays.toString(colors));

    }

    public static void homeWork1EX5() {
        ///////// EX 5
        int x = 1;
        int y = 2;
        for (int i = 0; i < (x + y); i++) {

            System.out.println("ABCDEFG");
            if (y > x) {
                System.out.println(x + y * 2 / 2 - 1 + 20);
            }
        }
    }

    public static void homeWork1EX6() {
        ///////// EX 6
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());
        if (a > b) {
            System.out.println(a + " is larger than " + b);

        } else if (b > a) {
            System.out.println(b + " is larger than " + a);

        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        }
    }

    public static void homeWork1EX7() {
        ///////// EX 7
        int[] randomValues = {2, 10, 28, 47, 34, 31, 56, 33, 15, 17};
        for (int i = 0; i < randomValues.length; i++) {
            if (randomValues[i] != 15) {
                System.out.println("\n" + randomValues[i]);
            }
        }
    }

    public static void homeWork2EX1() {
        //1
        String one = "Hello";
        String two = "World!";
        if (one != two) {
            String onePlusTwo = one + " " + two;
            System.out.println(onePlusTwo);
        }
    }

    public static void homeWork2EX2() {
        //2
        Scanner read = new Scanner(System.in);
        System.out.println("Introduceti un cuvant:");
        String oneWord = read.nextLine();
        String reversedWord = "";
        for (int i = oneWord.length() - 1; i >= 0; i--) {
            System.out.println(oneWord.charAt(i));
            reversedWord = reversedWord + oneWord.charAt(i);
        }

        if (reversedWord.equals(oneWord)) {
            System.out.println(true + " Cuvantul introdus este palindrom");
        } else {
            System.out.println("Cuvantul introdus nu este palindrom");
        }
    }

    public static void homeWork2EX3() {
        //3
        String empty = "";
        ArrayList<String> emptyArray = new ArrayList<String>();

        List<String> list = new ArrayList<String>();

        list.add("evaDGbsf");
        list.add("BvcCBV");
        list.add("AXVcsdv");
        list.add("xvdDVaf");
        list.add("cdsgasDS");
        list.add("Mfdbsaf");

        String vowel = "aeiou";
        for (String word : list) {
            //i
            if (vowel.contains(String.valueOf(word.charAt(0)).toLowerCase())) {
                System.out.println("it starts with vowel\n " + word);
                empty += word.toLowerCase();
                System.out.println(empty);
            }
        }
        for (String word : list) {
            //ii
            if (!vowel.contains(String.valueOf(word.charAt(0)).toLowerCase())) {
                System.out.println("it doest not start with vowel\n " + word);
                emptyArray.add(word.toUpperCase());
                System.out.println(emptyArray + "\n");
            }
        }
    }

    public static void homeWork2EX4() {
        //4
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Henter", "henterionut@yahoo.com");
        hm.put("Mihai", "mihai@yahoo.com");
        hm.put("Raluca", "raluca@yahoo.com");
        hm.put("Ion", "ion@yahoo.com");
        hm.put("Aion", "aion@yahoo.com");
        hm.put("Zion", "zion@yahoo.com");

        System.out.println(hm.entrySet());
        System.out.println("Hashmap size= " + hm.size());

        if (hm.containsKey("Ion")) {
            System.out.println("Key 'Ion' exists in the map");
        } else {
            System.out.println("Key 'Ion' does not exist in the map");
        }

        System.out.println(hm.get("Henter"));
        hm.remove("Raluca");
        System.out.println(hm.entrySet());

        //sort map
        Object[] keys = hm.keySet().toArray();
        Arrays.sort(keys);

        for (Object key : keys) {
            System.out.println(hm.get(key));
        }
    }
}
