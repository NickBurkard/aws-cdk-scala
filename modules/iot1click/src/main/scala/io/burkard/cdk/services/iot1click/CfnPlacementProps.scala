package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPlacementProps {

  def apply(
    projectName: String,
    placementName: Option[String] = None,
    attributes: Option[AnyRef] = None,
    associatedDevices: Option[AnyRef] = None
  ): software.amazon.awscdk.services.iot1click.CfnPlacementProps =
    (new software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder)
      .projectName(projectName)
      .placementName(placementName.orNull)
      .attributes(attributes.orNull)
      .associatedDevices(associatedDevices.orNull)
      .build()
}
