package designpatterns.combined.djview;
  
public class HeartTestDrive {

    @SuppressWarnings("unused")
	public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
