package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProject {

  def apply(
    internalResourceId: String,
    placementTemplate: software.amazon.awscdk.services.iot1click.CfnProject.PlacementTemplateProperty,
    projectName: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot1click.CfnProject =
    software.amazon.awscdk.services.iot1click.CfnProject.Builder
      .create(stackCtx, internalResourceId)
      .placementTemplate(placementTemplate)
      .projectName(projectName.orNull)
      .description(description.orNull)
      .build()
}
