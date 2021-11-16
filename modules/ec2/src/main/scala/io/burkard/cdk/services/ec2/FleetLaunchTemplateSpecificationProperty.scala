package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FleetLaunchTemplateSpecificationProperty {

  def apply(
    version: String,
    launchTemplateName: Option[String] = None,
    launchTemplateId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.FleetLaunchTemplateSpecificationProperty.Builder)
      .version(version)
      .launchTemplateName(launchTemplateName.orNull)
      .launchTemplateId(launchTemplateId.orNull)
      .build()
}
