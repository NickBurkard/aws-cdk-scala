package io.burkard.cdk.services.ses

sealed abstract class LambdaInvocationType(val underlying: software.amazon.awscdk.services.ses.actions.LambdaInvocationType)
  extends Product
    with Serializable

object LambdaInvocationType {
  implicit def toAws(value: LambdaInvocationType): software.amazon.awscdk.services.ses.actions.LambdaInvocationType =
    Option(value).map(_.underlying).orNull

  case object Event
    extends LambdaInvocationType(software.amazon.awscdk.services.ses.actions.LambdaInvocationType.EVENT)

  case object RequestResponse
    extends LambdaInvocationType(software.amazon.awscdk.services.ses.actions.LambdaInvocationType.REQUEST_RESPONSE)
}
