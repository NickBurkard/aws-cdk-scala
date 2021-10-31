package io.burkard.cdk.services.greengrassv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComponentPlatformProperty {

  def apply(
    name: Option[String] = None,
    attributes: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty.Builder)
      .name(name.orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .build()
}
