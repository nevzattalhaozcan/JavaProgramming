package day21_ForEachLoop;

public class ReversedName {

    public static void main(String[] args) {

        String[] names = {"Friedrich Nietzsche","Ludwig Wittgenstein","Bertrand Russell","Martin Heidegger","Arthur Schopenhauer","Immanuel Kant"};

        for (String each : names) {

            String reversed = "";

            for (int i = each.length()-1; i >= 0 ; i--) {

                reversed += each.charAt(i);

            }

            System.out.println(reversed);

        }

    }
}
