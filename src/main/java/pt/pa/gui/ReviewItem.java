package pt.pa.gui;

import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import pt.pa.model.Review;

/**
 *
 * @author amfs
 */
public class ReviewItem extends FlowPane {
    public ReviewItem(Review review) {
        Label userNameLabel = new Label("User: " + review.getUserName());
        Label ratingLabel = new Label("Rating: " + review.getRating());
        Label commentLabel = new Label("Comment: " + review.getComment());
        getChildren().addAll(userNameLabel, ratingLabel, commentLabel);
        setHgap(10);
        setVgap(5);
    }
}