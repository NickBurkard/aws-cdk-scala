package io.burkard.cdk.services.codepipeline


sealed abstract class ActionCategory(val underlying: software.amazon.awscdk.services.codepipeline.ActionCategory)
  extends Product
    with Serializable


object ActionCategory {
  implicit def toAws(value: ActionCategory): software.amazon.awscdk.services.codepipeline.ActionCategory =
    Option(value).map(_.underlying).orNull

  case object Source
    extends ActionCategory(software.amazon.awscdk.services.codepipeline.ActionCategory.SOURCE)

  case object Build
    extends ActionCategory(software.amazon.awscdk.services.codepipeline.ActionCategory.BUILD)

  case object Test
    extends ActionCategory(software.amazon.awscdk.services.codepipeline.ActionCategory.TEST)

  case object Approval
    extends ActionCategory(software.amazon.awscdk.services.codepipeline.ActionCategory.APPROVAL)

  case object Deploy
    extends ActionCategory(software.amazon.awscdk.services.codepipeline.ActionCategory.DEPLOY)

  case object Invoke
    extends ActionCategory(software.amazon.awscdk.services.codepipeline.ActionCategory.INVOKE)
}
