package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccountAggregationSourceProperty {

  def apply(
    allAwsRegions: Option[Boolean] = None,
    awsRegions: Option[List[String]] = None,
    accountIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty =
    (new software.amazon.awscdk.services.config.CfnConfigurationAggregator.AccountAggregationSourceProperty.Builder)
      .allAwsRegions(allAwsRegions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .awsRegions(awsRegions.map(_.asJava).orNull)
      .accountIds(accountIds.map(_.asJava).orNull)
      .build()
}
