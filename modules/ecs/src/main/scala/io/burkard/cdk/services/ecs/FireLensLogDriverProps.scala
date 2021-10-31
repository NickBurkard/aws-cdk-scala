package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FireLensLogDriverProps {

  def apply(
    tag: Option[String] = None,
    secretOptions: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    options: Option[Map[String, String]] = None,
    labels: Option[List[String]] = None,
    envRegex: Option[String] = None,
    env: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.FireLensLogDriverProps =
    (new software.amazon.awscdk.services.ecs.FireLensLogDriverProps.Builder)
      .tag(tag.orNull)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .options(options.map(_.asJava).orNull)
      .labels(labels.map(_.asJava).orNull)
      .envRegex(envRegex.orNull)
      .env(env.map(_.asJava).orNull)
      .build()
}
