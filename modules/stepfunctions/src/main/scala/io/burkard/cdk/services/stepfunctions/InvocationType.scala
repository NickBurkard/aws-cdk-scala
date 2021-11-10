package io.burkard.cdk.services.stepfunctions

@scala.annotation.nowarn("cat=deprecation")
sealed abstract class InvocationType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.InvocationType)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object InvocationType {
  implicit def toAws(value: InvocationType): software.amazon.awscdk.services.stepfunctions.tasks.InvocationType =
    Option(value).map(_.underlying).orNull

  case object RequestResponse
    extends InvocationType(software.amazon.awscdk.services.stepfunctions.tasks.InvocationType.REQUEST_RESPONSE)

  case object Event
    extends InvocationType(software.amazon.awscdk.services.stepfunctions.tasks.InvocationType.EVENT)

  case object DryRun
    extends InvocationType(software.amazon.awscdk.services.stepfunctions.tasks.InvocationType.DRY_RUN)
}
