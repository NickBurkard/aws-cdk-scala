package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAggregationAuthorization {

  def apply(
    internalResourceId: String,
    authorizedAccountId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    authorizedAwsRegion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnAggregationAuthorization =
    software.amazon.awscdk.services.config.CfnAggregationAuthorization.Builder
      .create(stackCtx, internalResourceId)
      .authorizedAccountId(authorizedAccountId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .authorizedAwsRegion(authorizedAwsRegion.orNull)
      .build()
}
