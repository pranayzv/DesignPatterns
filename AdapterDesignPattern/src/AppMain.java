
public class AppMain {

	public static void main(String[] args) {
		//Now to write assignment we don't have Pen implementation. 
		//But we have a PilotPen which has write implementation in a sort of different form "mark"
		//So we use a adapter to do the connection
		
		
		PenAdapter penAdapter = new PenAdapter();
		
		AssignmentWork assignmentWork = new AssignmentWork();
		assignmentWork.setPen(penAdapter);
		
		assignmentWork.writeAssignment(" My assignment: Hello world! ...");
		
	}

}
