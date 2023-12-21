package multiplication.challenge;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Value;
    /**
     * Attempt coming from the user
     */
    @Value
    public class ChallengeAttemptDTO {
        @Min(1) @Max(99)
        int factorA, factorB;
        @NotBlank
        String userAlias;
        @Positive
        int guess;
    }

