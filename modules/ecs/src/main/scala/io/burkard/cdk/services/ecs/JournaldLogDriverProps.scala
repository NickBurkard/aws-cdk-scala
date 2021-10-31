package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JournaldLogDriverProps {

  def apply(
    tag: Option[String] = None,
    labels: Option[List[String]] = None,
    envRegex: Option[String] = None,
    env: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.JournaldLogDriverProps =
    (new software.amazon.awscdk.services.ecs.JournaldLogDriverProps.Builder)
      .tag(tag.orNull)
      .labels(labels.map(_.asJava).orNull)
      .envRegex(envRegex.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
