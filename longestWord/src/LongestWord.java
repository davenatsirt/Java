public class LongestWord {
    public static void main(String[] args) {
        String[] names = {"Dave", "Jevsey", "Daisy"};

        //call the longest word finder method
        String longest = longestWord(names);
        System.out.println(longest);
    }

    public static String longestWord(String[] arr){
        String longest = "";
        for(String name : arr){
            if (name.length() > longest.length()){
                longest = name;
            }
        }
        return longest;
    }
}
