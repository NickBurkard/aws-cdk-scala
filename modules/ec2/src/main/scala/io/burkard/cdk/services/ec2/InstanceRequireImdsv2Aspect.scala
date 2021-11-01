package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceRequireImdsv2Aspect {

  def apply(
    suppressLaunchTemplateWarning: Option[Boolean] = None,
    suppressWarnings: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect =
    software.amazon.awscdk.services.ec2.InstanceRequireImdsv2Aspect.Builder
      .create()
      .suppressLaunchTemplateWarning(suppressLaunchTemplateWarning.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .suppressWarnings(suppressWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
