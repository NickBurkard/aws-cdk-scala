package io.burkard.cdk.services.lambda

sealed abstract class Charset(val underlying: software.amazon.awscdk.services.lambda.nodejs.Charset)
  extends Product
    with Serializable

object Charset {
  implicit def toAws(value: Charset): software.amazon.awscdk.services.lambda.nodejs.Charset =
    Option(value).map(_.underlying).orNull

  case object Ascii
    extends Charset(software.amazon.awscdk.services.lambda.nodejs.Charset.ASCII)

  case object Utf8
    extends Charset(software.amazon.awscdk.services.lambda.nodejs.Charset.UTF8)
}
