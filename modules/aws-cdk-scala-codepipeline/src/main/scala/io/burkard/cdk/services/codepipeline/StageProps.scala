package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StageProps {

  def apply(
    stageName: Option[String] = None,
    actions: Option[List[_ <: software.amazon.awscdk.services.codepipeline.IAction]] = None
  ): software.amazon.awscdk.services.codepipeline.StageProps =
    (new software.amazon.awscdk.services.codepipeline.StageProps.Builder)
      .stageName(stageName.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
