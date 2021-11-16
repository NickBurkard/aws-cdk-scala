package io.burkard.cdk.services.groundstation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfig {

  def apply(
    internalResourceId: String,
    name: String,
    configData: software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.groundstation.CfnConfig =
    software.amazon.awscdk.services.groundstation.CfnConfig.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .configData(configData)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
