public class Comparelength {
    public static void main(String[] args) {
        int[] p1={1,2,3};
        int[] p2={4,5};
        boolean myAnswer;

        if(p2.length >p1.length){
            myAnswer=true;}
        else{
            myAnswer=false;}

        System.out.println("P2 has more elements than p1: "+ myAnswer+".");
    }
}
// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`