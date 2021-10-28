package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OrganizationAggregationSourceProperty {

  def apply(
    allAwsRegions: Option[Boolean] = None,
    awsRegions: Option[List[String]] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty =
    (new software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder)
      .allAwsRegions(allAwsRegions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .awsRegions(awsRegions.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .build()
}
