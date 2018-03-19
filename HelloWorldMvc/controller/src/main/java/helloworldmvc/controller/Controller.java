package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.model.Model;
import helloworldmvc.view.IView;
import helloworldmvc.view.View;

public class Controller {

	private IModel model;
	private IView view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	
	public void run(){
		view.display(model.getMessage());
	}
}
