package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;

/* 
 * ColorChooser - JColorChooser demo.
 * JColorChooser can be used in three ways:
 * <UL><LI>Construct it and place it in a panel;
 * <LI>Call its ConstructDialog() and get a JDialog back
 * <LI>Call its showDialog() and get back the chosen color
 * </UL>
 * @version $Id: ColorChooser.java,v 1.9 2007/05/22 12:56:47 ian Exp $
 */
public class ColorChooser extends JFrame
{
    JColorChooser cc;
    JDialog cd;
    MyCanvas demo;
	Container cPane;

    public ColorChooser() {
        super("Ian Darwin's Color Demo");
        JButton jButton;
		cPane = getContentPane();
        cPane.add(jButton = new JButton("Choose Color..."), BorderLayout.NORTH);
		jButton.setToolTipText("Click here to see the Color Chooser");
        jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent)
			{
				ColorChooser.this.cd.setVisible(true);
			}
		});
        cPane.add(demo = new MyCanvas(300,150), BorderLayout.CENTER);
		demo.setToolTipText("This is the last color you chose");
        pack();
        addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent)
			{
				System.exit(0);
			}
		});
        cd = JColorChooser.createDialog(this,
			"Ian Darwin's Color PopUp",
			true,
			cc = new JColorChooser(getBackground()),
			new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					ColorChooser.this.demo.setBackground(cc.getColor());
				}
			},
			new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent)
				{
					ColorChooser.this.demo.setBackground(getBackground());
				}
			});
	}

    public static void main(String[] astring)
    {
        new ColorChooser().setVisible(true);
    }
}

