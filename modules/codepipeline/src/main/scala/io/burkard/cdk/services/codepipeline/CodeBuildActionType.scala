package io.burkard.cdk.services.codepipeline


sealed abstract class CodeBuildActionType(val underlying: software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType)
  extends Product
    with Serializable


object CodeBuildActionType {
  implicit def toAws(value: CodeBuildActionType): software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType =
    Option(value).map(_.underlying).orNull

  case object Build
    extends CodeBuildActionType(software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType.BUILD)

  case object Test
    extends CodeBuildActionType(software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType.TEST)
}
