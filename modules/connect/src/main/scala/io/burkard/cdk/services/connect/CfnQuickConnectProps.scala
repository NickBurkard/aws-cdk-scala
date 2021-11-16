package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQuickConnectProps {

  def apply(
    name: String,
    quickConnectConfig: software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty,
    instanceArn: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.connect.CfnQuickConnectProps =
    (new software.amazon.awscdk.services.connect.CfnQuickConnectProps.Builder)
      .name(name)
      .quickConnectConfig(quickConnectConfig)
      .instanceArn(instanceArn)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
