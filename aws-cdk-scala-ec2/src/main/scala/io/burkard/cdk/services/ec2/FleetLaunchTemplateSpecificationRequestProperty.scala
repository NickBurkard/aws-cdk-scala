package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FleetLaunchTemplateSpecificationRequestProperty {

  def apply(
    launchTemplateName: Option[String] = None,
    launchTemplateId: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty.Builder)
      .launchTemplateName(launchTemplateName.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .version(version.orNull)
      .build()
}
