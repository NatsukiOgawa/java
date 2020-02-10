import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class git_add_commit_push{
    public static void main (String args[]) {
			try {
					Process process = new ProcessBuilder("git", "add", "*").start();
					InputStreamReader isr = new InputStreamReader(process.getInputStream(), "UTF-8");
					BufferedReader reader = new BufferedReader(isr);
					StringBuilder builder = new StringBuilder();
					int c;
					while ((c = reader.read()) != -1) {
							builder.append((char)c);
					}
					System.out.println("result:\n" + builder.toString());
					System.out.println("Command return code: " + process.waitFor());
			} catch (IOException | InterruptedException e) {
					e.printStackTrace();
			}


			try {
					Process process = new ProcessBuilder("git", "commit", "-m", "a").start();
					InputStreamReader isr = new InputStreamReader(process.getInputStream(), "UTF-8");
					BufferedReader reader = new BufferedReader(isr);
					StringBuilder builder = new StringBuilder();
					int c;
					while ((c = reader.read()) != -1) {
							builder.append((char)c);
					}
					System.out.println("result:\n" + builder.toString());
					System.out.println("Command return code: " + process.waitFor());
			} catch (IOException | InterruptedException e) {
					e.printStackTrace();
			}


			try {
					Process process = new ProcessBuilder("git", "push").start();
					InputStreamReader isr = new InputStreamReader(process.getInputStream(), "UTF-8");
					BufferedReader reader = new BufferedReader(isr);
					StringBuilder builder = new StringBuilder();
					int c;
					while ((c = reader.read()) != -1) {
							builder.append((char)c);
					}
					System.out.println("result:\n" + builder.toString());
					System.out.println("Command return code: " + process.waitFor());
			} catch (IOException | InterruptedException e) {
					e.printStackTrace();
			}



    }
}
