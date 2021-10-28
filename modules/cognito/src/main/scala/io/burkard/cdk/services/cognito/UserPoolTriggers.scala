package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserPoolTriggers {

  def apply(
    defineAuthChallenge: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    postConfirmation: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    preAuthentication: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    customMessage: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    preTokenGeneration: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    userMigration: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    createAuthChallenge: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    postAuthentication: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    verifyAuthChallengeResponse: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    preSignUp: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  ): software.amazon.awscdk.services.cognito.UserPoolTriggers =
    (new software.amazon.awscdk.services.cognito.UserPoolTriggers.Builder)
      .defineAuthChallenge(defineAuthChallenge.orNull)
      .postConfirmation(postConfirmation.orNull)
      .preAuthentication(preAuthentication.orNull)
      .customMessage(customMessage.orNull)
      .preTokenGeneration(preTokenGeneration.orNull)
      .userMigration(userMigration.orNull)
      .createAuthChallenge(createAuthChallenge.orNull)
      .postAuthentication(postAuthentication.orNull)
      .verifyAuthChallengeResponse(verifyAuthChallengeResponse.orNull)
      .preSignUp(preSignUp.orNull)
      .build()
}
