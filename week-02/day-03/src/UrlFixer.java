public class UrlFixer {
        public static void main(String... args){
            String url = "https//www.reddit.com/r/nevertellmethebots";

            String x = url;
            x = x.substring(0, 7) + ":" + x.substring(7, x.length());

            //url.replaceAll()

            //url=url.substring(7);

            // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
            // Also, the URL is missing a crutial component, find out what it is and insert it too!
            // Try to solve it more than once using different String functions!

            System.out.println(x);
        }
    }

