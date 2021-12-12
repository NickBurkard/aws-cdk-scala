package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FixedResponseConfigProperty {

  def apply(
    statusCode: String,
    messageBody: Option[String] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener.FixedResponseConfigProperty.Builder)
      .statusCode(statusCode)
      .messageBody(messageBody.orNull)
      .contentType(contentType.orNull)
      .build()
}
