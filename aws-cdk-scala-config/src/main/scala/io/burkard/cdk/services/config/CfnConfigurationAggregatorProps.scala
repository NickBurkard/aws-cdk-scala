package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationAggregatorProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configurationAggregatorName: Option[String] = None,
    accountAggregationSources: Option[List[_]] = None,
    organizationAggregationSource: Option[software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty] = None
  ): software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps =
    (new software.amazon.awscdk.services.config.CfnConfigurationAggregatorProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .configurationAggregatorName(configurationAggregatorName.orNull)
      .accountAggregationSources(accountAggregationSources.map(_.asJava).orNull)
      .organizationAggregationSource(organizationAggregationSource.orNull)
      .build()
}
