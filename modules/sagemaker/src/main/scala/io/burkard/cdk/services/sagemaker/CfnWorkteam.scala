package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWorkteam {

  def apply(
    internalResourceId: String,
    workteamName: Option[String] = None,
    notificationConfiguration: Option[software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty] = None,
    memberDefinitions: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnWorkteam =
    software.amazon.awscdk.services.sagemaker.CfnWorkteam.Builder
      .create(stackCtx, internalResourceId)
      .workteamName(workteamName.orNull)
      .notificationConfiguration(notificationConfiguration.orNull)
      .memberDefinitions(memberDefinitions.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
