//scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati fiecare propozitie pe o linie noua

public class SentenceSplitter {
    public static void main(String[] args) {
String sentence = "Get a Girlfriend Fast. Ask a friend to set you up. Talk to people on social media. Try dating apps. Join a new group or club. Approach girls in public. Use open body language. Ask a girl you click with to go out with you. Get to know the girl on your date. Spend more time together. Figure out if you’re a good fit. Ask her to be your girlfriend when you’re ready. Get back out there if she’s not the one.";
        String[] arrOfStr = sentence.split(".");
        for (String propozitie : arrOfStr)
            System.out.println(propozitie);
    }
    }

