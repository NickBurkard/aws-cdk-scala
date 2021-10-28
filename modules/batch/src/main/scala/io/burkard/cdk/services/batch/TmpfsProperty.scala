package io.burkard.cdk.services.batch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TmpfsProperty {

  def apply(
    mountOptions: Option[List[String]] = None,
    size: Option[Number] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty.Builder)
      .mountOptions(mountOptions.map(_.asJava).orNull)
      .size(size.orNull)
      .containerPath(containerPath.orNull)
      .build()
}
