package io.burkard.cdk.services.ses


sealed abstract class EmailEncoding(val underlying: software.amazon.awscdk.services.ses.actions.EmailEncoding)
  extends Product
    with Serializable


object EmailEncoding {
  implicit def toAws(value: EmailEncoding): software.amazon.awscdk.services.ses.actions.EmailEncoding =
    Option(value).map(_.underlying).orNull

  case object Base64
    extends EmailEncoding(software.amazon.awscdk.services.ses.actions.EmailEncoding.BASE64)

  case object Utf8
    extends EmailEncoding(software.amazon.awscdk.services.ses.actions.EmailEncoding.UTF8)
}
