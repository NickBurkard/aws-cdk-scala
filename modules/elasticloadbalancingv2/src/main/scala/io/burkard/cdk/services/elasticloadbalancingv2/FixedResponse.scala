package io.burkard.cdk.services.elasticloadbalancingv2

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FixedResponse {

  def apply(
    statusCode: String,
    messageBody: Option[String] = None,
    contentType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ContentType] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponse =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponse.Builder)
      .statusCode(statusCode)
      .messageBody(messageBody.orNull)
      .contentType(contentType.orNull)
      .build()
}
