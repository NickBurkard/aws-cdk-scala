package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotOptionsProperty {

  def apply(
    validUntil: Option[String] = None,
    blockDurationMinutes: Option[Number] = None,
    instanceInterruptionBehavior: Option[String] = None,
    maxPrice: Option[String] = None,
    spotInstanceType: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty.Builder)
      .validUntil(validUntil.orNull)
      .blockDurationMinutes(blockDurationMinutes.orNull)
      .instanceInterruptionBehavior(instanceInterruptionBehavior.orNull)
      .maxPrice(maxPrice.orNull)
      .spotInstanceType(spotInstanceType.orNull)
      .build()
}
