package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaConfigProperty {

  def apply(
    defineAuthChallenge: Option[String] = None,
    postConfirmation: Option[String] = None,
    preAuthentication: Option[String] = None,
    customMessage: Option[String] = None,
    preTokenGeneration: Option[String] = None,
    userMigration: Option[String] = None,
    customEmailSender: Option[software.amazon.awscdk.services.cognito.CfnUserPool.CustomEmailSenderProperty] = None,
    kmsKeyId: Option[String] = None,
    createAuthChallenge: Option[String] = None,
    customSmsSender: Option[software.amazon.awscdk.services.cognito.CfnUserPool.CustomSMSSenderProperty] = None,
    postAuthentication: Option[String] = None,
    verifyAuthChallengeResponse: Option[String] = None,
    preSignUp: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.LambdaConfigProperty.Builder)
      .defineAuthChallenge(defineAuthChallenge.orNull)
      .postConfirmation(postConfirmation.orNull)
      .preAuthentication(preAuthentication.orNull)
      .customMessage(customMessage.orNull)
      .preTokenGeneration(preTokenGeneration.orNull)
      .userMigration(userMigration.orNull)
      .customEmailSender(customEmailSender.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .createAuthChallenge(createAuthChallenge.orNull)
      .customSmsSender(customSmsSender.orNull)
      .postAuthentication(postAuthentication.orNull)
      .verifyAuthChallengeResponse(verifyAuthChallengeResponse.orNull)
      .preSignUp(preSignUp.orNull)
      .build()
}
