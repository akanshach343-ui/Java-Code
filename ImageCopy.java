import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy{
  public static void main(String[] args){
    FileInputStream fis = null;
    FileOutputStream fos = null;
    
    try{
      fis = new FileInputStream("input.jpg");
      fos = new FileOutputStream("output.jpg");
      
      int byteData;
      System.out.println("Reading and copying image file...");
      
      while((byteData = fis.read()) != -1){
        fos.write(byteData);
      }
      
      System.out.println("Image file copied successfully!");
      System.out.println("Output file: output.jpg");
      
    }catch(IOException e){
      System.out.println("Error: " + e.getMessage());
      System.out.println("Make sure 'input.jpg' exists in the project folder");
    }finally{
      try{
        if(fis != null){
          fis.close();
        }
        if(fos != null){
          fos.close();
        }
      }catch(IOException e){
        System.out.println("Error closing files: " + e.getMessage());
      }
    }
  }
}
