public class CompleteRequestByTask {

    private int state = 0;
    private final int EXECUTION = 0;
    private final int BEFORE_FINISHED = 1;
    private final int FINISHED = 2;
    private final int STOP = 5;

    enum State { EXECUTION, BEFORE_FINESHED, FINISHED, STOP = 5  };

    public void execute() {

        switch(state) {
        case EXECUTION: // Execution
            //
            break;

        case BEFORE_FINISHED:
            // BeforeFinished
            break;

        case FINISHED:
            // Finished
            break;
        case STOP:
            
        }
    }

    public void complete() {
        switch(state) {
        case EXECUTION:
            state = 1;
            break;

        case BEFORE_FINISHED:
            break;

        case FINISHED:
            break;

        case STOP:
            break;
        }
    }
}
