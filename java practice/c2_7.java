import javax.swing.*;
import java.applet.*;
class mousemovable implements MouseListener
{
    
    mousemovable()
    {
        JFrame f=new JFrame(" ");
        JLabel l=new JLabel("koti");
        f.add(l);
        f.addMouseListener(this);
        l.setBounds(100,150,100,150);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        f.setSize(300,300);
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
        l.setText("mouse clicked");
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
        l.setText("mouse entered");
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        l.setText("mouse exited");
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        l.setText("mouse clicked");
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        l.setText("mouse clicked");
    }
}
}