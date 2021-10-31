package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSession {

  def apply(
    internalResourceId: String,
    findingPublishingFrequency: Option[String] = None,
    status: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.macie.CfnSession =
    software.amazon.awscdk.services.macie.CfnSession.Builder
      .create(stackCtx, internalResourceId)
      .findingPublishingFrequency(findingPublishingFrequency.orNull)
      .status(status.orNull)
      .build()
}
