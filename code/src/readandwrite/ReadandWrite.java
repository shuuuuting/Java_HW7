/*
 * B10433006 張舒婷
 */
package readandwrite;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author zhangshuting
 */
public class ReadandWrite {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        readandwriteWithEncoding("TextFile.txt","UTF-8");
    }
    private static void readandwriteWithEncoding(String filename,String encoding) throws FileNotFoundException, IOException{
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(filename),encoding));
            ObjectOutputStream output;
            output = new ObjectOutputStream(new FileOutputStream("MemberList.txt"));
            Member members[] = new Member[5];
            int index = 0;
            while(input.ready()){
                String line = input.readLine();
                if (index==0){
                    index++;
                    continue;
                }
                if(line==null) break;
                String tokens[] = line.split("\\\t");
                Name name = new Name(tokens[0]);
                Identity ID = new Identity(Integer.parseInt(tokens[1]));
                Date date;
                if (tokens[2].contains("/")){
                    String births[] = tokens[1].split("/");
                    date = new Date(Integer.parseInt(births[0]), Integer.parseInt(births[1]), Integer.parseInt(births[2]));
                }
                else{
                     date = new Date(Integer.parseInt(tokens[2]));
                }
                Student student = new Student(tokens[3]);
                Member member = new Member(index,name, ID,date,student);
                members[index-1] = member;
                output.writeObject(member);
                index++;
            }
            for(Member member : members) System.out.println(member);   
            input.close();
            output.close();
            
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ReadandWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
