package views;

import listeners.KeyListener;
import models.Board;

import javax.swing.*;

public class PopupMenu extends JPopupMenu {

    private final JMenuItem mRight, mLeft, mUp, mDown;

    {
        mRight = new JMenuItem("W Prawo");
        mDown = new JMenuItem("W Dol");
        mUp = new JMenuItem("W Gore");
        mLeft = new JMenuItem("W Lewo");
    }

    public PopupMenu(Board board) {
        add();
        setCommand();
        addListeners(board);
    }

    private void add() {
        add(mRight);
        add(mDown);
        add(mUp);
        add(mLeft);
    }

    private void setCommand() {
        mRight.setActionCommand("RIGHT");
        mDown.setActionCommand("DOWN");
        mLeft.setActionCommand("LEFT");
        mUp.setActionCommand("UP");
    }

    private void addListeners(Board board) {
        mRight.addActionListener(new KeyListener(board));
        mDown.addActionListener(new KeyListener(board));
        mLeft.addActionListener(new KeyListener(board));
        mUp.addActionListener(new KeyListener(board));
    }
}