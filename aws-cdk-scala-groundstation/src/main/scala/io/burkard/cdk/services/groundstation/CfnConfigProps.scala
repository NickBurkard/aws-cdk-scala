package io.burkard.cdk.services.groundstation

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configData: Option[software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfigProps =
    (new software.amazon.awscdk.services.groundstation.CfnConfigProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .configData(configData.orNull)
      .build()
}
