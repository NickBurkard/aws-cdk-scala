package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    projectName: Option[String] = None,
    description: Option[String] = None,
    placementTemplate: Option[software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot1click.CfnProject =
    software.amazon.awscdk.services.iot1click.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName.orNull)
      .description(description.orNull)
      .placementTemplate(placementTemplate.orNull)
      .build()
}
