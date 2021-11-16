package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMaintenanceWindowTargetProps {

  def apply(
    windowId: String,
    targets: List[_],
    resourceType: String,
    name: Option[String] = None,
    ownerInformation: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps.Builder)
      .windowId(windowId)
      .targets(targets.asJava)
      .resourceType(resourceType)
      .name(name.orNull)
      .ownerInformation(ownerInformation.orNull)
      .description(description.orNull)
      .build()
}
