/**
 * 
 */
package org.ndp.psylab.gwt;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.UIObject;

/**
 * @author ndp
 *
 */
public class MainWindow extends UIObject {

	private static MainWindowUiBinder uiBinder = GWT.create(MainWindowUiBinder.class);

	interface MainWindowUiBinder extends UiBinder<Element, MainWindow> {
	}

	@UiField
	SpanElement nameSpan;

	public MainWindow(String firstName) {
		setElement(uiBinder.createAndBindUi(this));

		// Can access @UiField after calling createAndBindUi
		nameSpan.setInnerText(firstName);
	}

}
