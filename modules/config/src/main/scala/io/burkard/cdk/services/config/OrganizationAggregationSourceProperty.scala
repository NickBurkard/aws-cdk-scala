package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OrganizationAggregationSourceProperty {

  def apply(
    roleArn: String,
    allAwsRegions: Option[Boolean] = None,
    awsRegions: Option[List[String]] = None
  ): software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty =
    (new software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty.Builder)
      .roleArn(roleArn)
      .allAwsRegions(allAwsRegions.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .awsRegions(awsRegions.map(_.asJava).orNull)
      .build()
}
