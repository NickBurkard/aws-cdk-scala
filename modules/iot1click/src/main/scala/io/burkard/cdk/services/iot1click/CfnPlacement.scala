package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPlacement {

  def apply(
    internalResourceId: String,
    placementName: Option[String] = None,
    projectName: Option[String] = None,
    attributes: Option[AnyRef] = None,
    associatedDevices: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot1click.CfnPlacement =
    software.amazon.awscdk.services.iot1click.CfnPlacement.Builder
      .create(stackCtx, internalResourceId)
      .placementName(placementName.orNull)
      .projectName(projectName.orNull)
      .attributes(attributes.orNull)
      .associatedDevices(associatedDevices.orNull)
      .build()
}
