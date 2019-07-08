import java.io.*;
import com.marsRover.*;

public class MarsRover {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Maximum Area bound ");
		int max_X = Integer.parseInt(br.readLine());
		int max_y =Integer.parseInt(br.readLine());;
		System.out.println("Enter the initial position");
		int x = Integer.parseInt(br.readLine());;
		int y = Integer.parseInt(br.readLine());
		String facing = br.readLine();
		Input input = new Input(x, y, facing);
		System.out.println("Enter the instruction");
		String requestedInstructions = br.readLine();
		FacingDitrectionFactory facingDitrectionFactory = FacingDitrectionFactory.getInstance();
		DirectionFactory directionFactory = DirectionFactory.getInstance();
		for(int i = 0; i < requestedInstructions.length(); i++) {
			char currentInstruction = requestedInstructions.charAt(i);
			if(currentInstruction == 'M') {				
				Direction direction = directionFactory.getDirection(input.getCurrentFacingDir());
				input = direction.getDirection(input);
			}
			FacingDirection facingDirection = facingDitrectionFactory.getDirection(currentInstruction);
			input = facingDirection.getNextFacingDirection(input);

			
		}
		
		System.out.println(input);
	}
}