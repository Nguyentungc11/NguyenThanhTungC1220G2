package case_study.commons;

import case_study.models.Services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncWriteAndRead<E> {
    public static final String PATH = "D:\\C1220G2_NguyenThanhTung_Module2\\src\\case_study\\data\\";

    public void write(String fileName, List<E> list, boolean option) {
        File file = new File(PATH + fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file, option);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (E e : list) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error in writing.");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String[]> read(String fileName) {
        List<String[]> list = new ArrayList<>();
        File file = new File(PATH + fileName);
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String[] temp;
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                list.add(temp);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


}
