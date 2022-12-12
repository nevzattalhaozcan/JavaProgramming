package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Aldous Huxley","Ludwig Wittgenstein","Bertrand Russell","Martin Heidegger","Arthur Schopenhauer","Immanuel Kant"};

        for(String each : names){
            String initials = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
        }

    }
}
