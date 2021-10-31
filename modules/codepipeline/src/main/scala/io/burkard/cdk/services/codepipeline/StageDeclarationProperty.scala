package io.burkard.cdk.services.codepipeline

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageDeclarationProperty {

  def apply(
    name: Option[String] = None,
    blockers: Option[List[_]] = None,
    actions: Option[List[_]] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.StageDeclarationProperty.Builder)
      .name(name.orNull)
      .blockers(blockers.map(_.asJava).orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
