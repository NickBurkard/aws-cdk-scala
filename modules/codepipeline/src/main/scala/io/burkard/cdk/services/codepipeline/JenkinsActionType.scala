package io.burkard.cdk.services.codepipeline

sealed abstract class JenkinsActionType(val underlying: software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType)
  extends Product
    with Serializable

object JenkinsActionType {
  implicit def toAws(value: JenkinsActionType): software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType =
    Option(value).map(_.underlying).orNull

  case object Build
    extends JenkinsActionType(software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType.BUILD)

  case object Test
    extends JenkinsActionType(software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType.TEST)
}
