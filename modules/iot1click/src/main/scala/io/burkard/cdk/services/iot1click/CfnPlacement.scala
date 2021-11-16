package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPlacement {

  def apply(
    internalResourceId: String,
    projectName: String,
    placementName: Option[String] = None,
    attributes: Option[AnyRef] = None,
    associatedDevices: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot1click.CfnPlacement =
    software.amazon.awscdk.services.iot1click.CfnPlacement.Builder
      .create(stackCtx, internalResourceId)
      .projectName(projectName)
      .placementName(placementName.orNull)
      .attributes(attributes.orNull)
      .associatedDevices(associatedDevices.orNull)
      .build()
}
