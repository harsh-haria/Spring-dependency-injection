package com.example.dependency;

public class ColourPrinterImpl implements  ColourPrinter{

    private RedPrint redPrint;
    private GreenPrint greenPrint;
    private BluePrint bluePrint;

    public ColourPrinterImpl(RedPrint redPrint, GreenPrint greenPrint, BluePrint bluePrint){
        this.redPrint = redPrint;
        this.greenPrint = greenPrint;
        this.bluePrint = bluePrint;
    }

    @Override
    public String print() {
        return String.join(",", redPrint.print(),greenPrint.print(),bluePrint.print());
    }
}
