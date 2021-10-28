package io.burkard.cdk.services.ssm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMaintenanceWindowTargetProps {

  def apply(
    name: Option[String] = None,
    ownerInformation: Option[String] = None,
    windowId: Option[String] = None,
    targets: Option[List[_]] = None,
    description: Option[String] = None,
    resourceType: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps.Builder)
      .name(name.orNull)
      .ownerInformation(ownerInformation.orNull)
      .windowId(windowId.orNull)
      .targets(targets.map(_.asJava).orNull)
      .description(description.orNull)
      .resourceType(resourceType.orNull)
      .build()
}
