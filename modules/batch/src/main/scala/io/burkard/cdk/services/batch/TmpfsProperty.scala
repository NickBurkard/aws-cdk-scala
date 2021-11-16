package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TmpfsProperty {

  def apply(
    size: Number,
    containerPath: String,
    mountOptions: Option[List[String]] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.TmpfsProperty.Builder)
      .size(size)
      .containerPath(containerPath)
      .mountOptions(mountOptions.map(_.asJava).orNull)
      .build()
}
