package ru.nomermastera.test.printer;

public class Printer {

    private int paintVolume;

    public Printer() {
        this.paintVolume = 0;
    }

    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    public int getPaintVolume() {
        return paintVolume;
    }

    public void charge(int addPaintVolume) {
        this.paintVolume = this.paintVolume + addPaintVolume;
        System.out.println("Принтер пополнен на длину текста " + addPaintVolume + ". Сейчас краски в принтере: " + this.paintVolume);
    }

    public void print(String inString) {
        int lettersAmount = lettersAmount(inString);
        int inkDelta = this.paintVolume - lettersAmount;
        System.out.println("На печать отправлен текст \"" + inString + "\", длина: " + lettersAmount);
        if (inkDelta < 0) {
            System.out.println("Не хватило краски в принтере: " + Math.abs(inkDelta) + ". Сейчас краски в принтере: " + this.paintVolume);
            return;
        }
        this.paintVolume = inkDelta;
        System.out.println("Текст распечатан. Осталось краски: " + this.paintVolume);
    }

    private int lettersAmount(String string) {
        int lettersAmount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                lettersAmount++;
            }
        }
        return lettersAmount;
    }

    public static void main(String[] args) {

        Printer printer = new Printer(1);

        printer.print("123456789");

        printer.charge(8);

        printer.print("123456789");

        printer.charge(8);

    }

}
