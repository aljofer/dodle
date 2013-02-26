package control;
import model.DodleModel;
import view.DodleView;
/*
 * This is the main class of dodle. We are using the MVC pattern, hence the name.
 * 
 */
public class DodleControl {

	public DodleModel getModel() {
		return model;
	}

	public void setModel(DodleModel model) {
		this.model = model;
	}

	public DodleView getView() {
		return view;
	}

	public void setView(DodleView view) {
		this.view = view;
	}

	static DodleModel model;
	static DodleView view;
	
	public static void main(String[] args) {
		model = new DodleModel();
		view = new DodleView();
	}

}
