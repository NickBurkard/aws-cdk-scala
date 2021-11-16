package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageProps {

  def apply(
    stageName: String,
    actions: Option[List[_ <: software.amazon.awscdk.services.codepipeline.IAction]] = None
  ): software.amazon.awscdk.services.codepipeline.StageProps =
    (new software.amazon.awscdk.services.codepipeline.StageProps.Builder)
      .stageName(stageName)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
