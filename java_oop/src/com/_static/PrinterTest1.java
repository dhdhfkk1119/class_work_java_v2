package com._static;

public class PrinterTest1 {
    public static void main(String[] args) {

        int a = 10;
        // static int b = 20;
        // static 변수는 태양이다.

        NumberPrinter printer = new NumberPrinter(1);
        NumberPrinter printer2 = new NumberPrinter(2);

        printer.PrintWaitNumber();
        printer.PrintWaitNumber();
        printer2.PrintWaitNumber();
        printer.PrintWaitNumber();
        printer2.PrintWaitNumber();
        printer.PrintWaitNumber();
        printer2.PrintWaitNumber();
        printer.PrintWaitNumber();
        printer2.PrintWaitNumber();
        printer.PrintWaitNumber();
        printer2.PrintWaitNumber();
        printer.PrintWaitNumber();
        printer2.PrintWaitNumber();


    }
}
