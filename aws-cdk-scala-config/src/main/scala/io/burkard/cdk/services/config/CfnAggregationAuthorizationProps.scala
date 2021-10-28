package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAggregationAuthorizationProps {

  def apply(
    authorizedAccountId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    authorizedAwsRegion: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps =
    (new software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder)
      .authorizedAccountId(authorizedAccountId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .authorizedAwsRegion(authorizedAwsRegion.orNull)
      .build()
}
