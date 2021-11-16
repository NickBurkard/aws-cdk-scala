package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuntimeInfo {

  def apply(
    libraries: Map[String, String]
  ): software.amazon.awscdk.cloudassembly.schema.RuntimeInfo =
    (new software.amazon.awscdk.cloudassembly.schema.RuntimeInfo.Builder)
      .libraries(libraries.asJava)
      .build()
}
