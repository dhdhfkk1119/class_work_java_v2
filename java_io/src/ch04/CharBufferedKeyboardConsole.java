package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CharBufferedKeyboardConsole {
    public static void main(String[] args) {
        /*
        * InputStreamReader 는 System.in (InputStream)을 기반으로 사용한다
        * BufferedReader 는  InputStreamReader 를 wrap 해서 사용한다*/
        try(InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            PrintWriter pw = new PrintWriter(System.out);
            BufferedWriter bw = new BufferedWriter(pw)){
            System.out.println("텍스트를 입력 하세요");
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()){
                bw.write(line.replace("자바","JAVA"));
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
