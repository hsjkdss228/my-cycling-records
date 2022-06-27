package panels;

import models.Writing;

import javax.swing.*;
import java.awt.*;

public class WritingPanel extends JPanel {
  public WritingPanel(Writing writing) {
    this.setLayout(new GridLayout(8, 1));

    this.addWriterLabel(writing.writer());
    this.addSubjectLabel(writing.subject());
    this.addTitleLabel(writing.title());
    this.addDistanceLabel(writing.distance());
    this.addStopoverPlacesPanel(writing.stopoverPlaces());
    this.addContentField(writing.content());
  }

  public void addWriterLabel(String writer) {
    this.add(new JLabel("작성자: " + writer));
  }

  public void addSubjectLabel(String subject) {
    this.add(new JLabel("주제: " + subject));
  }

  public void addTitleLabel(String title) {
    this.add(new JLabel("제목: " + title));
  }

  public void addDistanceLabel(String distance) {
    this.add(new JLabel("주행거리: " + distance));
  }

  public void addStopoverPlacesPanel(String[] stopoverPlaces) {
    this.add(new JLabel("경유장소:"));

    JPanel stopoverPlacesPanel = new JPanel();

    stopoverPlacesPanel.setLayout(new FlowLayout());

    for (String stopoverPlace : stopoverPlaces) {
      stopoverPlacesPanel.add(new JLabel(stopoverPlace));
    }

    this.add(stopoverPlacesPanel);
  }

  public void addContentField(String content) {
    this.add(new JLabel("상세 내용:"));

    JTextArea contentArea = new JTextArea(content);

    contentArea.setLineWrap(true);
    contentArea.setEditable(false);

    JScrollPane contentScrollPane = new JScrollPane(contentArea);

    this.add(contentScrollPane);
  }
}
