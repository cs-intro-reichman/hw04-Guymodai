public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
 
    public static String lowerCase(String str) {
        String lower_case = "";
        for (int i = 0; i < str.length(); i++) {
            int value = (int) (str.charAt(i));
            if (value >= 65 && value <= 90) {
                value = value + 32;
                lower_case = lower_case + (char) (value);
            } else {
                lower_case = lower_case + str.charAt(i);
            }
        }
        return lower_case;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            int counter = 0, j = 0;
            while (i + j < str1.length() && j < str2.length() && str1.charAt(i + j) == str2.charAt(j)) {
                counter++;
                j++;
            }
            if (counter == str2.length()) {
                return true;
            }
        }
        return false;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] sentencesLower = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            sentencesLower[i] = lowerCase(sentences[i]);
        }
        String[] keywordsLower = new String[keywords.length];
        for (int i = 0; i < keywords.length; i++) {
            keywordsLower[i] = lowerCase(keywords[i]);
        }
        for (int i = 0; i < sentencesLower.length; i++) {
            for (int j = 0; j < keywordsLower.length; j++) {
                if (contains(sentencesLower[i], keywordsLower[j])) {
                    System.out.println(sentences[i]);
                    break;
                }
            }
        }
    }
} 