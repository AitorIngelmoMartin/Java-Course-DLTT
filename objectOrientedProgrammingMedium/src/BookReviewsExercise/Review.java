package BookReviewsExercise;

public class Review {

	//
	private int reviewId;
	private String reviewDescription;
	private Double reviewNote;

	Review(int reviewId, String reviewDescription, Double reviewNote) {
		this.reviewId = reviewId;
		this.reviewDescription = reviewDescription;
		this.reviewNote = reviewNote;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewDescription=" + reviewDescription + ", reviewNote="
				+ reviewNote + "]";
	}

}
