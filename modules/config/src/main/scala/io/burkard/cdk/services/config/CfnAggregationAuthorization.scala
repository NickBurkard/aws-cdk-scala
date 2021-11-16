package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAggregationAuthorization {

  def apply(
    internalResourceId: String,
    authorizedAccountId: String,
    authorizedAwsRegion: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnAggregationAuthorization =
    software.amazon.awscdk.services.config.CfnAggregationAuthorization.Builder
      .create(stackCtx, internalResourceId)
      .authorizedAccountId(authorizedAccountId)
      .authorizedAwsRegion(authorizedAwsRegion)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
