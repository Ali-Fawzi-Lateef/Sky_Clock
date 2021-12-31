import javax.swing.*;         
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
      
public class MyFrame extends JFrame {
 
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;

    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;

    String time;
    String day;
    String date;

    MyFrame() throws InterruptedException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sky Clock");
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(360,240);
        this.setResizable(false);


        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Garamond",Font.PLAIN,60));
        timeLabel.setForeground(new Color(0, 204, 255));
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Garamond",Font.PLAIN,50));
        dayLabel.setForeground(new Color(0, 204, 255));
        dayLabel.setBackground(Color.BLACK);
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Garamond",Font.PLAIN,40));
        dateLabel.setForeground(new Color(0, 204, 255));
        dateLabel.setBackground(Color.BLACK);
        dateLabel.setOpaque(true);


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() throws InterruptedException {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            Thread.sleep(1000);
        }
    }
}
