package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
