public class PostIt {

    String backgroundColor;
    String text;
    String textColor;

    public static void main(String[] args) {

        PostIt orange = new PostIt();
        orange.textColor = "blue";
        orange.text = "Idea1";

        PostIt pink = new PostIt();
        orange.textColor = "black";
        orange.text = "Awesome";

        PostIt yellow = new PostIt();
        orange.textColor = "green";
        orange.text = "Superb";

    }
}
