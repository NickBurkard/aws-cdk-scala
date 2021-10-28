package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VCpuCountProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.VCpuCountProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
