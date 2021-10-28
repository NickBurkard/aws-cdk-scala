package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FleetLaunchTemplateSpecificationProperty {

  def apply(
    launchTemplateName: Option[String] = None,
    launchTemplateId: Option[String] = None,
    version: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder)
      .launchTemplateName(launchTemplateName.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .version(version.orNull)
      .build()
}
