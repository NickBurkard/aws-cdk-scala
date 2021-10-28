package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AcceleratorCountProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.AcceleratorCountProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
