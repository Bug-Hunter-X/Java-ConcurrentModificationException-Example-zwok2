public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String str : list) {
            if (str.equals("B")) {
                list.remove(str); // ConcurrentModificationException
            }
            System.out.println(str);
        }
    }
}