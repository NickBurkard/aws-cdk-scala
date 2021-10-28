package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPlacementProps {

  def apply(
    placementName: Option[String] = None,
    projectName: Option[String] = None,
    attributes: Option[AnyRef] = None,
    associatedDevices: Option[AnyRef] = None
  ): software.amazon.awscdk.services.iot1click.CfnPlacementProps =
    (new software.amazon.awscdk.services.iot1click.CfnPlacementProps.Builder)
      .placementName(placementName.orNull)
      .projectName(projectName.orNull)
      .attributes(attributes.orNull)
      .associatedDevices(associatedDevices.orNull)
      .build()
}
