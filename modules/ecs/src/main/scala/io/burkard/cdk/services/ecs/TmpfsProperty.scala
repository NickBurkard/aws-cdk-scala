package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TmpfsProperty {

  def apply(
    mountOptions: Option[List[String]] = None,
    size: Option[Number] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.TmpfsProperty.Builder)
      .mountOptions(mountOptions.map(_.asJava).orNull)
      .size(size.orNull)
      .containerPath(containerPath.orNull)
      .build()
}
