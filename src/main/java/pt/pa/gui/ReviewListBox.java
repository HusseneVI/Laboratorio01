package pt.pa.gui;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import pt.pa.model.Review;

import java.util.List;

/**
 *
 * @author amfs
 */
public class ReviewListBox extends VBox {
    public ReviewListBox(List<Review> reviewList) {

        // Display reviews with a label
        Label reviewsLabel = new Label("Reviews");
        reviewsLabel.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 24)); // Bold label

        reviewList.forEach(r -> {
            getChildren().add(new ReviewItem(r));
        });

        setSpacing(10);
    }
}