public class Class06052023 {


    public static void main(String[] args) {
        //    String eBolStr = "Given an array of integers, return the largest gap between the sorted elements of the array.";
        //  eBolStr = "Ensar e";
        //    eBol(eBolStr);

        method2();

    }

    // "Given an array of integers, return the largest gap between the sorted elements of the array.";
    public static void eBol(String eBol) {
        int uzun = eBol.length();
        int dummy = 0;

        for (int i = 0; i < uzun; i++) {

//            if ('e' == eBol.charAt(i) || 'E' == eBol.charAt(i)) {
//                dummy++;
//            }
            String myChar = eBol.charAt(i) + "";
            //   myChar=Character.toString(eBol.charAt(i));

            if (myChar.equalsIgnoreCase("e")) {
                dummy++;
            }

        }
        System.out.println(dummy);
        System.out.println("uzun = " + uzun);


    }


    public static void method2() {
        String name = "Given an array of integers, return the largest gap between the sorted elements of the array.";
        String date="12/12/2023";
        String str = "integers";

        // name = name.trim();

        // name= name.replace(" ","");

        //name= name.replace("n", "");
        name.contains(str);
        String[] cumle = name.split(" ");

        for (int i = 0; i < cumle.length; i++) {


        }
        System.out.println(cumle[0]);

        int indexThe = name.indexOf("the",36);

        int lastThe = name.lastIndexOf("the");
        System.out.println("lastThe = " + lastThe);
        

        System.out.println(indexThe);



    }


}
