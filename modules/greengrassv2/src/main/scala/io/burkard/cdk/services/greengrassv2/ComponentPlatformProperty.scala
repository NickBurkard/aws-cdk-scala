package io.burkard.cdk.services.greengrassv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
