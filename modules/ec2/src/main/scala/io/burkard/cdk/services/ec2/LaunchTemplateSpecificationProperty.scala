package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateSpecificationProperty {

  def apply(
    version: String,
    launchTemplateName: Option[String] = None,
    launchTemplateId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.LaunchTemplateSpecificationProperty.Builder)
      .version(version)
      .launchTemplateName(launchTemplateName.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .build()
}
