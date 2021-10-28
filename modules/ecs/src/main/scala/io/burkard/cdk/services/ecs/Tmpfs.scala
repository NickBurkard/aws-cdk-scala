package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Tmpfs {

  def apply(
    mountOptions: Option[List[_ <: software.amazon.awscdk.services.ecs.TmpfsMountOption]] = None,
    size: Option[Number] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.Tmpfs =
    (new software.amazon.awscdk.services.ecs.Tmpfs.Builder)
      .mountOptions(mountOptions.map(_.asJava).orNull)
      .size(size.orNull)
      .containerPath(containerPath.orNull)
      .build()
}