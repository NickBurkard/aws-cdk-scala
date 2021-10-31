package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsLaunchTargetConfig {

  def apply(
    parameters: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EcsLaunchTargetConfig.Builder)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
