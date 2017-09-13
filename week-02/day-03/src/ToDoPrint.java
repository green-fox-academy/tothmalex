public class ToDoPrint {
        public static void main(String... args){
            String todoText = " - Buy milk\n";

           todoText= "My todo:\n"+ todoText+ " - Download games\n    - Diablo";

            System.out.println(todoText);
        }
    }

// Add "My to do:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo