package io.burkard.cdk.services.dynamodb

sealed abstract class BillingMode(val underlying: software.amazon.awscdk.services.dynamodb.BillingMode)
  extends Product
    with Serializable

object BillingMode {
  implicit def toAws(value: BillingMode): software.amazon.awscdk.services.dynamodb.BillingMode =
    Option(value).map(_.underlying).orNull

  case object PayPerRequest
    extends BillingMode(software.amazon.awscdk.services.dynamodb.BillingMode.PAY_PER_REQUEST)

  case object Provisioned
    extends BillingMode(software.amazon.awscdk.services.dynamodb.BillingMode.PROVISIONED)
}
