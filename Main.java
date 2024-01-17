import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args )throws IOException {
        // bu benim bilgisayarımda oluşturduğum deneme.txt dosyası, siz de kendi bilgisayarınızda veya gelen text dosyasını
        // bu uzantıyı değiştirerek kullanabilirsiniz

        String path = "/Users/anilbasaran/Documents/deneme.txt";

        File file = new File(path);

        FileReader fReader = new FileReader(file);

        BufferedReader buffReader = new BufferedReader(fReader);

        String line;
        String sayilar = "";
        int result = 0;
        while ((line = buffReader.readLine()) != null){
            result += Integer.parseInt(line);
            sayilar += line+" ";
        }
        System.out.println("Numaralar :"+ sayilar);
        System.out.println("Toplam: "+result);

    }
}
