package io.burkard.cdk.services.amazonmq

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfiguration {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    data: Option[String] = None,
    authenticationStrategy: Option[String] = None,
    engineType: Option[String] = None,
    engineVersion: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amazonmq.CfnConfiguration =
    software.amazon.awscdk.services.amazonmq.CfnConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .data(data.orNull)
      .authenticationStrategy(authenticationStrategy.orNull)
      .engineType(engineType.orNull)
      .engineVersion(engineVersion.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
