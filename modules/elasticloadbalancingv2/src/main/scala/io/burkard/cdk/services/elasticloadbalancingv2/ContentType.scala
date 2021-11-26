package io.burkard.cdk.services.elasticloadbalancingv2

@scala.annotation.nowarn("cat=deprecation")
sealed abstract class ContentType(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.ContentType)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object ContentType {
  implicit def toAws(value: ContentType): software.amazon.awscdk.services.elasticloadbalancingv2.ContentType =
    Option(value).map(_.underlying).orNull

  case object ApplicationJavascript
    extends ContentType(software.amazon.awscdk.services.elasticloadbalancingv2.ContentType.APPLICATION_JAVASCRIPT)

  case object ApplicationJson
    extends ContentType(software.amazon.awscdk.services.elasticloadbalancingv2.ContentType.APPLICATION_JSON)

  case object TextCss
    extends ContentType(software.amazon.awscdk.services.elasticloadbalancingv2.ContentType.TEXT_CSS)

  case object TextHtml
    extends ContentType(software.amazon.awscdk.services.elasticloadbalancingv2.ContentType.TEXT_HTML)

  case object TextPlain
    extends ContentType(software.amazon.awscdk.services.elasticloadbalancingv2.ContentType.TEXT_PLAIN)
}
