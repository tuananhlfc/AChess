package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by tuananh on 5/15/2017.
 */
public class MenuPanel extends JPanel implements MouseListener {

    private JLabel btnNewGame, btnSetting, btnRecord, btnUndo, btnLevel, btnColor;
    private static final Dimension MENU_PANEL_DIMENSION = new Dimension(150, 225);

    public MenuPanel(){
        super(new GridLayout(0, 2,10,10));
        addButton();
        setPreferredSize(MENU_PANEL_DIMENSION);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setFocusable(true);
        setBackground(Color.decode("#8B4116"));
    }

    public void addButton(){
        btnNewGame = new JLabel("New Game");
        btnSetting = new JLabel("Setting");
        btnRecord = new JLabel("Record");
        btnUndo = new JLabel("Undo");
        btnLevel = new JLabel("Level");
        btnColor = new JLabel("Color");
        add(btnNewGame);
        add(btnSetting);
        add(btnRecord);
        add(btnUndo);
        add(btnLevel);
        add(btnColor);
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
        super.addMouseListener(l);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        if (label == btnNewGame){

        } else if (label == btnSetting){
            Table.get().getGameSetup().promptUser();
            Table.get().setupUpdate(Table.get().getGameSetup());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
