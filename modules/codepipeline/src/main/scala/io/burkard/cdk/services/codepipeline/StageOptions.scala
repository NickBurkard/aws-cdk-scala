package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StageOptions {

  def apply(
    actions: Option[List[_ <: software.amazon.awscdk.services.codepipeline.IAction]] = None,
    placement: Option[software.amazon.awscdk.services.codepipeline.StagePlacement] = None,
    stageName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.StageOptions =
    (new software.amazon.awscdk.services.codepipeline.StageOptions.Builder)
      .actions(actions.map(_.asJava).orNull)
      .placement(placement.orNull)
      .stageName(stageName.orNull)
      .build()
}