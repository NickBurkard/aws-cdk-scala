package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAggregationAuthorizationProps {

  def apply(
    authorizedAccountId: String,
    authorizedAwsRegion: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps =
    (new software.amazon.awscdk.services.config.CfnAggregationAuthorizationProps.Builder)
      .authorizedAccountId(authorizedAccountId)
      .authorizedAwsRegion(authorizedAwsRegion)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
