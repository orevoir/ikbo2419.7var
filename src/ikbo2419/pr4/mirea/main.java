package ikbo2419.pr4.mirea;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class main extends JFrame
{
    int scoreone = 0, scoresec = 0;
    JButton ACMilan = new JButton("AC Millan");
    JButton RealMadrid = new JButton("Real Madrid");
    JLabel Score = new JLabel("");
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    Label Winner = new Label("Winner: DRAW");

    public main()
    {

        super("FOOTBALL");
        setSize(500, 500);
        setLayout(null);
        Font fontForScore = new Font("Times new Roman", Font.BOLD, 20);

        ACMilan.setBounds(30, 330, 180, 40);
        RealMadrid.setBounds(290, 330, 180, 40);
        Score.setBounds(225,200,100,40);
        Score.setText(scoreone + " vs " + scoresec);
        Score.setFont(fontForScore);
        Winner.setBounds(180,120,300,25);
        Winner.setFont(fontForScore);
        LastScorer.setBounds(180,380,250,20);

        add(ACMilan);
        add(RealMadrid);
        add(Score);
        add(LastScorer);
        add(Winner);

        ACMilan.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a)
            { }

            public void mouseClicked(MouseEvent a)
            {
                scoreone++;
                Score.setText(scoreone + " vs " + scoresec);
                LastScorer.setText("Last Scorer: AC Millan");
                winnerUpdate();

            }

            public void mouseEntered(MouseEvent a)
            { }

            public void mouseReleased(MouseEvent a)
            { }

            public void mousePressed(MouseEvent a)
            { }
        });

        RealMadrid.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a)
            { }

            public void mouseClicked(MouseEvent a)
            {
                scoresec++;
                Score.setText(scoreone + " vs " + scoresec);
                LastScorer.setText("Last Scorer: Real Madrid");
                winnerUpdate();
            }

            public void mouseEntered(MouseEvent a)
            { }

            public void mouseReleased(MouseEvent a)
            { }

            public void mousePressed(MouseEvent a)
            { }
        });

    }

    private void winnerUpdate()
    {
        if (scoreone > scoresec)
        {
            Winner.setText("Winner: AC Millan");
        } else if (scoreone < scoresec)
        {
            Winner.setText("Winner: Real Madrid");
        } else if (scoreone == scoresec)
        {
            Winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args)
    {
        main run = new main();
        run.setVisible(true);
    }
}