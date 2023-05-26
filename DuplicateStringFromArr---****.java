public class DuplicateStringFromArr {

       public static void main(String[] args) {

        String string = "Big black bug bit a big black dog on his big black nose";

        System.out.println(Arrays.toString(checkDuplicate(string)));

}


    public static String[] checkDuplicate(String str) {

        String words[]=str.split(" ");
        Map<String, Integer> m = new HashMap<>();
        List<String> al = new ArrayList<>();
        for (String s : words) {
            if (m.containsKey(s)) {
                int v = m.get(s);
                m.put(s, ++v);
            } else {
                m.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if (entry.getValue() > 1) {
                al.add(entry.getKey());
            }
        }

        String[] dup = new String[al.size()];
        for(int i=0;i<al.size();i++) {
            dup[i] = al.get(i);
        }

        return dup;

    }

}
