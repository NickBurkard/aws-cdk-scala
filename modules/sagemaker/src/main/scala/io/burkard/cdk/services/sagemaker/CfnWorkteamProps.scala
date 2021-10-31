package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWorkteamProps {

  def apply(
    workteamName: Option[String] = None,
    notificationConfiguration: Option[software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty] = None,
    memberDefinitions: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnWorkteamProps =
    (new software.amazon.awscdk.services.sagemaker.CfnWorkteamProps.Builder)
      .workteamName(workteamName.orNull)
      .notificationConfiguration(notificationConfiguration.orNull)
      .memberDefinitions(memberDefinitions.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
