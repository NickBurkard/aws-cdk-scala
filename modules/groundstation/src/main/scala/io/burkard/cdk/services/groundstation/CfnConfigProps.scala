package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigProps {

  def apply(
    name: String,
    configData: software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfigProps =
    (new software.amazon.awscdk.services.groundstation.CfnConfigProps.Builder)
      .name(name)
      .configData(configData)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
