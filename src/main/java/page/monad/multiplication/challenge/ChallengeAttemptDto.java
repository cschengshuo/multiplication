package page.monad.multiplication.challenge;

import lombok.Value;

import javax.validation.constraints.*;

/**
 * 用户解题尝试
 */
@Value
public class ChallengeAttemptDto {

    @Min(1) @Max(99)
    int factorA, factorB;
    @NotBlank
    String userAlias;
    @Positive(message = "How could you possibly get a negative result here? Try again.")
    int guess;

}