package HamdiHocam;

public class Sayac {
    private int tekSatir;
    private int cokluSatir;
    private int javaDoc;

    public Sayac(int tekSatir, int cokluSatir, int javaDoc) {
        this.tekSatir = tekSatir;
        this.cokluSatir = cokluSatir;
        this.javaDoc = javaDoc;
    }

    @Override
    public String toString() {
        return "Sayac{" +
                "tekSatir=" + tekSatir +
                ", cokluSatir=" + cokluSatir +
                ", javaDoc=" + javaDoc +
                '}';
    }
}
