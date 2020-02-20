import java.util.Scanner;
public class partTwo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text : ");
        String text=sc.nextLine();
        String out;
        out=lexLargest(text);
        System.out.println("LexLarget Output : "+out);
        out=largestBy(text);
        System.out.println("Larget By Output : "+out);
        out=largestByAction(text,1);
        System.out.println("largestByAction with action 1 output : "+out);
        out=largestByAction(text,2);
        System.out.println("largestByAction with action 2 output : "+out);
    }

    public static String lexLargest(String text){
        String words[]=text.split(" ");
        String word="";
        for(int i=0;i<words.length;i++){
            if(word.compareTo(words[i])<0){
                word=words[i];
            }
        }
        return word;
    }

    public static String largestBy(String text){
        String words[]=text.split(" ");
        String word="";
        for(int i=0;i<words.length;i++){
            if(word.length()<words[i].length()){
                word=words[i];
            }
        }
        return word;
    }

    public static String largestByAction(String text,int action){
        if(action==1){
            return lexLargest(text);
        }
        else if(action==2){
            return largestBy(text);
        }
        else{
            return "";
        }
    }
}