package helloworldmvc.model;

public class Model implements IModel {

	@Override
	public String getMessage() {
		return Model.class.getResource("message.txt").getFile();
	}

}
