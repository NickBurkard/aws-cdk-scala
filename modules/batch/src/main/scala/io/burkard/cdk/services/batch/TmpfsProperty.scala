package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
