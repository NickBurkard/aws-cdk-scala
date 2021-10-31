package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfig {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configData: Option[software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.groundstation.CfnConfig =
    software.amazon.awscdk.services.groundstation.CfnConfig.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .configData(configData.orNull)
      .build()
}
