import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Random;
import java.util.ArrayList;

public class Runner {

    public static void main(String args[]) throws IOException {

        ArrayList<Long> x = new ArrayList<Long>();
        ArrayList<Long> y_book = new ArrayList<Long>();
        ArrayList<Long> y_hash = new ArrayList<Long>();
        ArrayList<Long> y_brute = new ArrayList<Long>();

        for (int i = 30; i < 100000; i = (int) (i * 1.1) ) {
            System.out.print(i);
            Implementation imp = new Implementation();
            StringBuilder str_builder = new StringBuilder("ab");

            for (int j = 0; j < i; j++) {
                str_builder.insert(0, 'a');
            }
            long long_i = i;

            x.add(long_i);

            long start;
            long end;
            long dif;
            boolean imp_out;

            start = System.nanoTime();
            imp_out = imp.isUniqueBookImplementation(str_builder.toString());
            end = System.nanoTime();

            dif = end - start;
            y_book.add(dif);

            start = System.nanoTime();
            imp_out = imp.isUniqueHashMapImplementation(str_builder.toString());
            end = System.nanoTime();

            dif = end - start;
            y_hash.add(dif);

            start = System.nanoTime();
            imp_out = imp.isUniqueBruteForce(str_builder.toString());
            end = System.nanoTime();

            dif = end - start;
            y_brute.add(dif);

        }
        System.out.println();
        Gson my_g = new Gson();
        String json_x = my_g.toJson(x.toArray());
        String json_y_book = my_g.toJson(y_book.toArray());
        String json_y_hash = my_g.toJson(y_hash.toArray());
        String json_y_brute = my_g.toJson(y_brute.toArray());

        FileWriter outputStream = null;

        try {
            outputStream = new FileWriter("output.txt");
            outputStream.write(json_x);
            outputStream.write('\n');
            outputStream.write(json_y_book);
            outputStream.write('\n');
            outputStream.write(json_y_hash);
            outputStream.write('\n');
            outputStream.write(json_y_brute);

        } finally {
            if (outputStream != null) outputStream.close();
        }


    }
}
