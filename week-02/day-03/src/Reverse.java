public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        int a = reversed.length()-1;

        for(int i=0;i<reversed.length();i++)
        {
            System.out.print(reversed.charAt(a-i));
        }
    }
}

