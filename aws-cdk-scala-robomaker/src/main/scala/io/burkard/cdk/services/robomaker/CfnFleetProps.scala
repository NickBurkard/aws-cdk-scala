package io.burkard.cdk.services.robomaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFleetProps {

  def apply(
    name: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.robomaker.CfnFleetProps =
    (new software.amazon.awscdk.services.robomaker.CfnFleetProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
