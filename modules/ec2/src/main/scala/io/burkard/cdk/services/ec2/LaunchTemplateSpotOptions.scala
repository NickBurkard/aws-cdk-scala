package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateSpotOptions {

  def apply(
    blockDuration: Option[software.amazon.awscdk.Duration] = None,
    interruptionBehavior: Option[software.amazon.awscdk.services.ec2.SpotInstanceInterruption] = None,
    validUntil: Option[software.amazon.awscdk.Expiration] = None,
    requestType: Option[software.amazon.awscdk.services.ec2.SpotRequestType] = None,
    maxPrice: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions =
    (new software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions.Builder)
      .blockDuration(blockDuration.orNull)
      .interruptionBehavior(interruptionBehavior.orNull)
      .validUntil(validUntil.orNull)
      .requestType(requestType.orNull)
      .maxPrice(maxPrice.orNull)
      .build()
}
