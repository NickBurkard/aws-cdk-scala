package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnQuickConnectProps {

  def apply(
    name: Option[String] = None,
    quickConnectConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty] = None,
    instanceArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.connect.CfnQuickConnectProps =
    (new software.amazon.awscdk.services.connect.CfnQuickConnectProps.Builder)
      .name(name.orNull)
      .quickConnectConfig(quickConnectConfig.orNull)
      .instanceArn(instanceArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
