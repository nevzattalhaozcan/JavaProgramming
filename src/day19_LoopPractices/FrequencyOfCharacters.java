package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccdaa", result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);

                if (ch == each) {
                    counter++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += counter;

        }

        System.out.println(result);

    }
}
