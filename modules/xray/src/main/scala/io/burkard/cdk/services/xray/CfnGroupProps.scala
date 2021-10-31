package io.burkard.cdk.services.xray

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGroupProps {

  def apply(
    tags: Option[List[_]] = None,
    groupName: Option[String] = None,
    insightsConfiguration: Option[software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty] = None,
    filterExpression: Option[String] = None
  ): software.amazon.awscdk.services.xray.CfnGroupProps =
    (new software.amazon.awscdk.services.xray.CfnGroupProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .groupName(groupName.orNull)
      .insightsConfiguration(insightsConfiguration.orNull)
      .filterExpression(filterExpression.orNull)
      .build()
}
