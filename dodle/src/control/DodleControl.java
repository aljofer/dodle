package control;
import model.DodleModel;
import view.DodleView;
/*
 * This is the main class of dodle. We are using the MVC pattern, hence the name.
 * 
 */
public class DodleControl {

	static DodleControl instance;
	static DodleModel model;
	static DodleView view;
	
	
	public static void main(String[] args) {
		getControl();
		getModel();
		getView();
		
	}
	
	public static DodleModel getModel() {
		if(model == null) {
	         model = new DodleModel();
	      }
		return model;
	}

	public static DodleView getView() {
		if(view == null) {
	         view = new DodleView();
	      }
		return view;
	}
	
	public static DodleControl getControl() {
		if(instance == null) {
	         instance = new DodleControl();
	      }
		return instance;
	}


}
