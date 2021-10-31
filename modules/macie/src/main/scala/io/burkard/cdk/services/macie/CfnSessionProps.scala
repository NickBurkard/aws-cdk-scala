package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSessionProps {

  def apply(
    findingPublishingFrequency: Option[String] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.macie.CfnSessionProps =
    (new software.amazon.awscdk.services.macie.CfnSessionProps.Builder)
      .findingPublishingFrequency(findingPublishingFrequency.orNull)
      .status(status.orNull)
      .build()
}
