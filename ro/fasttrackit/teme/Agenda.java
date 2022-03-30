package ro.fasttrackit.teme;

public class Agenda {
    public static void main(String[] args) {
        int[] agenda = new int[4];
        System.out.println("Agenda telefonica");
        System.out.println("1. Adaugare la lista telefonica.");
        System.out.println("2. Inlocuire numar telefon.");
        System.out.println("3. Stergere din lista telefonica.");
        System.out.println("4. Cautare.");
        System.out.println(addNumber(agenda, 7882232));
        System.out.println(addNumber(agenda, 7883335));
        System.out.println(addNumber(agenda, 7812234));
        System.out.println(addNumber(agenda, 7882413));
        for(int c : agenda){
            System.out.println(c);
        }
        replaceNumber(agenda, 7882413, 7553311);
        System.out.println();
        removeNumber(agenda, 7812234);

        for (int c : agenda) {
            System.out.println(c);
        }
    }

    public static int addNumber(int[] agenda, int a) {
        int x = -1;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == 0) {
                agenda[i] = a;
                x = i;
                break;
            }

        }
        return x;

    }

    public static int replaceNumber(int[] agenda, int previous, int next) {
        int x = -1;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == previous) {
                agenda[i] = next;
                x = i;
            }

        }
        return x;
    }

    public static int removeNumber(int[] agenda, int numberToRemove) {
        int x = -1;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == numberToRemove) {
                agenda[i] = 0;
                x = i;
            }
        }
        return x;
    }

    public static int search(int[] agenda, int numberToSearch) {
        int x = -1;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == numberToSearch) {
                x = i;
            }

        }
        return x;
    }


}
