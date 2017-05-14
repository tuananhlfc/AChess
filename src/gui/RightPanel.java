package gui;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * Created by tuananh on 5/15/2017.
 */
public class RightPanel extends JPanel{

    private MenuPanel northPanel;
    private JPanel southPanel;
    private static final Color PANEL_COLOR = Color.decode("0xFDF5E6");
    private static final EtchedBorder PANEL_BORDER = new EtchedBorder(EtchedBorder.RAISED);
    private static final Dimension RIGHT_PANEL_DIMENSION = new Dimension(200,700);

    public RightPanel(){
        super(new BorderLayout());
        setBackground(Color.decode("0xFDF5E6"));
        setBorder(PANEL_BORDER);
        this.northPanel = new MenuPanel();
        add(this.northPanel, BorderLayout.NORTH);
        setPreferredSize(RIGHT_PANEL_DIMENSION);
    }
}
