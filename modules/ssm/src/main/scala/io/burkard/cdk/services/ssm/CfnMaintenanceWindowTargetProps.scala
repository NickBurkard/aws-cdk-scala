package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
