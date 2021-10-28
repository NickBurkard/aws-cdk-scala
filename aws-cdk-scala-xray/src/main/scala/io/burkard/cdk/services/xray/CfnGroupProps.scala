package io.burkard.cdk.services.xray

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
