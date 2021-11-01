package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateRequireImdsv2Aspect {

  def apply(
    suppressWarnings: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect =
    software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2Aspect.Builder
      .create()
      .suppressWarnings(suppressWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
