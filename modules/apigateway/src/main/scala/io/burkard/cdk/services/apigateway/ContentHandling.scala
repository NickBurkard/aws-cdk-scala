package io.burkard.cdk.services.apigateway


sealed abstract class ContentHandling(val underlying: software.amazon.awscdk.services.apigateway.ContentHandling)
  extends Product
    with Serializable


object ContentHandling {
  implicit def toAws(value: ContentHandling): software.amazon.awscdk.services.apigateway.ContentHandling =
    Option(value).map(_.underlying).orNull

  case object ConvertToBinary
    extends ContentHandling(software.amazon.awscdk.services.apigateway.ContentHandling.CONVERT_TO_BINARY)

  case object ConvertToText
    extends ContentHandling(software.amazon.awscdk.services.apigateway.ContentHandling.CONVERT_TO_TEXT)
}
