import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

class background{

	public static void main(String args[]){
		try(BufferedWriter writer = Files.newBufferedWriter(Paths.get("D:/obj.txt"))){

			for (int i = 0; i < 100; i++){
			writer.write("light {");
			writer.newLine();
			writer.write("type spherical");
			writer.newLine();
			Random rand = new Random();
			float color = 0.4f + 0.6f * rand.nextFloat();
			writer.write("color { \"sRGB nonlinear\" " + color + " " + color + " " + color + " }");
			writer.newLine();
			writer.write("radiance " + (rand.nextFloat()*12+4));
			writer.newLine();
			writer.write("center " + (rand.nextFloat()*1200-600) + " 0 " + (rand.nextFloat()*1000-500));
			writer.newLine();
			writer.write("radius " + (rand.nextFloat()*4 + 0.5));
			writer.newLine();
			writer.write("samples 1");
			writer.newLine();
			writer.write("}");
			writer.newLine();
			writer.newLine();
	}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
			
		}

	}

}