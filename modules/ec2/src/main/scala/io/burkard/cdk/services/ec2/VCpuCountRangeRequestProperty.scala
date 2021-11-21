package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VCpuCountRangeRequestProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.VCpuCountRangeRequestProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
