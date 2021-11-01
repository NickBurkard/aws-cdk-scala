package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceRequireImdsv2AspectProps {

  def apply(
    suppressLaunchTemplateWarning: Option[Boolean] = None,
    suppressWarnings: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps =
    (new software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps.Builder)
      .suppressLaunchTemplateWarning(suppressLaunchTemplateWarning.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .suppressWarnings(suppressWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
