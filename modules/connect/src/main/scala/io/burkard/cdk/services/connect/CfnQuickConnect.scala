package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQuickConnect {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    quickConnectConfig: Option[software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty] = None,
    instanceArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.connect.CfnQuickConnect =
    software.amazon.awscdk.services.connect.CfnQuickConnect.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .quickConnectConfig(quickConnectConfig.orNull)
      .instanceArn(instanceArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
