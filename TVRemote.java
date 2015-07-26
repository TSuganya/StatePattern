
/********************************************************
Notice that Context also implements
State and keep a reference of it’s current state and 
forwards the request to the state implementation.
*********************************************************/

public class TVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}

}
