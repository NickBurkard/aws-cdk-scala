package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProjectProps {

  def apply(
    projectName: Option[String] = None,
    description: Option[String] = None,
    placementTemplate: Option[software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty] = None
  ): software.amazon.awscdk.services.iot1click.CfnProjectProps =
    (new software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder)
      .projectName(projectName.orNull)
      .description(description.orNull)
      .placementTemplate(placementTemplate.orNull)
      .build()
}
