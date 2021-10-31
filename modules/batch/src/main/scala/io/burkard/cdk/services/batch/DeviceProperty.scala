package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceProperty {

  def apply(
    hostPath: Option[String] = None,
    permissions: Option[List[String]] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.DeviceProperty.Builder)
      .hostPath(hostPath.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .containerPath(containerPath.orNull)
      .build()
}
