package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MemoryMiBProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.MemoryMiBProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
