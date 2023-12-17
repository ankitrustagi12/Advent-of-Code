import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Day1_Trebuchet {
    public static void main(String[] args) {
        try {
			Scanner scanner = new Scanner(new File("sample.txt"));
            int sumr=0;
			while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                StringBuilder s1 = new StringBuilder();
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)>='1' && s.charAt(i)<='9'){
                        s1.append(s.charAt(i));
                    }
                }
				sumr += 10*(s1.charAt(0)-48)+(s1.charAt(s1.length()-1)-48);
                //System.out.println(10*s1.charAt(0)+s1.charAt(s1.length()-1));
			}
            System.out.println(sumr);
			scanner.close();
		} 
        catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}
