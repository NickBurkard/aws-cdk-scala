package io.burkard.cdk.services.amazonmq

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfiguration {

  def apply(
    internalResourceId: String,
    name: String,
    data: String,
    engineType: String,
    engineVersion: String,
    authenticationStrategy: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amazonmq.CfnConfiguration =
    software.amazon.awscdk.services.amazonmq.CfnConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .data(data)
      .engineType(engineType)
      .engineVersion(engineVersion)
      .authenticationStrategy(authenticationStrategy.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
