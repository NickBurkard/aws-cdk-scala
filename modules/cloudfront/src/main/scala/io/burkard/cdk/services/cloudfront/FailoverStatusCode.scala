package io.burkard.cdk.services.cloudfront

sealed abstract class FailoverStatusCode(val underlying: software.amazon.awscdk.services.cloudfront.FailoverStatusCode)
  extends Product
    with Serializable

object FailoverStatusCode {
  implicit def toAws(value: FailoverStatusCode): software.amazon.awscdk.services.cloudfront.FailoverStatusCode =
    Option(value).map(_.underlying).orNull

  case object BadGateway
    extends FailoverStatusCode(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.BAD_GATEWAY)

  case object Forbidden
    extends FailoverStatusCode(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.FORBIDDEN)

  case object GatewayTimeout
    extends FailoverStatusCode(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.GATEWAY_TIMEOUT)

  case object InternalServerError
    extends FailoverStatusCode(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.INTERNAL_SERVER_ERROR)

  case object NotFound
    extends FailoverStatusCode(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.NOT_FOUND)

  case object ServiceUnavailable
    extends FailoverStatusCode(software.amazon.awscdk.services.cloudfront.FailoverStatusCode.SERVICE_UNAVAILABLE)
}
