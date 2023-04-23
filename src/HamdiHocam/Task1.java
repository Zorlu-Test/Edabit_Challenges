package HamdiHocam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {


    public static void main(String[] args) throws IOException, NoSuchMethodException {
        int tekSatir = 0;
        int cokluSatir = 0;
        int javaDoc = 0;

        File file = new File("src/HamdiHocam/Motor.java");

        String fileContents = new String(Files.readAllBytes(Paths.get(file.toURI())));

        Scanner scanner = new Scanner(fileContents);

        List<String> rowByCode = new ArrayList<>();

        while (scanner.hasNext()) {
            String row = scanner.nextLine();
            rowByCode.add(row);
        }

        Map<String, Sayac> map = new LinkedHashMap<>();

        for (int i = 0; i < rowByCode.size(); i++) {

            String satir = rowByCode.get(i);

            if (satir.contains("//")) {
                tekSatir = tekSatir + 1;
            } else if (satir.contains("/*")) {
                cokluSatir = cokluSatir + 1;
            } else if (satir.contains("/**")) {
                javaDoc = javaDoc + 1;
            }


            if (satir.contains("pubic") || satir.contains("private") || satir.contains("protected") || satir.contains("()")) {

                for (int j = i; j < rowByCode.size(); j++) {
                    if (satir.contains("//")) {
                        tekSatir = tekSatir + 1;
                    } else if (satir.contains("/*")) {
                        cokluSatir = cokluSatir + 1;
                    } else if (satir.contains("/**")) {
                        javaDoc = javaDoc + 1;
                    }
                    if (satir.contains("}")) {
                        break;
                    }
                }
            }
            map.put("a"+1, new Sayac(tekSatir, cokluSatir , javaDoc));

            tekSatir = 0;
            cokluSatir = 0;
            javaDoc = 0;


        }

        System.out.println("map = " + map);
    }


}
