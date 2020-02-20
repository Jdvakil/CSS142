public class partOne {
    public static void main(String[] args) {
        capitalizeFirstLetters("hello world welcome to my program");
        System.out.println();
        System.out.println(nameInitials("Jay Darshan Vakil"));
        System.out.println(letterCount("I am an electrical engineering major and I like programming", "e"));
    }

    private static void capitalizeFirstLetters(String aString) {
        // splitting the array and iterating in loop to make first letter to uppercase
        for (String s : aString.split(" ")) {
            System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
        }
    }

    public static String nameInitials(String str) {
        String res = "";
        String temp[] = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (i != temp.length - 1)
                res = res + temp[i].charAt(0) + ".";
            else
                res = res + temp[i].charAt(0);
        }
        return res;
    }

    public static int letterCount(String str1,String str2){
        char c=str2.charAt(0);
        int count=0;
        // iterating through the string and counting the chars
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==c)
                count++;
        }
        return count;
    }
}