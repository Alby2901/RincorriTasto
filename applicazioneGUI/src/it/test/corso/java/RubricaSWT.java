package it.test.corso.java;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class RubricaSWT {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		try {
			RubricaSWT window = new RubricaSWT();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(1088, 675);
		shell.setText("SWT Application");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(124, 52, 519, 26);
		
		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.setBounds(124, 145, 71, 0);
		btnRadioButton.setText("Radio Button");
		
		Button btnProva = new Button(shell, SWT.NONE);
		btnProva.setBounds(163, 277, 90, 30);
		btnProva.setText("Prova");

	}
}
