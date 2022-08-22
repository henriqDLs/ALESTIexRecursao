public class Algorit {
    public static void main(String[] args){
        System.out.println(devolveSom(5));
        System.out.println(invertStr("Algoritimos"));
    }

    public static int devolveSom(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+(devolveSom(n-1));
        }
    }

    public static String invertStr(String s){
        if(s.length()<=1){
            return s;
        }
        else{
            return invertStr(s.substring(1))+s.charAt(0);
        }
    }
}
