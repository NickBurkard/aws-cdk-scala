package io.burkard.cdk.services.sagemaker

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
