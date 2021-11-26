package io.burkard.cdk.services.sns

sealed abstract class SubscriptionProtocol(val underlying: software.amazon.awscdk.services.sns.SubscriptionProtocol)
  extends Product
    with Serializable

object SubscriptionProtocol {
  implicit def toAws(value: SubscriptionProtocol): software.amazon.awscdk.services.sns.SubscriptionProtocol =
    Option(value).map(_.underlying).orNull

  case object Application
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.APPLICATION)

  case object Email
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.EMAIL)

  case object EmailJson
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.EMAIL_JSON)

  case object Firehose
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.FIREHOSE)

  case object Http
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.HTTP)

  case object Https
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.HTTPS)

  case object Lambda
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.LAMBDA)

  case object Sms
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.SMS)

  case object Sqs
    extends SubscriptionProtocol(software.amazon.awscdk.services.sns.SubscriptionProtocol.SQS)
}
