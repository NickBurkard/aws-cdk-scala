package io.burkard.cdk.services.macie

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
