// package Collections;

public class RoughWork {
    public  static String replaceVpw(String str){
        String result = "";
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            // char c = Character.toLowerCase(ch[i]);
            char c = ch[i];
            // System.out.println("("+ch[i]+")");
            char x;
            if(String.valueOf(c).matches("[aeiou]")){
                if(c=='a') result+=""+'e';
                if(c=='e') result+=""+'i';
                if(c=='i') result+=""+'o';
                if(c=='o') result+=""+'u';
                if(c=='u') result+=""+'a';
            }
            else if (String.valueOf(c).matches("[AEIOU]")) {
                if(c=='A') result+=""+'E';
                if(c=='E') result+=""+'I';
                if(c=='I') result+=""+'O';
                if(c=='O') result+=""+'U';
                if(c=='U') result+=""+'A';
            }else{
                result+=ch[i];
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        String str = "BabalAeiou";
        System.out.println(replaceVpw(str));

    }
}
