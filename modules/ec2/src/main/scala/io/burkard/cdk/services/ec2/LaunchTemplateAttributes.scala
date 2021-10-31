package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateAttributes {

  def apply(
    versionNumber: Option[String] = None,
    launchTemplateId: Option[String] = None,
    launchTemplateName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.LaunchTemplateAttributes =
    (new software.amazon.awscdk.services.ec2.LaunchTemplateAttributes.Builder)
      .versionNumber(versionNumber.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .launchTemplateName(launchTemplateName.orNull)
      .build()
}
