package ch04;

/*문자 기반 스트림을 사용해서 키보드에서
* 입력한 값을 파일에다가 저장하시오 (Append 모드 활성화)
* 단, 버퍼를 사용해야 합니다*/


import java.io.*;

public class StringStreamIOTest {
    public static void main(String[] args) {

        try(FileWriter fileWriter = new FileWriter("text.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            InputStreamReader iSR = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(iSR);){
            System.out.println("텍스트를 입력 하세요");
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()){
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
