package io.burkard.cdk.services.codepipeline

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
