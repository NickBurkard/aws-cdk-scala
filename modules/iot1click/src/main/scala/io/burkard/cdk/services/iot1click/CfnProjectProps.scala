package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProjectProps {

  def apply(
    placementTemplate: software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty,
    projectName: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.iot1click.CfnProjectProps =
    (new software.amazon.awscdk.services.iot1click.CfnProjectProps.Builder)
      .placementTemplate(placementTemplate)
      .projectName(projectName.orNull)
      .description(description.orNull)
      .build()
}
