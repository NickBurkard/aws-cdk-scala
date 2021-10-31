package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateElasticInferenceAcceleratorProperty {

  def apply(
    count: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.Builder)
      .count(count.orNull)
      .`type`(`type`.orNull)
      .build()
}
