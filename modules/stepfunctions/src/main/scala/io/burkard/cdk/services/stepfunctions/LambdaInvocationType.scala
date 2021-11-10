package io.burkard.cdk.services.stepfunctions


sealed abstract class LambdaInvocationType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType)
  extends Product
    with Serializable


object LambdaInvocationType {
  implicit def toAws(value: LambdaInvocationType): software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType =
    Option(value).map(_.underlying).orNull

  case object RequestResponse
    extends LambdaInvocationType(software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.REQUEST_RESPONSE)

  case object Event
    extends LambdaInvocationType(software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.EVENT)

  case object DryRun
    extends LambdaInvocationType(software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.DRY_RUN)
}
