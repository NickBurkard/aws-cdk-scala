package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationAggregator {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    configurationAggregatorName: Option[String] = None,
    accountAggregationSources: Option[List[_]] = None,
    organizationAggregationSource: Option[software.amazon.awscdk.services.config.CfnConfigurationAggregator.OrganizationAggregationSourceProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnConfigurationAggregator =
    software.amazon.awscdk.services.config.CfnConfigurationAggregator.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .configurationAggregatorName(configurationAggregatorName.orNull)
      .accountAggregationSources(accountAggregationSources.map(_.asJava).orNull)
      .organizationAggregationSource(organizationAggregationSource.orNull)
      .build()
}
