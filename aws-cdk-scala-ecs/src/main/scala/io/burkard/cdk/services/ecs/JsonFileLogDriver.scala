package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonFileLogDriver {

  def apply(
    maxFile: Option[Number] = None,
    tag: Option[String] = None,
    labels: Option[List[String]] = None,
    compress: Option[Boolean] = None,
    envRegex: Option[String] = None,
    maxSize: Option[String] = None,
    env: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.JsonFileLogDriver =
    software.amazon.awscdk.services.ecs.JsonFileLogDriver.Builder
      .create()
      .maxFile(maxFile.orNull)
      .tag(tag.orNull)
      .labels(labels.map(_.asJava).orNull)
      .compress(compress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .envRegex(envRegex.orNull)
      .maxSize(maxSize.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
