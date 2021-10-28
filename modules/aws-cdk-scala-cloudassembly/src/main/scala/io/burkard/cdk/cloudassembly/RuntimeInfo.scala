package io.burkard.cdk.cloudassembly

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuntimeInfo {

  def apply(
    libraries: Option[Map[String, String]] = None
  ): software.amazon.awscdk.cloudassembly.schema.RuntimeInfo =
    (new software.amazon.awscdk.cloudassembly.schema.RuntimeInfo.Builder)
      .libraries(libraries.map(_.asJava).orNull)
      .build()
}
