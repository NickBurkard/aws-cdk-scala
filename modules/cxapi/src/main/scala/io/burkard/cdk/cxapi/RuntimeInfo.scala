package io.burkard.cdk.cxapi

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuntimeInfo {

  def apply(
    libraries: Option[Map[String, String]] = None
  ): software.amazon.awscdk.cxapi.RuntimeInfo =
    (new software.amazon.awscdk.cxapi.RuntimeInfo.Builder)
      .libraries(libraries.map(_.asJava).orNull)
      .build()
}
