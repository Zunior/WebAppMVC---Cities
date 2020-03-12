package action.factory;

import action.AbstractAction;
import action.impl.DeleteAction;
import action.impl.IzlistajAction;
import action.impl.LoginAction;
import action.impl.LogoutAction;
import action.impl.DodajAction;
import action.impl.EditAction;

public class ActionFactory {
	public static AbstractAction createActionFactory(String actionName) {
		AbstractAction action = null;
		if(actionName.equalsIgnoreCase("/login")) {
			action = new LoginAction();
		}
		
		if(actionName.equalsIgnoreCase("/logout")) {
			action = new LogoutAction();
		}
		
		if(actionName.equalsIgnoreCase("/izlistaj")) {
			action = new IzlistajAction();
		}
		
		if(actionName.equalsIgnoreCase("/dodaj")) {
			action = new DodajAction();
		}
		
		if(actionName.equalsIgnoreCase("/delete")) {
			action = new DeleteAction();
		}
		
		if(actionName.equalsIgnoreCase("/edit")) {
			action = new EditAction();
		}
		
		return action;
	}
}
