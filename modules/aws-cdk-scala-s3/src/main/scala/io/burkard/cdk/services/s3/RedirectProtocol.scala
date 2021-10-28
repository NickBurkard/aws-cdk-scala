package io.burkard.cdk.services.s3

sealed abstract class RedirectProtocol(val underlying: software.amazon.awscdk.services.s3.RedirectProtocol)
  extends Product
    with Serializable

object RedirectProtocol {
  implicit def toAws(value: RedirectProtocol): software.amazon.awscdk.services.s3.RedirectProtocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends RedirectProtocol(software.amazon.awscdk.services.s3.RedirectProtocol.HTTP)

  case object Https
    extends RedirectProtocol(software.amazon.awscdk.services.s3.RedirectProtocol.HTTPS)
}
